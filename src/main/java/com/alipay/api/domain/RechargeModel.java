package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 充值模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class RechargeModel extends AlipayObject {

	private static final long serialVersionUID = 7699688943732472144L;

	/**
	 * 号段
	 */
	@ApiField("mobile_no_segment")
	private String mobileNoSegment;

	/**
	 * 充送
	 */
	@ApiField("pay_send")
	private String paySend;

	/**
	 * 销售产品
	 */
	@ApiListField("sale_products")
	@ApiField("sale_product")
	private List<SaleProduct> saleProducts;

	public String getMobileNoSegment() {
		return this.mobileNoSegment;
	}
	public void setMobileNoSegment(String mobileNoSegment) {
		this.mobileNoSegment = mobileNoSegment;
	}

	public String getPaySend() {
		return this.paySend;
	}
	public void setPaySend(String paySend) {
		this.paySend = paySend;
	}

	public List<SaleProduct> getSaleProducts() {
		return this.saleProducts;
	}
	public void setSaleProducts(List<SaleProduct> saleProducts) {
		this.saleProducts = saleProducts;
	}

}
