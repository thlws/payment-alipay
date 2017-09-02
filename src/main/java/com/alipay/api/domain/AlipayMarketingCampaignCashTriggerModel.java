package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触发现金红包活动
 *
 * @author auto create
 * @since 1.0, 2016-10-14 11:46:15
 */
public class AlipayMarketingCampaignCashTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 3828168752146291861L;

	/**
	 * 现金活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/**
	 * 用户登录账号名：邮箱或手机号。user_id与login_id至少有一个非空，都非空时，以user_id为准
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 用户唯一标识userId。user_id与login_id至少有一个非空；都非空时，以user_id为准
	 */
	@ApiField("user_id")
	private String userId;

	public String getCrowdNo() {
		return this.crowdNo;
	}
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
