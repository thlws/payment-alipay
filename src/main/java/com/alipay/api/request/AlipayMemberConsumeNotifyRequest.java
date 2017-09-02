package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMemberConsumeNotifyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.member.consume.notify request
 * 
 * @author auto create
 * @since 1.0, 2014-12-09 14:01:31
 */
public class AlipayMemberConsumeNotifyRequest implements AlipayRequest<AlipayMemberConsumeNotifyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 实付金额
	 */
	private String actPayAmount;

	/** 
	* 会员卡卡号
	 */
	private String bizCardNo;

	/** 
	* point:整数
balance:金额格式
level:String
	 */
	private String cardInfo;

	/** 
	* 商户给会员开设的卡号，最大长度不超过32
	 */
	private String externalCardNo;

	/** 
	* 获取权益列表，是指由于发生当前交易，而使用户最终获取到的特权列表信息，
实际消耗的权益，这是个json字段
&#61550;	卡面额权益说明（元为单位）
benefitType：PRE_FUND（卡面额）
amount：80.00
&#61550;	券权益说明（张数为单位）
benefitType：COUPON
count：5
description：2元抵用券
amount：10.00
	 */
	private String gainBenefitList;

	/** 
	* 备注信息，现有直接填写门店信息
	 */
	private String memo;

	/** 
	* 门店编号
	 */
	private String shopCode;

	/** 
	* ALIPAY：支付宝电子卡
ENTITY：实体卡
OTHER：其他
	 */
	private String swipeCertType;

	/** 
	* 交易金额：本次交易的实际总金额（可认为标价金额）
	 */
	private String tradeAmount;

	/** 
	* 交易名称
	 */
	private String tradeName;

	/** 
	* 商户端对当前消费交易的单据号
	 */
	private String tradeNo;

	/** 
	* 交易事件
	 */
	private String tradeTime;

	/** 
	* 交易类型
消费：TRADE
充值：DEPOSIT
	 */
	private String tradeType;

	/** 
	* 实际消耗的权益，这是个json字段
&#61550;	卡面额权益说明（元为单位）
benefitType：PRE_FUND（卡面额）
amount：80.00

&#61550;	折扣权益说明（元为单位）
benefitType：DISCOUNT
amount：10.00
description：折扣10元

&#61550;	券权益说明（张数为单位）
benefitType：COUPON
count：5
description：2元抵用券
	 */
	private String useBenefitList;

	public void setActPayAmount(String actPayAmount) {
		this.actPayAmount = actPayAmount;
	}
	public String getActPayAmount() {
		return this.actPayAmount;
	}

	public void setBizCardNo(String bizCardNo) {
		this.bizCardNo = bizCardNo;
	}
	public String getBizCardNo() {
		return this.bizCardNo;
	}

	public void setCardInfo(String cardInfo) {
		this.cardInfo = cardInfo;
	}
	public String getCardInfo() {
		return this.cardInfo;
	}

	public void setExternalCardNo(String externalCardNo) {
		this.externalCardNo = externalCardNo;
	}
	public String getExternalCardNo() {
		return this.externalCardNo;
	}

	public void setGainBenefitList(String gainBenefitList) {
		this.gainBenefitList = gainBenefitList;
	}
	public String getGainBenefitList() {
		return this.gainBenefitList;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	public String getShopCode() {
		return this.shopCode;
	}

	public void setSwipeCertType(String swipeCertType) {
		this.swipeCertType = swipeCertType;
	}
	public String getSwipeCertType() {
		return this.swipeCertType;
	}

	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	public String getTradeAmount() {
		return this.tradeAmount;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}
	public String getTradeTime() {
		return this.tradeTime;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getTradeType() {
		return this.tradeType;
	}

	public void setUseBenefitList(String useBenefitList) {
		this.useBenefitList = useBenefitList;
	}
	public String getUseBenefitList() {
		return this.useBenefitList;
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
		return "alipay.member.consume.notify";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("act_pay_amount", this.actPayAmount);
		txtParams.put("biz_card_no", this.bizCardNo);
		txtParams.put("card_info", this.cardInfo);
		txtParams.put("external_card_no", this.externalCardNo);
		txtParams.put("gain_benefit_list", this.gainBenefitList);
		txtParams.put("memo", this.memo);
		txtParams.put("shop_code", this.shopCode);
		txtParams.put("swipe_cert_type", this.swipeCertType);
		txtParams.put("trade_amount", this.tradeAmount);
		txtParams.put("trade_name", this.tradeName);
		txtParams.put("trade_no", this.tradeNo);
		txtParams.put("trade_time", this.tradeTime);
		txtParams.put("trade_type", this.tradeType);
		txtParams.put("use_benefit_list", this.useBenefitList);
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

	public Class<AlipayMemberConsumeNotifyResponse> getResponseClass() {
		return AlipayMemberConsumeNotifyResponse.class;
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
