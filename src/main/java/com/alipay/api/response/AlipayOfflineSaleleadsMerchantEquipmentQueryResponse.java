package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopEquipmentBindInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.saleleads.merchant.equipment.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-16 16:17:08
 */
public class AlipayOfflineSaleleadsMerchantEquipmentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5383758677722317436L;

	/** 
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 商户PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 门店机具绑定信息
	 */
	@ApiListField("shopinfos")
	@ApiField("shop_equipment_bind_info")
	private List<ShopEquipmentBindInfo> shopinfos;

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setShopinfos(List<ShopEquipmentBindInfo> shopinfos) {
		this.shopinfos = shopinfos;
	}
	public List<ShopEquipmentBindInfo> getShopinfos( ) {
		return this.shopinfos;
	}

}
