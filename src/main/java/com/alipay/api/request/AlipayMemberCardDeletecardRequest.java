package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMemberCardDeletecardResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.member.card.deletecard request
 * 
 * @author auto create
 * @since 1.0, 2014-12-01 11:13:25
 */
public class AlipayMemberCardDeletecardRequest implements AlipayRequest<AlipayMemberCardDeletecardResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 商户端删卡业务流水号
	 */
	private String bizSerialNo;

	/** 
	* 发卡商户信息，json格式。
目前仅支持如下key：
&#61548;	merchantUniId：商户唯一标识
&#61548;	merchantUniIdType：支持以下3种取值。
LOGON_ID：商户登录ID，邮箱或者手机号格式；
UID：商户的支付宝用户号，以2088开头的16位纯数字组成；
BINDING_MOBILE：商户支付宝账号绑定的手机号。
	 */
	private String cardMerchantInfo;

	/** 
	* 删卡扩展参数，json格式。
用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。
目前支持如下key：
newCardNo：新卡号
doneeUserId：受赠人userId
	 */
	private String extInfo;

	/** 
	* 商户会员卡号
	 */
	private String externalCardNo;

	/** 
	* CANCEL：销户
PRESENT：转赠
	 */
	private String reasonCode;

	/** 
	* 请求来源
	 */
	private String requestFrom;

	public void setBizSerialNo(String bizSerialNo) {
		this.bizSerialNo = bizSerialNo;
	}
	public String getBizSerialNo() {
		return this.bizSerialNo;
	}

	public void setCardMerchantInfo(String cardMerchantInfo) {
		this.cardMerchantInfo = cardMerchantInfo;
	}
	public String getCardMerchantInfo() {
		return this.cardMerchantInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExternalCardNo(String externalCardNo) {
		this.externalCardNo = externalCardNo;
	}
	public String getExternalCardNo() {
		return this.externalCardNo;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReasonCode() {
		return this.reasonCode;
	}

	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}
	public String getRequestFrom() {
		return this.requestFrom;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.member.card.deletecard";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_serial_no", this.bizSerialNo);
		txtParams.put("card_merchant_info", this.cardMerchantInfo);
		txtParams.put("ext_info", this.extInfo);
		txtParams.put("external_card_no", this.externalCardNo);
		txtParams.put("reason_code", this.reasonCode);
		txtParams.put("request_from", this.requestFrom);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayMemberCardDeletecardResponse> getResponseClass() {
		return AlipayMemberCardDeletecardResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
