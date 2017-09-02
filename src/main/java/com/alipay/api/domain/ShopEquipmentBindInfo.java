package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店机具绑定信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class ShopEquipmentBindInfo extends AlipayObject {

	private static final long serialVersionUID = 3371335755688477444L;

	/**
	 * 机具绑定信息
	 */
	@ApiListField("equipments")
	@ApiField("equipment_bind_info")
	private List<EquipmentBindInfo> equipments;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public List<EquipmentBindInfo> getEquipments() {
		return this.equipments;
	}
	public void setEquipments(List<EquipmentBindInfo> equipments) {
		this.equipments = equipments;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
