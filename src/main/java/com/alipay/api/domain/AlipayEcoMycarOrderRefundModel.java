package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起退款
 *
 * @author auto create
 * @since 1.0, 2016-06-14 15:09:24
 */
public class AlipayEcoMycarOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2568377778661858672L;

	/**
	 * 退款交易编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

}
