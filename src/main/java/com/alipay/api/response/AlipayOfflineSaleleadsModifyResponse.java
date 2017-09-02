package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.saleleads.modify response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-16 16:13:30
 */
public class AlipayOfflineSaleleadsModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6363241255561766771L;

	/** 
	 * 被修改leadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

}
