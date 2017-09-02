package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用借还创建订单
 *
 * @author auto create
 * @since 1.0, 2016-11-24 16:42:04
 */
public class ZhimaMerchantOrderRentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4743292178192616562L;

	/**
	 * 借用周期，必须是正整数
	 */
	@ApiField("borrow_cycle")
	private String borrowCycle;

	/**
	 * 借用周期单位：
HOUR:小时
DAY:天
	 */
	@ApiField("borrow_cycle_unit")
	private String borrowCycleUnit;

	/**
	 * 物品借用门店
	 */
	@ApiField("borrow_shop_name")
	private String borrowShopName;

	/**
	 * 押金
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/**
	 * 是否允许不准入的用户支持支付押金借用:
Y:支持
N:不支持
	 */
	@ApiField("deposit_state")
	private String depositState;

	/**
	 * 物品名称,最长不能超过14个汉字
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 回调到商户的url地址
	 */
	@ApiField("invoke_return_url")
	private String invokeReturnUrl;

	/**
	 * 商户发起借用服务时，需要在借用结束后返回给商户的参数
	 */
	@ApiField("invoke_state")
	private String invokeState;

	/**
	 * 商户访问蚂蚁的对接模式：
WINDOWS-支付宝服务窗
	 */
	@ApiField("invoke_type")
	private String invokeType;

	/**
	 * 废弃，使用蚂蚁开放平台应用中的网关地址
	 */
	@ApiField("notify_url")
	private String notifyUrl;

	/**
	 * 外部订单号，需要唯一，由商户传入，芝麻内部会做幂等控制，格式为：yyyyMMddHHmmss+随机数
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 信用借还的产品码:w1010100000000002858
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 租金，同时也是物品价值，用户需根据该字段金额进行赔偿
:
>0.00元，代表有租金
<=0.00元或者为空，代表没有租金
	 */
	@ApiField("rent_amount")
	private String rentAmount;

	/**
	 * 租金信息描述 ,长度14个汉字，只用于页面展示给C端用户
	 */
	@ApiField("rent_info")
	private String rentInfo;

	/**
	 * 租金单位：
DAY_YUAN:元/天
HOUR_YUAN:元/小时
	 */
	@ApiField("rent_unit")
	private String rentUnit;

	public String getBorrowCycle() {
		return this.borrowCycle;
	}
	public void setBorrowCycle(String borrowCycle) {
		this.borrowCycle = borrowCycle;
	}

	public String getBorrowCycleUnit() {
		return this.borrowCycleUnit;
	}
	public void setBorrowCycleUnit(String borrowCycleUnit) {
		this.borrowCycleUnit = borrowCycleUnit;
	}

	public String getBorrowShopName() {
		return this.borrowShopName;
	}
	public void setBorrowShopName(String borrowShopName) {
		this.borrowShopName = borrowShopName;
	}

	public String getDepositAmount() {
		return this.depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getDepositState() {
		return this.depositState;
	}
	public void setDepositState(String depositState) {
		this.depositState = depositState;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getInvokeReturnUrl() {
		return this.invokeReturnUrl;
	}
	public void setInvokeReturnUrl(String invokeReturnUrl) {
		this.invokeReturnUrl = invokeReturnUrl;
	}

	public String getInvokeState() {
		return this.invokeState;
	}
	public void setInvokeState(String invokeState) {
		this.invokeState = invokeState;
	}

	public String getInvokeType() {
		return this.invokeType;
	}
	public void setInvokeType(String invokeType) {
		this.invokeType = invokeType;
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRentAmount() {
		return this.rentAmount;
	}
	public void setRentAmount(String rentAmount) {
		this.rentAmount = rentAmount;
	}

	public String getRentInfo() {
		return this.rentInfo;
	}
	public void setRentInfo(String rentInfo) {
		this.rentInfo = rentInfo;
	}

	public String getRentUnit() {
		return this.rentUnit;
	}
	public void setRentUnit(String rentUnit) {
		this.rentUnit = rentUnit;
	}

}
