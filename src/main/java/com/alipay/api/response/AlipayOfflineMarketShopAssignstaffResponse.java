package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.assignstaff response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-16 16:13:37
 */
public class AlipayOfflineMarketShopAssignstaffResponse extends AlipayResponse {

	private static final long serialVersionUID = 7447342753253176828L;

	/** 
	 * 如果失败，存放原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 操作是否成功
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 分配失败的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
