package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.member.card.query response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:27
 */
public class AlipayMemberCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3558821223435679894L;

	/** 
	 * 请求失败时，不存在本参数；
请求成功时，本参数不为空，json格式，目前支持如下key：
bizCardNo（支付宝会员卡卡号，用户会员卡存在时，该属性不为空）
openDate(会员卡开卡时间，格式为yyyy-MM-dd HH:mm:ss，用户会员卡存在时，该属性不为空)
validDate(会员卡有效期，格式为yyyy-MM-dd HH:mm:ss，本参数为空代表永久有效)
level(会员卡等级，由商户自定义)
point(会员卡积分)
pCardBalance(资金卡余额，单位：元，精确到小数点后两位)。
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
