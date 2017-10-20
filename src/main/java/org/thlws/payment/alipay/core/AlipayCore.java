package org.thlws.payment.alipay.core;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.trade.model.ExtendParams;
import com.alipay.trade.model.builder.*;
import com.alipay.trade.model.result.*;
import com.alipay.trade.service.AlipayTradeService;
import com.alipay.trade.service.impl.AlipayTradeServiceImpl;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thlws.payment.alipay.model.*;

/**
 * 支付宝支付核心处理入口,封装支付常用API，包括当面付、新版网页支付、退款操作、订单查询;
 * 使用任何方法前,需先行设置ClientBuilder中核心参数,并调用build方法初始化 tradeService & builder.
 * 支付宝API文档中心:https://doc.open.alipay.com/doc2/apiList?docType=4
 * <pre>
 *  AlipayCore.ClientBuilder clientBuilder = new AlipayCore.ClientBuilder();
 *  AlipayCore alipayCore = clientBuilder.setAlipay_public_key("xxx").setApp_id("xxx").setPrivate_key("xxx").build();
 *  alipayCore.pay_in_h5(input);
 *  alipayCore.pay(input);
 *  alipayCore.query(outTradeNo);
 *  alipayCore.refund(input);
 * </pre>
 * Created by HanleyTang on 2017/3/3.
 */
public class AlipayCore {

    static final protected Logger log = LoggerFactory.getLogger(AlipayCore.class);

    /**
     * 支付交易核心服务,调用API前,调用前API前先行初始化
     */
    private AlipayTradeService tradeService;

    /**
     * 支付宝核心参数构件器,调用前API前先行初始化
     */
    private ClientBuilder builder;

    public AlipayCore() {
    }

    /***
     * 参数构件第三步,初始化 tradeService & builder.
     * @param builder the builder
     */
    public AlipayCore(ClientBuilder builder) {
        if (StringUtils.isEmpty(builder.getAlipay_public_key()))
            throw new NullPointerException("alipay_public_key should not be NULL!");
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
//        alipayTradebuilder.setSignType("RSA2");
        alipayTradebuilder.setGatewayUrl("https://openapi.alipay.com/gateway.do");
        alipayTradebuilder.setPrivateKey(builder.getPrivate_key());
        tradeService = alipayTradebuilder.build();
    }

    /***
     * 参数构件Class,参数构件第一步,请完成所有参数设置后调用build 方法.
     */
    public static class ClientBuilder {
        private String private_key;//商户私钥
        private String alipay_public_key;//支付宝公钥
        private String app_id;//支付宝应用ID

        /***
         * 参数构件第二步,构件supper class instance.
         * @return alipay core
         */
        public AlipayCore build() {
            if (StringUtils.isEmpty(alipay_public_key))
                throw new NullPointerException("please set alipay_public_key first!");
            if (StringUtils.isEmpty(app_id))
                throw new NullPointerException("please set appid first!");
            if (StringUtils.isEmpty(private_key))
                throw new NullPointerException("please set private first!");
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
    }


    /***
     * 支付宝手机网页支付,支付宝新接口,在手机上可直接调用支付宝APP完成支付宝(有安装支付宝APP情况);
     * 详细信息请参阅支付宝官方文档 https://doc.open.alipay.com/docs/doc.htm?treeId=203&articleId=105285&docType=1
     * https://doc.open.alipay.com/doc2/detail.htm?treeId=203&articleId=105286&docType=1
     * @param input the input 新版网页支付参数
     * @return string  支付宝产生用于网页支付的html.
     */
    public String pay_in_h5(AlipayH5Input input) {

        log.info("pay_in_h5 input=\n" + input.toString());
        String form = "<font style='color: red'>请求支付宝超时,请稍后再试!</font>";

        try {
            if (null == builder)
                throw new Exception("Please set AlipayCore.ClientBuider first.");
            String biz_content = JSON.toJSONString(input.getBizContent());
            AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
                    builder.getApp_id(), builder.getPrivate_key(), "json", "utf-8", builder.getAlipay_public_key());
            AlipayTradeWapPayRequest alipayRequest = new AlipayTradeWapPayRequest();// 创建API对应的request
            alipayRequest.setReturnUrl(input.getReturn_url());
            alipayRequest.setNotifyUrl(input.getNotify_url());// 在公共参数中设置回跳和通知地址
            alipayRequest.setBizContent(biz_content);// 填充业务参数
            form = alipayClient.pageExecute(alipayRequest).getBody(); // 调用SDK生成表单
        } catch (Exception e) {
            log.error("支付宝网页支付数据产生失败:" + e.getMessage());
        } finally {
            log.info("pay_in_h5 output=\n" + form);
        }

