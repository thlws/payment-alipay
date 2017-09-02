package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商按照条件分页查询leads信息
 *
 * @author auto create
 * @since 1.0, 2015-11-20 19:37:52
 */
public class AlipayOfflineSaleleadsInfoQuerybypageModel extends AlipayObject {

	private static final long serialVersionUID = 7866177893672573872L;

	/**
	 * 分配主体----服务商小二
	 */
	@ApiField("assign_principal_id")
	private String assignPrincipalId;

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
	 * 三级分类
	 */
	@ApiField("detail_category_id")
	private String detailCategoryId;

	/**
	 * 区域编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 查询截止时间，如果是公海查询表示创建时间，私海查询表示认领时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * leads名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 查询类型
	 */
	@ApiField("ope_type")
	private String opeType;

	/**
	 * 当前页，***注意页数从1开始***
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页容量：最小1，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 查询时间
	 */
	@ApiField("query_time")
	private String queryTime;

	/**
	 * 门店标签，注意传多个分店信息无法匹配
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 签约确认状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * 查询起始时间，如果是公海查询表示创建时间，私海查询表示认领时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 行业小类
	 */
	@ApiField("sub_category_id")
	private String subCategoryId;

	public String getAssignPrincipalId() {
		return this.assignPrincipalId;
	}
	public void setAssignPrincipalId(String assignPrincipalId) {
		this.assignPrincipalId = assignPrincipalId;
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

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpeType() {
		return this.opeType;
	}
	public void setOpeType(String opeType) {
		this.opeType = opeType;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getQueryTime() {
		return this.queryTime;
	}
	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getSubCategoryId() {
		return this.subCategoryId;
	}
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

}
