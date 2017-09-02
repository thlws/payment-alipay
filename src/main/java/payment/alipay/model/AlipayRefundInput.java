package payment.alipay.model;

import payment.alipay.utils.JsonUtil;

/**
 * Created by HanleyTang on 2017/3/4.
 */
public class AlipayRefundInput {

    private String tradeNo;//支付宝交易号,tradeNo| outTradeNo二选一
    private String outTradeNo;//(特殊 tradeNo| outTradeNo二选一) 商户网站订单系统中唯一订单号，64个字符以内，只能包含字母、数字、下划线
    private String refundAmount;// (必填)
    private String storeId;// (选填) 商户门店编号，通过门店号和商家后台可以配置精准到门店的折扣信息，详询支付宝技术支持
    private String refundReason;//(选填)

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    private String terminalId;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
