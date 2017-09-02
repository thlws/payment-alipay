package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户智能活动配置方案接口
 *
 * @author auto create
 * @since 1.0, 2016-09-10 19:12:43
 */
public class KoubeiMarketingDataSmartactivityConfigModel extends AlipayObject {

	private static final long serialVersionUID = 4213516216749258854L;

	/**
	 * 诊断结果CODE，目前有如下三个值
TRADE_RATE	流失会员占比高
USER_COUNT	会员数量少
REPAY_RATE	复购率低
	 */
	@ApiField("diagnose_code")
	private String diagnoseCode;

	public String getDiagnoseCode() {
		return this.diagnoseCode;
	}
	public void setDiagnoseCode(String diagnoseCode) {
		this.diagnoseCode = diagnoseCode;
	}

}
