package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义标签详情查询
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:40
 */
public class KoubeiMarketingDataCustomtagDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3424688579311199395L;

	/**
	 * 标签code，自定义标签保存时返回的tag_code值
	 */
	@ApiField("tag_code")
	private String tagCode;

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
