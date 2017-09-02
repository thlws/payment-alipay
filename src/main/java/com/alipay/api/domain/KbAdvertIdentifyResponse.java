package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统主键结果
 *
 * @author auto create
 * @since 1.0, 2016-11-21 17:13:54
 */
public class KbAdvertIdentifyResponse extends AlipayObject {

	private static final long serialVersionUID = 2247473637478152528L;

	/**
	 * 返回码
success: 成功
invalid-arguments: 无效参数
retry-exception: 异常请重试
	 */
	@ApiField("code")
	private String code;

	/**
	 * 主键的值
	 */
	@ApiField("identify")
	private String identify;

	/**
	 * 主键类型
	 */
	@ApiField("identify_type")
	private String identifyType;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getIdentify() {
		return this.identify;
	}
	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public String getIdentifyType() {
		return this.identifyType;
	}
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

}
