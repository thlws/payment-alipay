package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.member.card.update response.
 * 
 * @author auto create
 * @since 1.0, 2015-09-23 14:14:10
 */
public class AlipayUserMemberCardUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4877584967369772524L;

	/** 
	 * 请求失败时，不存在本参数；
	 */
	@ApiField("card")
	private String card;

	/** 
	 * 返回结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 处理结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setCard(String card) {
		this.card = card;
	}
	public String getCard( ) {
		return this.card;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
