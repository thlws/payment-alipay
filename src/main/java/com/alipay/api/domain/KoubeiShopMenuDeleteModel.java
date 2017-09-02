package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除菜单接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:11
 */
public class KoubeiShopMenuDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4592333625234149832L;

	/**
	 * 菜单id
	 */
	@ApiField("menu_id")
	private String menuId;

	public String getMenuId() {
		return this.menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

}
