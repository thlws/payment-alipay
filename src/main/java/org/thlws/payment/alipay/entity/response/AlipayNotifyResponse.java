package org.thlws.payment.alipay.entity.response;

/**
 * 支付异步通知,核心返回参数
 * Created by HanleyTang on 2017/3/10.
 */
public class AlipayNotifyResponse {


    private boolean verify_flg;//验证是否成功 true 成功,false 失败
    private String out_trade_no;//商户订单号
    private String trade_no;//支付宝交易号

    /***
     * WAIT_BUYER_PAY	交易创建，等待买家付款
     * TRADE_CLOSED	    未付款交易超时关闭，或支付完成后全额退款
     * TRADE_SUCCESS	交易支付成功
     * TRADE_FINISHED	交易结束，不可退款
     */
    private String trade_status;

    public boolean isVerify_flg() {
        return verify_flg;
    }

    public void setVerify_flg(boolean verify_flg) {
        this.verify_flg = verify_flg;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public String getTrade_status() {
        return trade_status;
    }

    public void setTrade_status(String trade_status) {
        this.trade_status = trade_status;
    }
}