        return form;
    }


    /**
     * 当面付.扫码支付，指用户打开支付宝钱包中的“扫一扫”功能，扫描商户针对每个订单实时生成的订单二维码，并在手机端确认支付。
     * 收银员通过收银台或商户后台调用支付宝接口，生成二维码后，展示给用户，由用户扫描二维码完成订单支付。
     * https://doc.open.alipay.com/docs/doc.htm?treeId=194&articleId=105170&docType=1#s4
     * https://doc.open.alipay.com/docs/api.htm?spm=a219a.7395905.0.0.JV8o0P&docType=4&apiId=862
     *
     * @param input the input 扫码支付所需参数
     * @return the alipay qrcode output 扫码支付结果
     */
    public AlipayQrcodeOutput precreate(AlipayQrcodeInput input) {

        log.info("precreate input=\n" + input.toString());
        AlipayQrcodeOutput output = new AlipayQrcodeOutput();

        try {
            if (null == tradeService)
                throw new Exception("Please set AlipayCore.ClientBuider first and call build().");

            // 业务扩展参数，目前可添加由支付宝分配的系统商编号(通过setSysServiceProviderId方法)，详情请咨询支付宝技术支持
            ExtendParams extendParams = new ExtendParams();
            extendParams.setSysServiceProviderId("2088100200300400500");

            // 支付超时，定义为120分钟
            // String timeoutExpress = "120m";

            // 创建扫码支付请求builder，设置请求参数
            AlipayTradePrecreateRequestBuilder builder = new AlipayTradePrecreateRequestBuilder()
                    .setSubject(input.getSubject())
                    .setTotalAmount(input.getTotalAmount())
                    .setOutTradeNo(input.getOutTradeNo())
//                    .setUndiscountableAmount(input.getUndiscountableAmount())
                    .setSellerId(input.getSellerId())
                    .setBody(input.getBody())
                    .setOperatorId(input.getOperatorId())
                    .setStoreId(input.getStoreId())
//                    .setTimeoutExpress(timeoutExpress)
                    .setExtendParams(extendParams);
            //                .setNotifyUrl("http://www.test-notify-url.com")//支付宝服务器主动通知商户服务器里指定的页面http路径,根据需要设置
//                    .setGoodsDetailList(input.getGoodsDetailList());

            AlipayF2FPrecreateResult result = tradeService.tradePrecreate(builder);
            output.setSuccess(result.isTradeSuccess());

            switch (result.getTradeStatus()) {
                case SUCCESS:
                    output.setDesc("支付宝预下单成功");
                    output.setOutTradeNo(result.getResponse().getOutTradeNo());
                    output.setQrCode(result.getResponse().getQrCode());
                    break;
                case FAILED:
                    output.setDesc("支付宝预下单失败!");
                    break;
                case UNKNOWN:
                    output.setDesc("系统异常，预下单状态未知!");
                    break;
                default:
                    output.setDesc("不支持的交易状态，交易返回异常!");
                    break;
            }
        } catch (Exception e) {
            log.error("当面付.扫码支付 调用预订单API失败:" + e.getMessage());
        } finally {
            log.info("precreate output=\n" + output.toString());
        }
        return output;
    }

