package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv 回传的用户操作行为信息调用接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:15
 */
public class AlipayOfflineProviderUseractionRecordModel extends AlipayObject {

	private static final long serialVersionUID = 6272432911164721634L;

	/**
	 * 行为描述 json格式，有特定的字段(太大的话可能会导致内部处理失败)
	 */
	@ApiField("action_detail")
	private String actionDetail;

	/**
	 * 本次请求的唯一键（操作实体主键+平台字符串）
	 */
	@ApiField("action_outer_id")
	private String actionOuterId;

	/**
	 * 行为类型（点菜ORDER_DISHES、点歌、领取号）
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 插件ID（用户在您的那个插件发生的行为）
	 */
	@ApiField("alipay_app_id")
	private String alipayAppId;

	/**
	 * 行为发生时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("date_time")
	private String dateTime;

	/**
	 * user用户实体
	 */
	@ApiField("entity")
	private String entity;

	/**
	 * 所属行业 (餐饮：REPAST)
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 电话号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 合作店铺对象 信息
	 */
	@ApiField("outer_shop_do")
	private OuterShopDO outerShopDo;

	/**
	 * Source对应平台用户ID
	 */
	@ApiField("platform_user_id")
	private String platformUserId;

	/**
	 * 平台来源域名
	 */
	@ApiField("source")
	private String source;

	/**
	 * source对应平台的id
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionDetail() {
		return this.actionDetail;
	}
	public void setActionDetail(String actionDetail) {
		this.actionDetail = actionDetail;
	}

	public String getActionOuterId() {
		return this.actionOuterId;
	}
	public void setActionOuterId(String actionOuterId) {
		this.actionOuterId = actionOuterId;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAlipayAppId() {
		return this.alipayAppId;
	}
	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getEntity() {
		return this.entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public OuterShopDO getOuterShopDo() {
		return this.outerShopDo;
	}
	public void setOuterShopDo(OuterShopDO outerShopDo) {
		this.outerShopDo = outerShopDo;
	}

	public String getPlatformUserId() {
		return this.platformUserId;
	}
	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
