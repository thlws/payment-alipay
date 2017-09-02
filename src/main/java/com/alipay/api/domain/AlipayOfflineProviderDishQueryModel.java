package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品热度查询
 *
 * @author auto create
 * @since 1.0, 2016-11-08 15:49:50
 */
public class AlipayOfflineProviderDishQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2788528372284575136L;

	/**
	 * 商家分类名称，商家自定义的菜品分类的名称，非必填
	 */
	@ApiField("dish_type_name")
	private String dishTypeName;

	/**
	 * order_by：1，菜品热度升序查询，order_by：2，菜品热度降序查询。非必填，为空时默认为2
	 */
	@ApiField("order_by")
	private String orderBy;

	/**
	 * 菜品ID，当需要查询指定菜品的时候传递，非必填
	 */
	@ApiField("outer_dish_id")
	private String outerDishId;

	/**
	 * 需要查询的第几页信息。非必填。默认为1
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 分页查询每页的条数，默认为20条，非必填
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 外部商户ID（必填）需要查询的商家名下的门店/子商户的ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDishTypeName() {
		return this.dishTypeName;
	}
	public void setDishTypeName(String dishTypeName) {
		this.dishTypeName = dishTypeName;
	}

	public String getOrderBy() {
		return this.orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOuterDishId() {
		return this.outerDishId;
	}
	public void setOuterDishId(String outerDishId) {
		this.outerDishId = outerDishId;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
