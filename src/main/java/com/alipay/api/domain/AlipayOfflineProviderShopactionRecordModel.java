package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv 回传的商户操作行为信息调用接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:15
 */
public class AlipayOfflineProviderShopactionRecordModel extends AlipayObject {

	private static final long serialVersionUID = 7844536774885454392L;

	/**
	 * json格式，操作详情（根据操作类型不同而不同）（太大的话可能会导致内部处理失败）
	 */
	@ApiField("action_detail")
	private String actionDetail;

	/**
	 * 本次请求的唯一键（操作实体主键+平台字符串）
	 */
	@ApiField("action_outer_id")
	private String actionOuterId;

	/**
	 * 操作类型（insert_table/update_table/insert_dish/delete_dish/soldout_dish/modify_dish/modify_shop_status）
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 商户行为发生时间 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("date_time")
	private String dateTime;

	/**
	 * 操作实体（实体+操作类型决定一个真正的操作【店铺+新增、座位+修改、店铺+适时状态等等】）
	 */
	@ApiField("entity")
	private String entity;

	/**
	 * 所属行业 (餐饮：REPAST)
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 操作的店铺对象
	 */
	@ApiField("outer_shop_do")
	private OuterShopDO outerShopDo;

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

	public OuterShopDO getOuterShopDo() {
		return this.outerShopDo;
	}
	public void setOuterShopDo(OuterShopDO outerShopDo) {
		this.outerShopDo = outerShopDo;
	}

}
