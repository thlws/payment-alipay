package org.thlws.payment.alipay.core;

import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConstants;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.trade.model.ExtendParams;
import com.alipay.trade.model.builder.*;
import com.alipay.trade.model.result.*;
import com.alipay.trade.service.AlipayTradeService;
import com.alipay.trade.service.impl.AlipayTradeServiceImpl;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.lang.StringUtils;

import org.thlws.payment.alipay.entity.request.*;
import org.thlws.payment.alipay.entity.response.*;
import org.thlws.payment.alipay.utils.JsonUtil;

/**
 * 支付宝支付核心处理入口,封装支付常用API，包括当面付、新版网页支付、退款操作、订单查询;
 * 使用任何方法前,需先行设置ClientBuilder中核心参数,并调用build方法初始化.<br>
 * https://docs.open.alipay.com/api
 *
 * <pre>
 *  AlipayCore.ClientBuilder clientBuilder = new AlipayCore.ClientBuilder();
 *  AlipayCore alipayCore = clientBuilder.setAlipay_public_key("xxx").setApp_id("xxx").setPrivate_key("xxx").build();
 *  alipayCore.pay_in_h5(request);
 *  alipayCore.pay(request);
 *  alipayCore.query(outTradeNo);
 *  alipayCore.refund(request);
 * </pre>
 * Created by HanleyTang on 2017/3/3.
 */
public class AlipayCore {

    /**
     * 支付交易核心服务,调用API前,调用前API前先行初始化
     */
    private AlipayTradeService tradeService;

    /**
     * 支付宝核心参数构件器,调用前API前先行初始化
     */
    private ClientBuilder builder;

    /**
     * Instantiates a new Alipay core.
     */
    public AlipayCore() {
    }

    /***
     * 参数构件第三步,初始化 tradeService,builder
     * @param builder the builder
     */
    public AlipayCore(ClientBuilder builder) {

        if (StringUtils.isEmpty(builder.getApp_id()))
            throw new NullPointerException("appid should not be NULL!");
        if (StringUtils.isEmpty(builder.getPrivate_key()))
            throw new NullPointerException("private should not be NULL!");
        this.builder = builder;
        AlipayTradeServiceImpl.ClientBuilder alipayTradebuilder = new AlipayTradeServiceImpl.ClientBuilder();
        alipayTradebuilder.setAlipayPublicKey(builder.getAlipay_public_key());
        alipayTradebuilder.setAppid(builder.getApp_id());
        alipayTradebuilder.setCharset("utf-8");
        alipayTradebuilder.setFormat("json");
        alipayTradebuilder.setGatewayUrl("https://openapi.alipay.com/gateway.do");
        alipayTradebuilder.setPrivateKey(builder.getPrivate_key());
        alipayTradebuilder.setSignType(builder.getSign_type());
        tradeService = alipayTradebuilder.build();
    }

    /***
     * 参数构件Class,参数构件第一步,请完成所有参数设置后调用build 方法.
     */
    public static class ClientBuilder {
        private String private_key;//商户私钥
        private String alipay_public_key;//支付宝公钥
        private String app_id;//支付宝应用ID
        private String sign_type;

        /***
         * 参数构件第二步,构件supper class instance.
         * Modified by Hanley
         * @return alipay core
         */
        public AlipayCore build() {



            if (StringUtils.isEmpty(app_id))
                throw new NullPointerException("please set appid first!");
            if (StringUtils.isEmpty(private_key))
                throw new NullPointerException("please set private_key first!");
            if (StringUtils.isEmpty(sign_type)){
                throw new NullPointerException("please set sign_type first!");
            }else{
                if(sign_type.equalsIgnoreCase(AlipayConstants.SIGN_TYPE_RSA2) && StringUtils.isEmpty(alipay_public_key)){
                    throw new NullPointerException("please set alipay_public_key first,when the sign_type is RSA2!");
                }
            }

            if (StringUtils.isEmpty(alipay_public_key) && sign_type.equalsIgnoreCase(AlipayConstants.SIGN_TYPE_RSA2))
                throw new NullPointerException("please set alipay_public_key first,when you using RSA2");


            return new AlipayCore(this);
        }