    /***
     * 当面付.条码支付,是支付宝给到线下传统行业的一种收款方式。商户使用扫码枪等条码识别设备扫描用户支付宝钱包上的条码/二维码，完成收款。用户仅需出示付款码，所有操作由商户端完成。
     * https://doc.open.alipay.com/docs/doc.htm?treeId=194&articleId=105170&docType=1#s4
     * @param input the input 条码支付 所需参数
     * @return alipay trade output 条码支付所需参数
     */
    public AlipayTradeOutput pay(AlipayTradeInput input) {

        log.info("pay input=\n" + input.toString());
        AlipayTradeOutput output = new AlipayTradeOutput();

        try {

            if (null == tradeService)
                throw new Exception("Please set AlipayCore.ClientBuider first and call build().");

            // 业务扩展参数，目前可添加由支付宝分配的系统商编号(通过setSysServiceProviderId方法)，详情请咨询支付宝技术支持
            String providerId = "2088100200300400500";
            ExtendParams extendParams = new ExtendParams();
            extendParams.setSysServiceProviderId(providerId);

            // 支付超时，线下扫码交易定义为5分钟
            //String timeoutExpress = "5m";

            AlipayTradePayRequestBuilder builder = new AlipayTradePayRequestBuilder()
                    //            .setAppAuthToken(appAuthToken)
                    .setOutTradeNo(input.getOutTradeNo()).setSubject(input.getSubject()).setAuthCode(input.getAuthCode())
                    .setTotalAmount(input.getTotalAmount()).setStoreId(input.getStoreId())
                    .setUndiscountableAmount(input.getUndiscountableAmount()).setBody(input.getBody()).setOperatorId(input.getOperatorId())
                    .setExtendParams(extendParams).setSellerId(input.getSellerId())
                    .setGoodsDetailList(input.getGoodsDetailList());

            AlipayF2FPayResult result = tradeService.tradePay(builder);
            output.setSuccess(result.isTradeSuccess());
            switch (result.getTradeStatus()) {
                case SUCCESS:
                    BeanUtilsBean copyBean = BeanUtilsBean.getInstance();
                    copyBean.copyProperties(output, result.getResponse());
                    output.setDesc("支付宝支付成功");
                    break;
                case FAILED:
                    output.setDesc("支付宝支付失败");
                    break;

                case UNKNOWN:
                    output.setDesc("系统异常，订单状态未知!");
                    break;
                default:
                    output.setDesc("不支持的交易状态，交易返回异常!");
                    break;
            }
        } catch (Exception e) {
            log.error("当面付.条码支付 失败:" + e.getMessage());
        } finally {
            log.info("pay output=\n" + output.toString());
        }
        return output;
    }


    /**
     * Query alipay query output.
     *
     * @param outTradeNo the out trade no
     * @return the alipay query output
     */
    public AlipayQueryOutput query(String outTradeNo) {

        log.info("query outTradeNo=" + outTradeNo);
        AlipayQueryOutput output = new AlipayQueryOutput();

        try {
            if (null == tradeService)
                throw new Exception("Please set AlipayCore.ClientBuider first and call build().");

            AlipayTradeQueryRequestBuilder builder = new AlipayTradeQueryRequestBuilder()
                    .setOutTradeNo(outTradeNo);
            AlipayF2FQueryResult result = tradeService.queryTradeResult(builder);
            output.setSuccess(result.isTradeSuccess());

            if (null != result.getResponse()) {
                BeanUtilsBean copyBean = BeanUtilsBean.getInstance();
                copyBean.copyProperties(output, result.getResponse());
            }

            switch (result.getTradeStatus()) {
                case SUCCESS:
                    output.setDesc("查询返回该订单支付成功");
                    break;
                case FAILED:
                    output.setDesc("查询返回该订单支付失败或被关闭!");
                    break;
                case UNKNOWN:
                    output.setDesc("系统异常，订单支付状态未知!");
                    break;

                default:
                    output.setDesc("不支持的交易状态，交易返回异常!");
                    break;
            }
        } catch (Exception e) {
            log.error("查询订单失败:" + e.getMessage());
        } finally {
            log.info("query output=\n" + output.toString());
        }
        return output;
    }


