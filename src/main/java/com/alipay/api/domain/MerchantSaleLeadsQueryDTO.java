package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询Leads信息单条数据返回对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class MerchantSaleLeadsQueryDTO extends AlipayObject {

	private static final long serialVersionUID = 1477399854428119554L;

	/**
	 * 联系地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 所在区域
	 */
	@ApiField("area")
	private String area;

	/**
	 * 归属人支付宝PID
	 */
	@ApiField("assign_alipay_staff_id")
	private String assignAlipayStaffId;

	/**
	 * 归属人
	 */
	@ApiField("assign_person")
	private String assignPerson;

	/**
	 * 品牌名称
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 行业分类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 认领时间
	 */
	@ApiField("claim_date")
	private String claimDate;

	/**
	 * 认领状态
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 联系人手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 备注
	 */
	@ApiField("description")
	private String description;

	/**
	 * leadsid
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 商户名称（公司名称）
	 */
	@ApiField("name")
	private String name;

	/**
	 * 其他联系方式
	 */
	@ApiField("other_contact_info")
	private String otherContactInfo;

	/**
	 * 门店数
	 */
	@ApiField("scale")
	private String scale;

	/**
	 * 门店信息
	 */
	@ApiField("shop_info")
	private String shopInfo;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getAssignAlipayStaffId() {
		return this.assignAlipayStaffId;
	}
	public void setAssignAlipayStaffId(String assignAlipayStaffId) {
		this.assignAlipayStaffId = assignAlipayStaffId;
	}

	public String getAssignPerson() {
		return this.assignPerson;
	}
	public void setAssignPerson(String assignPerson) {
		this.assignPerson = assignPerson;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getClaimDate() {
		return this.claimDate;
	}
	public void setClaimDate(String claimDate) {
		this.claimDate = claimDate;
	}

	public String getClaimStatus() {
		return this.claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOtherContactInfo() {
		return this.otherContactInfo;
	}
	public void setOtherContactInfo(String otherContactInfo) {
		this.otherContactInfo = otherContactInfo;
	}

	public String getScale() {
		return this.scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(String shopInfo) {
		this.shopInfo = shopInfo;
	}

}
