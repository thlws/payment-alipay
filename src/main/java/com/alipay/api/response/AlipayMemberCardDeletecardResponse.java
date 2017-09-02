package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.member.card.deletecard response.
 * 
 * @author auto create
 * @since 1.0, 2014-12-01 11:13:25
 */
public class AlipayMemberCardDeletecardResponse extends AlipayResponse {

	private static final long serialVersionUID = 4296624393595826278L;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数为错误代码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 返回码描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * T：成功
F：失败
	 */
	@ApiField("success")
	private String success;

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
