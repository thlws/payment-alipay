package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.member.consume.notify response.
 * 
 * @author auto create
 * @since 1.0, 2014-12-09 14:01:31
 */
public class AlipayMemberConsumeNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6835879291388158529L;

	/** 
	 * 请求成功时，不存在本参数；
请求失败时，本参数为错误代码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * card_user_info不能为空
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 外部会员卡
	 */
	@ApiField("ext_card_no")
	private String extCardNo;

	/** 
	 * T:成功，F：失败
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

	public void setExtCardNo(String extCardNo) {
		this.extCardNo = extCardNo;
	}
	public String getExtCardNo( ) {
		return this.extCardNo;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