        /**
         * Sets private key.
         *
         * @param private_key the private key
         * @return the private key
         */
        public ClientBuilder setPrivate_key(String private_key) {
            this.private_key = private_key;
            return this;
        }

        /**
         * Sets alipay public key.
         *
         * @param alipay_public_key the alipay public key
         * @return the alipay public key
         */
        public ClientBuilder setAlipay_public_key(String alipay_public_key) {
            this.alipay_public_key = alipay_public_key;
            return this;
        }

        /**
         * Sets app id.
         *
         * @param app_id the app id
         * @return the app id
         */
        public ClientBuilder setApp_id(String app_id) {
            this.app_id = app_id;
            return this;
        }

        /**
         * Gets private key.
         *
         * @return the private key
         */
        public String getPrivate_key() {
            return private_key;
        }

        /**
         * Gets alipay public key.
         *
         * @return the alipay public key
         */
        public String getAlipay_public_key() {
            return alipay_public_key;
        }

        /**
         * Gets app id.
         *
         * @return the app id
         */
        public String getApp_id() {
            return app_id;
        }

        /**
         * Gets sign type.
         *
         * @return the sign type
         */
        public String getSign_type() {
            return sign_type;
        }

        /**
         * Sets sign type.
         *
         * @param sign_type the sign type
         * @return the sign type
         */
        public ClientBuilder setSign_type(String sign_type) {
            this.sign_type = sign_type;
            return this;
        }
    }


    /***
     * 支付宝手机网页支付,支付宝新接口,在手机上可直接调用支付宝APP完成支付宝(有安装支付宝APP情况)<br>
     * @see <a href="https://docs.open.alipay.com/203/105285">https://docs.open.alipay.com/203/105285</a>
     * @see <a href="https://docs.open.alipay.com/203/105286">https://docs.open.alipay.com/203/105286</a>
     * @param request the request 新版网页支付参数
     * @return string 支付宝产生用于网页支付的html.
     * @throws Exception the exception
     */
    public String pay_in_h5(AlipayH5Request request) throws Exception{

        System.out.println("pay_in_h5 request=\n" + request.toString());
        String form = "<font style='color: red'>请求支付宝超时,请稍后再试!</font>";

        try {
            if (null == builder)
                throw new Exception("Please set AlipayCore.ClientBuider first.");
            String biz_content = JsonUtil.beanToJsontring(request.getBizContent());
            AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
                    builder.getApp_id(), builder.getPrivate_key(), "json", "utf-8", builder.getAlipay_public_key());
            AlipayTradeWapPayRequest alipayRequest = new AlipayTradeWapPayRequest();// 创建API对应的request
            alipayRequest.setReturnUrl(request.getReturn_url());
            alipayRequest.setNotifyUrl(request.getNotify_url());// 在公共参数中设置回跳和通知地址
            alipayRequest.setBizContent(biz_content);// 填充业务参数
            form = alipayClient.pageExecute(alipayRequest).getBody(); // 调用SDK生成表单
        } catch (Exception e) {
            System.err.println("支付宝网页支付数据产生失败:" + e.getMessage());
            throw e;
        } finally {
            System.out.println("pay_in_h5 response=\n" + form);
        }

