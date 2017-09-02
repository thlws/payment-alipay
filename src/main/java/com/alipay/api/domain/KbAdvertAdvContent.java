package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统推广内容
 *
 * @author auto create
 * @since 1.0, 2016-11-21 17:14:16
 */
public class KbAdvertAdvContent extends AlipayObject {

	private static final long serialVersionUID = 5656473763326929386L;

	/**
	 * 二维码
	 */
	@ApiField("codec")
	private String codec;

	/**
	 * 访问地址
	 */
	@ApiField("link_url")
	private String linkUrl;

	public String getCodec() {
		return this.codec;
	}
	public void setCodec(String codec) {
		this.codec = codec;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

}
