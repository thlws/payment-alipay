package org.thlws.payment.alipay.client;

import org.thlws.payment.alipay.core.AlipayCore;
import org.thlws.payment.alipay.entity.request.*;
import org.thlws.payment.alipay.entity.response.*;

/***
 * 支付入口
 */
public class AlipayClient {

    /**
     * 手机网页H5支付
     * {@link AlipayCore#pay_in_h5}
     * @param request
     * @param alipayCore
     * @return
     * @throws Exception
     */
    public static String pay_in_h5(AlipayH5Request request, AlipayCore alipayCore) throws Exception{

        if (null == alipayCore)
            throw new Exception("alipayCore can not be nul.");
        if (null == request)
            throw new Exception("AlipayH5Request can not be nul.");
        return alipayCore.pay_in_h5(request);

    }

    /***
     * 普通网站支付
     * {@link AlipayCore#pay_in_pc}
     * @param request
     * @param alipayCore
     * @return
     * @throws Exception
     */
    public static  String pay_in_pc(AlipayWebRequest request, AlipayCore alipayCore) throws Exception{

        if (null == alipayCore)
            throw new Exception("alipayCore can not be nul.");
        if (null == request)
            throw new Exception("AlipayWebRequest can not be nul.");

        return alipayCore.pay_in_pc(request);
    }


    /***
     * 支付宝预支付订单
     * {@link AlipayCore#precreate}
     * @param request
     * @param alipayCore
     * @return
     * @throws Exception
     */
    public static  AlipayQrcodeResponse precreate(AlipayQrcodeRequest request, AlipayCore alipayCore) throws Exception{

        if (null == alipayCore)
            throw new Exception("alipayCore can not be nul.");
        if (null == request)
            throw new Exception("AlipayQrcodeRequest can not be nul.");

        return alipayCore.precreate(request);
    }


    /***
     * 支付宝当面付,用户被扫码
     * {@link AlipayCore#pay}
     * @param request
     * @param alipayCore
     * @return
     * @throws Exception
     */
    public static  AlipayTradeResponse pay(AlipayTradeRequest request, AlipayCore alipayCore) throws Exception{

        if (null == alipayCore)
            throw new Exception("alipayCore can not be nul.");
        if (null == request)
            throw new Exception("AlipayTradeRequest can not be nul.");

        return alipayCore.pay(request);
    }


    /***
     * 支付订单查询
     * {@link AlipayCore#query}
     * @param outTradeNo
     * @param alipayCore
     * @return
     * @throws Exception
     */
    public static  AlipayQueryResponse query(String outTradeNo, AlipayCore alipayCore) throws Exception {

        if (null == alipayCore)
            throw new Exception("alipayCore can not be nul.");
        if (null == outTradeNo || outTradeNo.length() == 0)
            throw new Exception("outTradeNo can not be nul.");

        return alipayCore.query(outTradeNo);
    }


    /***
     *
     * 支付订单退款
     * {@link AlipayCore#refund}
     * @param request
     * @param alipayCore
     * @return
     * @throws Exception
     */
    public static  AlipayRefundResponse refund(AlipayRefundRequest request, AlipayCore alipayCore) throws Exception{

        if (null == alipayCore)
            throw new Exception("alipayCore can not be nul.");
        if (null == request)
            throw new Exception("AlipayRefundRequest can not be nul.");

        return alipayCore.refund(request);
    }


    /***
     * 订单取消
     * {@link AlipayCore#cancel}
     * @param outTradeNo
     * @param alipayCore
     * @return
     * @throws Exception
     */
    public static  AlipayCancelResponse cancel(String outTradeNo, AlipayCore alipayCore) throws Exception {

        if (null == alipayCore)
            throw new Exception("alipayCore can not be nul.");
        if (null == outTradeNo || outTradeNo.length() == 0)
            throw new Exception("outTradeNo can not be nul.");

        return alipayCore.cancel(outTradeNo);
    }
}
