package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店机具查询
 *
 * @author auto create
 * @since 1.0, 2015-11-20 19:28:49
 */
public class AlipayOfflineSaleleadsMerchantEquipmentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6893719835248349912L;

	/**
	 * 商户PID（merchant_pid和shop_id必填其一）
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作用户的支付账号id
	 */
	@ApiField("ope_pid")
	private String opePid;

	/**
	 * 请求流水id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 商户下的门店ID（merchant_pid和shop_id必填其一）
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOpePid() {
		return this.opePid;
	}
	public void setOpePid(String opePid) {
		this.opePid = opePid;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
