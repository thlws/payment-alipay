package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行充值申请接口结果描述
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class BankPayApplyResult extends AlipayObject {

	private static final long serialVersionUID = 5697227446546686728L;

	/**
	 * 支付宝账户类型对应的id。如email、手机等
	 */
	@ApiField("alipay_account_id")
	private String alipayAccountId;

	/**
	 * 支付宝账户类型
ALIPAY_LOGON_ID:支付宝账户登录名
ALIPAY_USER_ID:支付宝账户userId
	 */
	@ApiField("alipay_account_type")
	private String alipayAccountType;

	/**
	 * 支付宝转账订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 转账金额，单位为分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 收到转账申请时间。精确到秒，格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 银行订单号
	 */
	@ApiField("bank_order_no")
	private String bankOrderNo;

	/**
	 * 业务订单号
	 */
	@ApiField("biz_order_no")
	private String bizOrderNo;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 转账渠道请求参数描述。如网银包括网银提交地址、网银提交方式、网银提交具体参数。参数以&分隔。
	 */
	@ApiField("channel_desc")
	private String channelDesc;

	/**
	 * 转账备注信息。
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订单状态描述
P:处理中
S:成功
F:失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 付款方卡账户类型
CP:对公
PI:对私
	 */
	@ApiField("payer_card_account_type")
	private String payerCardAccountType;

	/**
	 * 机构用户卡id标示，填写卡id类型对应的值。如email、手机等
	 */
	@ApiField("payer_card_id")
	private String payerCardId;

	/**
	 * 付款方卡id标示类型
BANK_ID：银行用户uid
BANK_CARD_NO:银行卡号
	 */
	@ApiField("payer_card_id_type")
	private String payerCardIdType;

	/**
	 * 付款方卡账户类型
DC:借记卡
CC:贷记卡
	 */
	@ApiField("payer_card_type")
	private String payerCardType;

	/**
	 * 机构简称，由支付宝定义
CMBC:民生银行
	 */
	@ApiField("payer_inst_id")
	private String payerInstId;

	/**
	 * 转账完成时间。精确到秒，格式为：yyyy-MM-dd HH:mm:ss。转账处理中该字段为空
	 */
	@ApiField("success_time")
	private Date successTime;

	public String getAlipayAccountId() {
		return this.alipayAccountId;
	}
	public void setAlipayAccountId(String alipayAccountId) {
		this.alipayAccountId = alipayAccountId;
	}

	public String getAlipayAccountType() {
		return this.alipayAccountType;
	}
	public void setAlipayAccountType(String alipayAccountType) {
		this.alipayAccountType = alipayAccountType;
	}

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getBankOrderNo() {
		return this.bankOrderNo;
	}
	public void setBankOrderNo(String bankOrderNo) {
		this.bankOrderNo = bankOrderNo;
	}

	public String getBizOrderNo() {
		return this.bizOrderNo;
	}
	public void setBizOrderNo(String bizOrderNo) {
		this.bizOrderNo = bizOrderNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChannelDesc() {
		return this.channelDesc;
	}
	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayerCardAccountType() {
		return this.payerCardAccountType;
	}
	public void setPayerCardAccountType(String payerCardAccountType) {
		this.payerCardAccountType = payerCardAccountType;
	}

	public String getPayerCardId() {
		return this.payerCardId;
	}
	public void setPayerCardId(String payerCardId) {
		this.payerCardId = payerCardId;
	}

	public String getPayerCardIdType() {
		return this.payerCardIdType;
	}
	public void setPayerCardIdType(String payerCardIdType) {
		this.payerCardIdType = payerCardIdType;
	}

	public String getPayerCardType() {
		return this.payerCardType;
	}
	public void setPayerCardType(String payerCardType) {
		this.payerCardType = payerCardType;
	}

	public String getPayerInstId() {
		return this.payerInstId;
	}
	public void setPayerInstId(String payerInstId) {
		this.payerInstId = payerInstId;
	}

	public Date getSuccessTime() {
		return this.successTime;
	}
	public void setSuccessTime(Date successTime) {
		this.successTime = successTime;
	}

}