    /**
     * 支付宝退款，商户因业务原因需要退款时，可通过成功交易的商户订单号或支付宝交易号进行退款 ，支持部分退款。
     * 退款接口会根据外部请求号out_request_no幂等返回，因此同一笔需要多次部分退款时，必须使用不同的out_request_no
     * https://doc.open.alipay.com/doc2/apiDetail.htm?spm=a219a.7629065.0.0.1hBqdQ&apiId=759&docType=4
     *
     * @param input the input 退款参数
     * @return 退款结果
     */
    public AlipayRefundOutput refund(AlipayRefundInput input) {

        log.info("refund input=\n" + input.toString());

        AlipayRefundOutput output = new AlipayRefundOutput();

        try {
            if (null == tradeService)
                throw new Exception("Please set AlipayCore.ClientBuider first and call build().");

            AlipayTradeRefundRequestBuilder builder = new AlipayTradeRefundRequestBuilder();

            if (StringUtils.isBlank(input.getOutTradeNo()) && StringUtils.isBlank(input.getTradeNo()))
                throw new Exception("trade_no , out_trade_no 不能同时为空");
            if(StringUtils.isBlank(input.getRefundAmount()))
                throw new Exception("refundAmount 不能为空");

            if (StringUtils.isNotBlank(input.getOutTradeNo()))
                builder.setOutTradeNo(input.getOutTradeNo());
            if (StringUtils.isNotBlank(input.getTradeNo()))
                builder.setTradeNo(input.getTradeNo());
            if (StringUtils.isNotBlank(input.getRefundReason()))
                builder.setRefundReason(input.getRefundReason());
            if (StringUtils.isNotBlank(input.getStoreId()))
                builder.setStoreId(input.getStoreId());

            //trade_no , out_trade_no 不能同时存在,否则支付宝会报错ACQ.TRADE_STATUS_ERROR.交易状态不合法
            if (StringUtils.isNotBlank(builder.getOutTradeNo()) && StringUtils.isNotBlank(builder.getTradeNo())){
                builder.setTradeNo(null);
            }

            builder.setRefundAmount(input.getRefundAmount());

            AlipayF2FRefundResult result = tradeService.tradeRefund(builder);
            output.setSuccess(result.isTradeSuccess());
            switch (result.getTradeStatus()) {
                case SUCCESS:
                    BeanUtilsBean copyBean = BeanUtilsBean.getInstance();
                    copyBean.copyProperties(output, result.getResponse());
                    output.setDesc("支付宝退款成功");
                    break;
                case FAILED:
                    output.setDesc("支付宝退款失败");
                    break;
                case UNKNOWN:
                    output.setDesc("系统异常，订单退款状态未知!");
                    break;
                default:
                    output.setDesc("不支持的交易状态，交易返回异常!");
                    break;
            }
        } catch (Exception e) {
            log.error("支付宝退款失败:" + e.getMessage());
        } finally {
            log.info("refund output=\n" + output.toString());
        }

        return output;
    }

    public AlipayCancelOutput cancel(String outTradeNo) {
        AlipayCancelOutput output = new AlipayCancelOutput();

        try {
            AlipayTradeCancelRequestBuilder builder = new AlipayTradeCancelRequestBuilder();
            builder.setOutTradeNo(outTradeNo);

            AlipayF2FCancelResult result = tradeService.tradeCancel_II(builder);
            output.setSuccess(result.isTradeSuccess());
            switch (result.getTradeStatus()) {
                case SUCCESS:
                    BeanUtilsBean copyBean = BeanUtilsBean.getInstance();
                    copyBean.copyProperties(output, result.getResponse());
                    output.setDesc("支付宝撤销成功");
                    break;
                case FAILED:
                    output.setDesc("支付宝撤销失败");
                    break;
                case UNKNOWN:
                    output.setDesc("系统异常，订单撤销状态未知!");
                    break;
                default:
                    output.setDesc("不支持的交易状态，交易返回异常!");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("支付宝撤销订单失败,outTradeNo="+outTradeNo);
        }finally {
            log.info("cancel output=\n"+output.toString());
        }

        return output;

    }





}
