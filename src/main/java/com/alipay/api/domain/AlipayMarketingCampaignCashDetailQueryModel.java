package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 现金活动详情查询
 *
 * @author auto create
 * @since 1.0, 2016-10-02 20:51:25
 */
public class AlipayMarketingCampaignCashDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5438469656776913867L;

	/**
	 * 要查询的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	public String getCrowdNo() {
		return this.crowdNo;
	}
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

}
