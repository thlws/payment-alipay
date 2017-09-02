package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗机构根据用户userId查询该账户的医保卡相关信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayCommerceMedicalCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3189624756547928751L;

	/**
	 * 买家支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 卡颁发机构编号
	 */
	@ApiField("card_org_no")
	private String cardOrgNo;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 跳回的地址
	 */
	@ApiField("return_url")
	private String returnUrl;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getCardOrgNo() {
		return this.cardOrgNo;
	}
	public void setCardOrgNo(String cardOrgNo) {
		this.cardOrgNo = cardOrgNo;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

}
