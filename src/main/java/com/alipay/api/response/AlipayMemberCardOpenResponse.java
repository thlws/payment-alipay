package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.member.card.open response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:29
 */
public class AlipayMemberCardOpenResponse extends AlipayResponse {

	private static final long serialVersionUID = 4172454934338872619L;

	/** 
	 * 请求失败时，不存在本参数；
请求成功时，本参数不为空，json格式，目前仅支持如下key：
bizCardNo（支付宝会员卡卡号）。
	 */
	@ApiField("card")
	private String card;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数为错误代码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数返回具体的错误原因。
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 请求是否成功。
T代表成功
F代表失败
	 */
	@ApiField("success")
	private String success;

	public void setCard(String card) {
		this.card = card;
	}
	public String getCard( ) {
		return this.card;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
