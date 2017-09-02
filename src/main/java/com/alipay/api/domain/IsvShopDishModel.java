package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品热度统计模型
 *
 * @author auto create
 * @since 1.0, 2016-11-08 15:49:50
 */
public class IsvShopDishModel extends AlipayObject {

	private static final long serialVersionUID = 7249761427217362921L;

	/**
	 * 菜品的描述内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 菜品分类ID(商家自定义)
	 */
	@ApiField("dish_type_id")
	private String dishTypeId;

	/**
	 * 商家定义菜品的分类名称
	 */
	@ApiField("dish_type_name")
	private String dishTypeName;

	/**
	 * 菜品热度等级（0/0.5/1/1.5/2/2.5/3/3.5/4/4.5/5）该字段是对sort_col做离散化。
	 */
	@ApiField("good_level")
	private String goodLevel;

	/**
	 * merchant最近7天销量（份）
	 */
	@ApiField("merchant_sold_cnt_seven_d")
	private Long merchantSoldCntSevenD;

	/**
	 * merchant最近30天销量（份）
	 */
	@ApiField("merchant_sold_cnt_thirty_d")
	private Long merchantSoldCntThirtyD;

	/**
	 * merchant最近30天购买2次及以上的支付宝用户数
	 */
	@ApiField("merchant_sold_reusercnt_thirty_d")
	private Long merchantSoldReusercntThirtyD;

	/**
	 * merchant最近30天消费支付宝用户数
	 */
	@ApiField("merchant_sold_usercnt_thirty_d")
	private Long merchantSoldUsercntThirtyD;

	/**
	 * 菜品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 菜品id
	 */
	@ApiField("outer_dish_id")
	private String outerDishId;

	/**
	 * 多图路径分割
	 */
	@ApiField("pict")
	private String pict;

	/**
	 * 平台类型（二维火，mike)
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 菜品价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 菜品库存
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 外部商户ID/或者门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * shopid最近7天销量（份）
	 */
	@ApiField("sold_cnt_seven_d")
	private Long soldCntSevenD;

	/**
	 * shopid最近30天销量（份）
	 */
	@ApiField("sold_cnt_thirty_d")
	private Long soldCntThirtyD;

	/**
	 * shopid最近30天购买2次及以上的支付宝用户数
	 */
	@ApiField("sold_reusercnt_thirty_d")
	private Long soldReusercntThirtyD;

	/**
	 * shopid最近30天消费支付宝用户数
	 */
	@ApiField("sold_usercnt_thirty_d")
	private Long soldUsercntThirtyD;

	/**
	 * 菜品热度值（分数越高表示热度越高）
	 */
	@ApiListField("sort_col")
	@ApiField("number")
	private List<Long> sortCol;

	/**
	 * 菜品显示的单位（份/斤/杯）
	 */
	@ApiField("unit")
	private String unit;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDishTypeId() {
		return this.dishTypeId;
	}
	public void setDishTypeId(String dishTypeId) {
		this.dishTypeId = dishTypeId;
	}

	public String getDishTypeName() {
		return this.dishTypeName;
	}
	public void setDishTypeName(String dishTypeName) {
		this.dishTypeName = dishTypeName;
	}

	public String getGoodLevel() {
		return this.goodLevel;
	}
	public void setGoodLevel(String goodLevel) {
		this.goodLevel = goodLevel;
	}

	public Long getMerchantSoldCntSevenD() {
		return this.merchantSoldCntSevenD;
	}
	public void setMerchantSoldCntSevenD(Long merchantSoldCntSevenD) {
		this.merchantSoldCntSevenD = merchantSoldCntSevenD;
	}

	public Long getMerchantSoldCntThirtyD() {
		return this.merchantSoldCntThirtyD;
	}
	public void setMerchantSoldCntThirtyD(Long merchantSoldCntThirtyD) {
		this.merchantSoldCntThirtyD = merchantSoldCntThirtyD;
	}

	public Long getMerchantSoldReusercntThirtyD() {
		return this.merchantSoldReusercntThirtyD;
	}
	public void setMerchantSoldReusercntThirtyD(Long merchantSoldReusercntThirtyD) {
		this.merchantSoldReusercntThirtyD = merchantSoldReusercntThirtyD;
	}

	public Long getMerchantSoldUsercntThirtyD() {
		return this.merchantSoldUsercntThirtyD;
	}
	public void setMerchantSoldUsercntThirtyD(Long merchantSoldUsercntThirtyD) {
		this.merchantSoldUsercntThirtyD = merchantSoldUsercntThirtyD;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOuterDishId() {
		return this.outerDishId;
	}
	public void setOuterDishId(String outerDishId) {
		this.outerDishId = outerDishId;
	}

	public String getPict() {
		return this.pict;
	}
	public void setPict(String pict) {
		this.pict = pict;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getSoldCntSevenD() {
		return this.soldCntSevenD;
	}
	public void setSoldCntSevenD(Long soldCntSevenD) {
		this.soldCntSevenD = soldCntSevenD;
	}

	public Long getSoldCntThirtyD() {
		return this.soldCntThirtyD;
	}
	public void setSoldCntThirtyD(Long soldCntThirtyD) {
		this.soldCntThirtyD = soldCntThirtyD;
	}

	public Long getSoldReusercntThirtyD() {
		return this.soldReusercntThirtyD;
	}
	public void setSoldReusercntThirtyD(Long soldReusercntThirtyD) {
		this.soldReusercntThirtyD = soldReusercntThirtyD;
	}

	public Long getSoldUsercntThirtyD() {
		return this.soldUsercntThirtyD;
	}
	public void setSoldUsercntThirtyD(Long soldUsercntThirtyD) {
		this.soldUsercntThirtyD = soldUsercntThirtyD;
	}

	public List<Long> getSortCol() {
		return this.sortCol;
	}
	public void setSortCol(List<Long> sortCol) {
		this.sortCol = sortCol;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
