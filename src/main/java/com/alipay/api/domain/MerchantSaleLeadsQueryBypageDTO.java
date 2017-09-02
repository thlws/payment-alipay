package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商按照条件分页查询leads信息返回对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class MerchantSaleLeadsQueryBypageDTO extends AlipayObject {

	private static final long serialVersionUID = 6619921213295462997L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 认领Leads的服务商支付宝卡号
	 */
	@ApiField("agent_alipay_card_no")
	private String agentAlipayCardNo;

	/**
	 * 商户支付宝卡号
	 */
	@ApiField("alipay_card_no")
	private String alipayCardNo;

	/**
	 * 所属区域
	 */
	@ApiField("area")
	private String area;

	/**
	 * 所属支付宝小二
	 */
	@ApiField("assign_alipay_staff_id")
	private String assignAlipayStaffId;

	/**
	 * 分配主体----服务商小二
	 */
	@ApiField("assign_principal_id")
	private String assignPrincipalId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 分类说明
	 */
	@ApiField("category")
	private String category;

	/**
	 * 商户认领状态
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 联系人手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 备注信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 当面付审核状态
	 */
	@ApiField("ff_audit_status")
	private String ffAuditStatus;

	/**
	 * 当面付生效时间
	 */
	@ApiField("ff_online")
	private String ffOnline;

	/**
	 * leads创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 是否开店
	 */
	@ApiField("is_open_shop")
	private String isOpenShop;

	/**
	 * leadsId
	 */
	@ApiField("leands_id")
	private String leandsId;

	/**
	 * leads名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 其它联系方式
	 */
	@ApiField("other_contact_info")
	private String otherContactInfo;

	/**
	 * 门店数
	 */
	@ApiField("scale")
	private String scale;

	/**
	 * 商户外部标识，来源于支付宝体系外
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 商户外部标识类型，来源于支付宝体系外
	 */
	@ApiField("seller_id_type")
	private String sellerIdType;

	/**
	 * 门店信息
	 */
	@ApiField("shop_info")
	private String shopInfo;

	/**
	 * 当leads签约的pid是非云纵pid，且leads是被签约的leads信息说明
	 */
	@ApiField("show_info")
	private String showInfo;

	/**
	 * 签约审核状态
	 */
	@ApiField("sign_audit_status")
	private String signAuditStatus;

	/**
	 * 签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAgentAlipayCardNo() {
		return this.agentAlipayCardNo;
	}
	public void setAgentAlipayCardNo(String agentAlipayCardNo) {
		this.agentAlipayCardNo = agentAlipayCardNo;
	}

	public String getAlipayCardNo() {
		return this.alipayCardNo;
	}
	public void setAlipayCardNo(String alipayCardNo) {
		this.alipayCardNo = alipayCardNo;
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

	public String getAssignPrincipalId() {
		return this.assignPrincipalId;
	}
	public void setAssignPrincipalId(String assignPrincipalId) {
		this.assignPrincipalId = assignPrincipalId;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFfAuditStatus() {
		return this.ffAuditStatus;
	}
	public void setFfAuditStatus(String ffAuditStatus) {
		this.ffAuditStatus = ffAuditStatus;
	}

	public String getFfOnline() {
		return this.ffOnline;
	}
	public void setFfOnline(String ffOnline) {
		this.ffOnline = ffOnline;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getIsOpenShop() {
		return this.isOpenShop;
	}
	public void setIsOpenShop(String isOpenShop) {
		this.isOpenShop = isOpenShop;
	}

	public String getLeandsId() {
		return this.leandsId;
	}
	public void setLeandsId(String leandsId) {
		this.leandsId = leandsId;
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

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerIdType() {
		return this.sellerIdType;
	}
	public void setSellerIdType(String sellerIdType) {
		this.sellerIdType = sellerIdType;
	}

	public String getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(String shopInfo) {
		this.shopInfo = shopInfo;
	}

	public String getShowInfo() {
		return this.showInfo;
	}
	public void setShowInfo(String showInfo) {
		this.showInfo = showInfo;
	}

	public String getSignAuditStatus() {
		return this.signAuditStatus;
	}
	public void setSignAuditStatus(String signAuditStatus) {
		this.signAuditStatus = signAuditStatus;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

}
