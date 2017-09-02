package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.batch.payurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-10-31 19:40:07
 */
public class AlipayEbppBillBatchPayurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4213757643792288461L;

	/** 
	 * 收银台链接
	 */
	@ApiField("pay_url")
	private String payUrl;

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

}
