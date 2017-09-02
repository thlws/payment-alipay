package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.saleleads.contractconfirm response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-16 16:13:12
 */
public class AlipayOfflineSaleleadsContractconfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6167236581647252142L;

	/** 
	 * 当面付审核状态
	 */
	@ApiField("ff_audit_status")
	private String ffAuditStatus;

	/** 
	 * 当面付审核通过时间
	 */
	@ApiField("ff_audit_time")
	private String ffAuditTime;

	/** 
	 * 当面付生效时间
	 */
	@ApiField("ff_online")
	private String ffOnline;

	/** 
	 * 是否开店
	 */
	@ApiField("is_open_shop")
	private String isOpenShop;

	/** 
	 * 签约状态
	 */
	@ApiField("is_sign")
	private String isSign;

	/** 
	 * leads id
	 */
	@ApiField("leads_id")
	private String leadsId;

	/** 
	 * 商户PID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public void setFfAuditStatus(String ffAuditStatus) {
		this.ffAuditStatus = ffAuditStatus;
	}
	public String getFfAuditStatus( ) {
		return this.ffAuditStatus;
	}

	public void setFfAuditTime(String ffAuditTime) {
		this.ffAuditTime = ffAuditTime;
	}
	public String getFfAuditTime( ) {
		return this.ffAuditTime;
	}

	public void setFfOnline(String ffOnline) {
		this.ffOnline = ffOnline;
	}
	public String getFfOnline( ) {
		return this.ffOnline;
	}

	public void setIsOpenShop(String isOpenShop) {
		this.isOpenShop = isOpenShop;
	}
	public String getIsOpenShop( ) {
		return this.isOpenShop;
	}

	public void setIsSign(String isSign) {
		this.isSign = isSign;
	}
	public String getIsSign( ) {
		return this.isSign;
	}

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

}
