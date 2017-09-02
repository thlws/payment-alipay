package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户智能活动效果预测接口
 *
 * @author auto create
 * @since 1.0, 2016-09-10 19:12:54
 */
public class KoubeiMarketingDataSmartactivityForecastModel extends AlipayObject {

	private static final long serialVersionUID = 6188649665341986598L;

	/**
	 * 活动配置CODE
	 */
	@ApiField("config_code")
	private String configCode;

	/**
	 * 诊断结果CODE，目前有如下三个值
TRADE_RATE	流失会员占比高
USER_COUNT	会员数量少
REPAY_RATE	复购率低
	 */
	@ApiField("diagnose_code")
	private String diagnoseCode;

	/**
	 * 可选参数有如下几个：
worth_value:奖品面额 单位：分
min_consume:门槛 单位：分
voucher_valid_days:券有效期天数
activity_valid_days:活动有效期天数
min_cost:领券门槛 单位：分
	 */
	@ApiField("ext_info")
	private String extInfo;

	public String getConfigCode() {
		return this.configCode;
	}
	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}

	public String getDiagnoseCode() {
		return this.diagnoseCode;
	}
	public void setDiagnoseCode(String diagnoseCode) {
		this.diagnoseCode = diagnoseCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}