        return form;
    }

    /***
     * 支付宝电脑网站支付，该操作会跳转到支付宝的支付页面中完成支付动作，以 异步/同步 的形式告知支付结果
     * @param request 支付参数对象
     * @return 返回支付宝页面,直接输出在页面中
     * @throws Exception 程序异常
     */
    public String pay_in_pc(AlipayWebRequest request) throws Exception{

        System.out.println("pay_in_pc request=\n" + request.toString());
        String form = "<font style='color: red'>请求支付宝超时,请稍后再试!</font>";

        try {
            if (null == builder)
                throw new Exception("Please set AlipayCore.ClientBuider first.");
            String biz_content = JsonUtil.beanToJsontring(request.getBizContent());
            AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
                    builder.getApp_id(), builder.getPrivate_key(), "json", "utf-8", builder.getAlipay_public_key());
            AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();// 创建API对应的request
            alipayRequest.setReturnUrl(request.getReturn_url());
            alipayRequest.setNotifyUrl(request.getNotify_url());// 在公共参数中设置回跳和通知地址
            alipayRequest.setBizContent(biz_content);// 填充业务参数
            form = alipayClient.pageExecute(alipayRequest).getBody(); // 调用SDK生成表单
        } catch (Exception e) {
            System.err.println("支付宝网站支付数据产生失败:" + e.getMessage());
            throw e;
        } finally {
            System.out.println("pay_in_pc response=\n" + form);
        }

        return form;
    }


    /**
     * 当面付.扫码支付，指用户打开支付宝钱包中的“扫一扫”功能，扫描商户针对每个订单实时生成的订单二维码，并在手机端确认支付。
     * 收银员通过收银台或商户后台调用支付宝接口，生成二维码后，展示给用户，由用户扫描二维码完成订单支付。
     *
     * @see <a href="https://docs.open.alipay.com/194/105170">https://docs.open.alipay.com/194/105170</a>
     *
     * @param request the request 扫码支付所需参数
     * @return the alipay qrcode response 扫码支付结果
     * @throws Exception the exception
     */
    public AlipayQrcodeResponse precreate(AlipayQrcodeRequest request) throws Exception{

        System.out.println("precreate request=\n" + request.toString());
        AlipayQrcodeResponse response = new AlipayQrcodeResponse();

        try {
            if (null == tradeService)
                throw new Exception("Please set AlipayCore.ClientBuider first and call build().");

            // 业务扩展参数，目前可添加由支付宝分配的系统商编号(通过setSysServiceProviderId方法)，详情请咨询支付宝技术支持
            ExtendParams extendParams = new ExtendParams();
            extendParams.setSysServiceProviderId("2088100200300400500");

            // 创建扫码支付请求builder，设置请求参数
            AlipayTradePrecreateRequestBuilder builder = new AlipayTradePrecreateRequestBuilder()
                    .setSubject(request.getSubject())
                    .setTotalAmount(request.getTotalAmount())
                    .setOutTradeNo(request.getOutTradeNo())
                    .setUndiscountableAmount(request.getUndiscountableAmount())
                    .setSellerId(request.getSellerId())
                    .setBody(request.getBody())
                    .setOperatorId(request.getOperatorId())
                    .setStoreId(request.getStoreId())
                    .setExtendParams(extendParams);

            AlipayF2FPrecreateResult result = tradeService.tradePrecreate(builder);
            response.setSuccess(result.isTradeSuccess());

            switch (result.getTradeStatus()) {
                case SUCCESS:
                    response.setDesc("支付宝预下单成功");
                    response.setOutTradeNo(result.getResponse().getOutTradeNo());
                    response.setQrCode(result.getResponse().getQrCode());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                case FAILED:
                    response.setDesc("支付宝预下单失败!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                case UNKNOWN:
                   response.setDesc("系统异常，预下单状态未知!");
                   response.setSubCode(result.getResponse().getSubCode());
                   response.setSubMsg(result.getResponse().getSubMsg());
                   response.setCode(result.getResponse().getCode());
                   response.setMsg(result.getResponse().getMsg());
                    break;
                default:
                    response.setDesc("不支持的交易状态，交易返回异常!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
            }
        } catch (Exception e) {
            System.err.println("当面付.扫码支付 调用预订单API失败:" + e.getMessage());
            throw e;
        } finally {
            System.out.println("precreate response=\n" + response.toString());
        }
        return response;
    }

    /***
     * 当面付.条码支付,是支付宝给到线下传统行业的一种收款方式。商户使用扫码枪等条码识别设备扫描用户支付宝钱包上的条码/二维码，完成收款。用户仅需出示付款码，所有操作由商户端完成。
     * @see <a href="https://docs.open.alipay.com/194/105170">https://docs.open.alipay.com/194/105170</a>
     * @param request the request 条码支付 所需参数
     * @return alipay trade response 条码支付所需参数
     * @throws Exception the exception
     */
    public AlipayTradeResponse pay(AlipayTradeRequest request) throws Exception{

        System.out.println("pay request=\n" + request.toString());
        AlipayTradeResponse response = new AlipayTradeResponse();

        try {

            if (null == tradeService)
                throw new Exception("Please set AlipayCore.ClientBuider first and call build().");

            // 业务扩展参数，目前可添加由支付宝分配的系统商编号(通过setSysServiceProviderId方法)，详情请咨询支付宝技术支持
            String providerId = "2088100200300400500";
            ExtendParams extendParams = new ExtendParams();
            extendParams.setSysServiceProviderId(providerId);

            AlipayTradePayRequestBuilder builder = new AlipayTradePayRequestBuilder()
                    //            .setAppAuthToken(appAuthToken)
                    .setOutTradeNo(request.getOutTradeNo()).setSubject(request.getSubject()).setAuthCode(request.getAuthCode())
                    .setTotalAmount(request.getTotalAmount()).setStoreId(request.getStoreId())
                    .setUndiscountableAmount(request.getUndiscountableAmount()).setBody(request.getBody()).setOperatorId(request.getOperatorId())
                    .setExtendParams(extendParams).setSellerId(request.getSellerId())
                    .setGoodsDetailList(request.getGoodsDetailList());

            AlipayF2FPayResult result = tradeService.tradePay(builder);

            response.setSuccess(result.isTradeSuccess());

            switch (result.getTradeStatus()) {
                case SUCCESS:
                    BeanUtilsBean copyBean = BeanUtilsBean.getInstance();
                    copyBean.copyProperties(response, result.getResponse());
                    response.setDesc("支付宝支付成功");
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                case FAILED:
                    response.setDesc("支付宝支付失败");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                case UNKNOWN:
                    response.setDesc("系统异常，订单状态未知!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                default:
                    response.setDesc("不支持的交易状态，交易返回异常!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
            }

        } catch (Exception e) {
            System.err.println("当面付.条码支付 失败:" + e.getMessage());
            throw e;
        } finally {
            System.out.println("pay response=\n" + response.toString());
        }
        return response;
    }


    /**
     * 查询支付订单.
     *
     * @param outTradeNo the out trade no
     * @return the alipay query response
     * @throws Exception the exception
     */
    public AlipayQueryResponse query(String outTradeNo) throws Exception {

        System.out.println("query outTradeNo=" + outTradeNo);
        AlipayQueryResponse response = new AlipayQueryResponse();

        try {
            if (null == tradeService)
                throw new Exception("Please set AlipayCore.ClientBuider first and call build().");

            AlipayTradeQueryRequestBuilder builder = new AlipayTradeQueryRequestBuilder()
                    .setOutTradeNo(outTradeNo);
            AlipayF2FQueryResult result = tradeService.queryTradeResult(builder);
            response.setSuccess(result.isTradeSuccess());

            if (null != result.getResponse()) {
                BeanUtilsBean copyBean = BeanUtilsBean.getInstance();
                copyBean.copyProperties(response, result.getResponse());
            }

            switch (result.getTradeStatus()) {
                case SUCCESS:
                    response.setDesc("查询返回该订单支付成功");
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                case FAILED:
                    response.setDesc("查询返回该订单支付失败或被关闭!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                case UNKNOWN:
                    response.setDesc("系统异常，订单支付状态未知!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                default:
                    response.setDesc("不支持的交易状态，交易返回异常!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
            }
        } catch (Exception e) {
            System.err.println("查询订单失败:" + e.getMessage());
            throw e;
        } finally {
            System.out.println("query response=\n" + response.toString());
        }
        return response;
    }


    /**
     * 支付宝退款，商户因业务原因需要退款时，可通过成功交易的商户订单号或支付宝交易号进行退款 ，支持部分退款。
     * 退款接口会根据外部请求号out_request_no幂等返回，因此同一笔需要多次部分退款时，必须使用不同的out_request_no
     * @see <a href="https://docs.open.alipay.com/api_1/alipay.trade.refund">https://docs.open.alipay.com/api_1/alipay.trade.refund</a>
     *
     * @param request the request 退款参数
     * @return 退款结果 alipay refund response
     * @throws Exception the exception
     */
    public AlipayRefundResponse refund(AlipayRefundRequest request) throws Exception{

        System.out.println("refund request=\n" + request.toString());

        AlipayRefundResponse response = new AlipayRefundResponse();

        try {
            if (null == tradeService)
                throw new Exception("Please set AlipayCore.ClientBuider first and call build().");

            AlipayTradeRefundRequestBuilder builder = new AlipayTradeRefundRequestBuilder();

            if (StringUtils.isBlank(request.getOutTradeNo()) && StringUtils.isBlank(request.getTradeNo()))
                throw new Exception("trade_no , out_trade_no 不能同时为空");
            if(StringUtils.isBlank(request.getRefundAmount()))
                throw new Exception("refundAmount 不能为空");

            if (StringUtils.isNotBlank(request.getOutTradeNo()))
                builder.setOutTradeNo(request.getOutTradeNo());
            if (StringUtils.isNotBlank(request.getTradeNo()))
                builder.setTradeNo(request.getTradeNo());
            if (StringUtils.isNotBlank(request.getRefundReason()))
                builder.setRefundReason(request.getRefundReason());
            if (StringUtils.isNotBlank(request.getStoreId()))
                builder.setStoreId(request.getStoreId());
            if (StringUtils.isNotBlank(request.getOutRequestNo()))
                builder.setOutRequestNo(request.getOutRequestNo());


            //trade_no , out_trade_no 不能同时存在,否则支付宝会报错ACQ.TRADE_STATUS_ERROR.交易状态不合法
            if (StringUtils.isNotBlank(builder.getOutTradeNo()) && StringUtils.isNotBlank(builder.getTradeNo())){
                builder.setTradeNo(null);
            }

            builder.setRefundAmount(request.getRefundAmount());

            AlipayF2FRefundResult result = tradeService.tradeRefund(builder);
            response.setSuccess(result.isTradeSuccess());
            switch (result.getTradeStatus()) {
                case SUCCESS:
                    BeanUtilsBean copyBean = BeanUtilsBean.getInstance();
                    copyBean.copyProperties(response, result.getResponse());
                   response.setDesc("支付宝退款成功");
                   response.setCode(result.getResponse().getCode());
                   response.setMsg(result.getResponse().getMsg());
                    break;
                case FAILED:
                    response.setDesc("支付宝退款失败");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                case UNKNOWN:
                    response.setDesc("系统异常，订单退款状态未知!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                default:
                    response.setDesc("不支持的交易状态，交易返回异常!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
            }
        } catch (Exception e) {
            System.err.println("支付宝退款失败:" + e.getMessage());
            throw e;
        } finally {
            System.out.println("refund response=\n" + response.toString());
        }

        return response;
    }

    /**
     * 撤销订单
     *
     * @param outTradeNo the out trade no
     * @return the alipay cancel response
     * @throws Exception the exception
     */
    public AlipayCancelResponse cancel(String outTradeNo) throws Exception {
        AlipayCancelResponse response = new AlipayCancelResponse();

        try {
            AlipayTradeCancelRequestBuilder builder = new AlipayTradeCancelRequestBuilder();
            builder.setOutTradeNo(outTradeNo);

            AlipayF2FCancelResult result = tradeService.tradeCancel_II(builder);
            response.setSuccess(result.isTradeSuccess());
            switch (result.getTradeStatus()) {
                case SUCCESS:
                    BeanUtilsBean copyBean = BeanUtilsBean.getInstance();
                    copyBean.copyProperties(response, result.getResponse());
                    response.setDesc("支付宝撤销成功");
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                case FAILED:
                    response.setDesc("支付宝撤销失败");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                case UNKNOWN:
                    response.setDesc("系统异常，订单撤销状态未知!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
                default:
                    response.setDesc("不支持的交易状态，交易返回异常!");
                    response.setSubCode(result.getResponse().getSubCode());
                    response.setSubMsg(result.getResponse().getSubMsg());
                    response.setCode(result.getResponse().getCode());
                    response.setMsg(result.getResponse().getMsg());
                    break;
            }
        } catch (Exception e) {
            System.err.println("支付宝撤销订单失败,outTradeNo="+outTradeNo);
            throw e;
        }finally {
            System.out.println("cancel response=\n"+response.toString());
        }

        return response;

    }

}
