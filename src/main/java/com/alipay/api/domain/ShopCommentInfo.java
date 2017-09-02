package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店评分信息模型
 *
 * @author auto create
 * @since 1.0, 2016-11-14 22:43:58
 */
public class ShopCommentInfo extends AlipayObject {

	private static final long serialVersionUID = 6416725668479356179L;

	/**
	 * 门店评分，评分越高，门店质量越高
	 */
	@ApiField("score")
	private String score;

	/**
	 * 门店星级，0~5,越高，店铺质量越高
	 */
	@ApiField("star")
	private String star;

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getStar() {
		return this.star;
	}
	public void setStar(String star) {
		this.star = star;
	}

}
