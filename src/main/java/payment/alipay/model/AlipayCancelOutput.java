package payment.alipay.model;

import payment.alipay.utils.JsonUtil;

/**
 * Created by HanleyTang on 2017/3/8.
 */
public class AlipayCancelOutput {

    private boolean isSuccess;
    private String desc;

    /**
     * 本次撤销触发的交易动作
     *close：关闭交易，无退款
     *refund：产生了退款
     */
    private String action;

    /**
     * 商户订单号
     */
    private String outTradeNo;

    /**
     * 是否需要重试
     */
    private String retryFlag;

    /**
     * 支付宝交易号
     */
    private String tradeNo;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getRetryFlag() {
        return retryFlag;
    }

    public void setRetryFlag(String retryFlag) {
        this.retryFlag = retryFlag;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
