package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mappprod.account.binding.sync response.
 * 
 * @author auto create
 * @since 1.0, 2014-09-11 09:38:13
 */
public class AlipayMappprodAccountBindingSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5726585938221748756L;

	/** 
	 * 绑定结果, JSON字符串。预留，暂时没用。
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
