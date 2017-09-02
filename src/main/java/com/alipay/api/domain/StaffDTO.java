package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商员工信息描述
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class StaffDTO extends AlipayObject {

	private static final long serialVersionUID = 7727833694299428914L;

	/**
	 * 行业类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 职员部门Id
	 */
	@ApiField("bizunit_id")
	private String bizunitId;

	/**
	 * 员工邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 服务商PID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户唯一标识类型，与商户Id组合起来，唯一确定一个商户实体
	 */
	@ApiField("merchant_id_type")
	private String merchantIdType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 员工PID
	 */
	@ApiField("staff_biz_code")
	private String staffBizCode;

	/**
	 * 员工ID
	 */
	@ApiField("staff_id")
	private String staffId;

	/**
	 * 员工手机号
	 */
	@ApiField("staff_mobile")
	private String staffMobile;

	/**
	 * 员工姓名
	 */
	@ApiField("staff_name")
	private String staffName;

	/**
	 * 员工类型
	 */
	@ApiField("staff_type")
	private String staffType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizunitId() {
		return this.bizunitId;
	}
	public void setBizunitId(String bizunitId) {
		this.bizunitId = bizunitId;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantIdType() {
		return this.merchantIdType;
	}
	public void setMerchantIdType(String merchantIdType) {
		this.merchantIdType = merchantIdType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStaffBizCode() {
		return this.staffBizCode;
	}
	public void setStaffBizCode(String staffBizCode) {
		this.staffBizCode = staffBizCode;
	}

	public String getStaffId() {
		return this.staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffMobile() {
		return this.staffMobile;
	}
	public void setStaffMobile(String staffMobile) {
		this.staffMobile = staffMobile;
	}

	public String getStaffName() {
		return this.staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffType() {
		return this.staffType;
	}
	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

}
