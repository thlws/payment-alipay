package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crmhome提供leads分页查询功能
 *
 * @author auto create
 * @since 1.0, 2015-11-16 19:30:24
 */
public class AlipayOfflineSaleleadsQuerybyidsModel extends AlipayObject {

	private static final long serialVersionUID = 6787854448347735165L;

	/**
	 * leadsid列表，多个以英文逗号隔开
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 操作人PID
	 */
	@ApiField("ope_pid")
	private String opePid;

	/**
	 * 全局唯一的流水号
	 */
	@ApiField("request_id")
	private String requestId;

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getOpePid() {
		return this.opePid;
	}
	public void setOpePid(String opePid) {
		this.opePid = opePid;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
