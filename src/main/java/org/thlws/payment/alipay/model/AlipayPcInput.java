package org.thlws.payment.alipay.model;

import org.thlws.payment.alipay.utils.JsonUtil;

/***
 * 支付宝网站支付参数对象
 */
public class AlipayPcInput {

    private BizContent bizContent   ;//业务数据填充,json格式
    private String return_url       ;//同步处理地址
    private String notify_url       ;//异步处理地址

    public BizContent getBizContent() {
        return bizContent;
    }

    public void setBizContent(BizContent bizContent) {
        this.bizContent = bizContent;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public static class BizContent{

        private String out_trade_no  ;
        private String total_amount  ;
        private String subject       ;
        private String body          ;
        private String product_code  ;

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getTotal_amount() {
            return total_amount;
        }

        public void setTotal_amount(String total_amount) {
            this.total_amount = total_amount;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getProduct_code() {
            return product_code;
        }

        public void setProduct_code(String product_code) {
            this.product_code = product_code;
        }
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }
}
