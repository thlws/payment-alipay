package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiagnoseResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.smartmanagement.diagnose response.
 * 
 * @author auto create
 * @since 1.0, 2016-09-10 19:12:49
 */
public class KoubeiMarketingDataSmartmanagementDiagnoseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7161252483312565775L;

	/** 
	 * 诊断结果CODE，目前有如下三个值
TRADE_RATE	流失会员占比高
USER_COUNT	会员数量少
REPAY_RATE	复购率低

提示文案业务参数,JSON对象形式返回，JSON的KEY包含tradeCycle，userRate，industryRate，repayRate调用方根据诊断CODE分别给出不同的诊断文案，例如：
TRADE_RATE	流失会员占比高	您当前${tradeCycle}(90)天未到店消费会员占总会员${userRate}(40%)，落后同行${industryRate}(60%)的商家。				
USER_COUNT	会员数量少	您当前店均会员量较少，落后同行${industryRate}(60%)的商家。
				
REPAY_RATE	复购率低	您当前${tradeCycle}(60)天会员回头率为${repayRate}(30%)，落后于同行${industryRate}(60%)的商家。
	 */
	@ApiListField("diagnose_result")
	@ApiField("diagnose_result")
	private List<DiagnoseResult> diagnoseResult;

	public void setDiagnoseResult(List<DiagnoseResult> diagnoseResult) {
		this.diagnoseResult = diagnoseResult;
	}
	public List<DiagnoseResult> getDiagnoseResult( ) {
		return this.diagnoseResult;
	}

}
