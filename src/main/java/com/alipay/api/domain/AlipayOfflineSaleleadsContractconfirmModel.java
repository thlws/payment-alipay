package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crmhome提供私海leads确认签约功能
 *
 * @author auto create
 * @since 1.0, 2015-11-20 19:26:18
 */
public class AlipayOfflineSaleleadsContractconfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5315774254693925266L;

	/**
	 * 支付宝名称
	 */
	@ApiField("alipay_card_name")
	private String alipayCardName;

	/**
	 * 商户支付宝账户,比如手机号邮箱等
	 */
	@ApiField("alipay_card_no")
	private String alipayCardNo;

	/**
	 * 需要签约确认的leads id
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

	/**
	 * 签约状态，只能是“SIGN_SUCCESS”
	 */
	@ApiField("sign_status")
	private String signStatus;

	public String getAlipayCardName() {
		return this.alipayCardName;
	}
	public void setAlipayCardName(String alipayCardName) {
		this.alipayCardName = alipayCardName;
	}

	public String getAlipayCardNo() {
		return this.alipayCardNo;
	}
	public void setAlipayCardNo(String alipayCardNo) {
		this.alipayCardNo = alipayCardNo;
	}

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

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

}
