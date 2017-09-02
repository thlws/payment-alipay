package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三方服务商添加lead同步至口碑平台
 *
 * @author auto create
 * @since 1.0, 2015-11-20 19:24:43
 */
public class AlipayOfflineSaleleadsInfoAddModel extends AlipayObject {

	private static final long serialVersionUID = 4294139373676121883L;

	/**
	 * 联系地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 行业大类
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 11位数字手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 备注
	 */
	@ApiField("description")
	private String description;

	/**
	 * 行业三级分类
	 */
	@ApiField("detail_category_id")
	private String detailCategoryId;

	/**
	 * 区域编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作用户的支付账号id
	 */
	@ApiField("ope_pid")
	private String opePid;

	/**
	 * 其他联系方式
	 */
	@ApiField("other_contact_info")
	private String otherContactInfo;

	/**
	 * 省份编码，国家统一编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 请求流水id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 1-99999999的数字
	 */
	@ApiField("scale")
	private Long scale;

	/**
	 * json数组的字符串
	 */
	@ApiField("shop_info")
	private String shopInfo;

	/**
	 * 行业小类
	 */
	@ApiField("sub_category_id")
	private String subCategoryId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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

	public String getDetailCategoryId() {
		return this.detailCategoryId;
	}
	public void setDetailCategoryId(String detailCategoryId) {
		this.detailCategoryId = detailCategoryId;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpePid() {
		return this.opePid;
	}
	public void setOpePid(String opePid) {
		this.opePid = opePid;
	}

	public String getOtherContactInfo() {
		return this.otherContactInfo;
	}
	public void setOtherContactInfo(String otherContactInfo) {
		this.otherContactInfo = otherContactInfo;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getScale() {
		return this.scale;
	}
	public void setScale(Long scale) {
		this.scale = scale;
	}

	public String getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(String shopInfo) {
		this.shopInfo = shopInfo;
	}

	public String getSubCategoryId() {
		return this.subCategoryId;
	}
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

}
