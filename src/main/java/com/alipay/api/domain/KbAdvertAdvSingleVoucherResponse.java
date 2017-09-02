package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统推广详情(单张券)
 *
 * @author auto create
 * @since 1.0, 2016-11-21 17:14:16
 */
public class KbAdvertAdvSingleVoucherResponse extends AlipayObject {

	private static final long serialVersionUID = 4151192324836553813L;

	/**
	 * 推广内容
	 */
	@ApiField("content")
	private KbAdvertAdvContent content;

	/**
	 * 券标的
	 */
	@ApiField("voucher")
	private KbAdvertSubjectVoucherResponse voucher;

	public KbAdvertAdvContent getContent() {
		return this.content;
	}
	public void setContent(KbAdvertAdvContent content) {
		this.content = content;
	}

	public KbAdvertSubjectVoucherResponse getVoucher() {
		return this.voucher;
	}
	public void setVoucher(KbAdvertSubjectVoucherResponse voucher) {
		this.voucher = voucher;
	}

}
