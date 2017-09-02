package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.saleleads.info.add response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-16 16:13:33
 */
public class AlipayOfflineSaleleadsInfoAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6624743737497788312L;

	/** 
	 * 添加leads成功后返回
	 */
	@ApiField("leads_id")
	private String leadsId;

	/** 
	 * 说明
	 */
	@ApiField("message")
	private String message;

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
