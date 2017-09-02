package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crmhome中leads认领\分配\释放
 *
 * @author auto create
 * @since 1.0, 2015-11-20 19:13:54
 */
public class AlipayOfflineSaleleadsClaimstatusModel extends AlipayObject {

	private static final long serialVersionUID = 6424774142126153995L;

	/**
	 * 商机(或者销售机会)
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 操作人PID
	 */
	@ApiField("ope_pid")
	private String opePid;

	/**
	 * 原操作员工pid
	 */
	@ApiField("ope_pid_orig")
	private String opePidOrig;

	/**
	 * CLAIM(认领);ALLOCATE(分配);RELEASE(释放).全是大写字母
	 */
	@ApiField("oper_type")
	private String operType;

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

	public String getOpePidOrig() {
		return this.opePidOrig;
	}
	public void setOpePidOrig(String opePidOrig) {
		this.opePidOrig = opePidOrig;
	}

	public String getOperType() {
		return this.operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
