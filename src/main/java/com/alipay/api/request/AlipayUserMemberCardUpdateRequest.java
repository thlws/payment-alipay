package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayUserMemberCardUpdateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.user.member.card.update request
 * 
 * @author auto create
 * @since 1.0, 2015-09-23 14:14:10
 */
public class AlipayUserMemberCardUpdateRequest implements AlipayRequest<AlipayUserMemberCardUpdateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 商户会员卡余额
	 */
	private String balance;

	/** 
	* 会员卡卡号
	 */
	private String bizCardNo;

	/** 
	* 发卡商户信息，json格式。
目前仅支持如下key：
&#61548;	merchantUniId：商户唯一标识
&#61548;	merchantUniIdType：支持以下3种取值。
LOGON_ID：商户登录ID，邮箱或者手机号格式；
UID：商户的支付宝用户号，以2088开头的16位纯数字组成；
BINDING_MOBILE：商户支付宝账号绑定的手机号。
   注意：
本参数主要用于发卡平台接入场景，request_from为PLATFORM时，不能为空。
	 */
	private String cardMerchantInfo;

	/** 
	* 扩展参数，json格式。
用于商户的特定业务信息的传递，只有商户与支付宝约定了传递此参数且约定了参数含义，此参数才有效。
	 */
	private String extInfo;

	/** 
	* 商户会员卡号。 
比如淘宝会员卡号、商户实体会员卡号、商户自有CRM虚拟卡号等
	 */
	private String externalCardNo;

	/** 
	* ALIPAY：支付宝
PARTNER：商户
PLATFORM：平台商
	 */
	private String issuerType;

	/** 
	* 商户会员卡会员等级
	 */
	private String level;

	/** 
	* 时间戳参数-orrur_time（精确至毫秒），标识业务发生的时间
orrur_time 必须为long类型整数,时间维度目前未限制
	 */
	private String orrurTime;

	/** 
	* 商户会员卡积分
	 */
	private Long point;

	/** 
	* 请求来源。
PLATFORM：发卡平台商
PARTNER：直联商户
	 */
	private String requestFrom;

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance() {
		return this.balance;
	}

	public void setBizCardNo(String bizCardNo) {
		this.bizCardNo = bizCardNo;
	}
	public String getBizCardNo() {
		return this.bizCardNo;
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

	public void setIssuerType(String issuerType) {
		this.issuerType = issuerType;
	}
	public String getIssuerType() {
		return this.issuerType;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevel() {
		return this.level;
	}

	public void setOrrurTime(String orrurTime) {
		this.orrurTime = orrurTime;
	}
	public String getOrrurTime() {
		return this.orrurTime;
	}

	public void setPoint(Long point) {
		this.point = point;
	}
	public Long getPoint() {
		return this.point;
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
		return "alipay.user.member.card.update";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("balance", this.balance);
		txtParams.put("biz_card_no", this.bizCardNo);
		txtParams.put("card_merchant_info", this.cardMerchantInfo);
		txtParams.put("ext_info", this.extInfo);
		txtParams.put("external_card_no", this.externalCardNo);
		txtParams.put("issuer_type", this.issuerType);
		txtParams.put("level", this.level);
		txtParams.put("orrur_time", this.orrurTime);
		txtParams.put("point", this.point);
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

	public Class<AlipayUserMemberCardUpdateResponse> getResponseClass() {
		return AlipayUserMemberCardUpdateResponse.class;
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
