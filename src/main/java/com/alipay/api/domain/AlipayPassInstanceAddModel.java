package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass新建卡券实例接口
 *
 * @author auto create
 * @since 1.0, 2016-07-29 00:40:22
 */
public class AlipayPassInstanceAddModel extends AlipayObject {

	private static final long serialVersionUID = 7125478114156324787L;

	/**
	 * 支付宝用户识别信息：
包括partner_id（商户的签约账号）和out_trade_no
	 */
	@ApiField("recognition_info")
	private String recognitionInfo;

	/**
	 * Alipass添加对象识别类型：1–订单信息
	 */
	@ApiField("recognition_type")
	private String recognitionType;

	/**
	 * 支付宝pass模版ID
	 */
	@ApiField("tpl_id")
	private String tplId;

	/**
	 * 模版动态参数信息【支付宝pass模版参数键值对JSON字符串】。
	 */
	@ApiField("tpl_params")
	private String tplParams;

	public String getRecognitionInfo() {
		return this.recognitionInfo;
	}
	public void setRecognitionInfo(String recognitionInfo) {
		this.recognitionInfo = recognitionInfo;
	}

	public String getRecognitionType() {
		return this.recognitionType;
	}
	public void setRecognitionType(String recognitionType) {
		this.recognitionType = recognitionType;
	}

	public String getTplId() {
		return this.tplId;
	}
	public void setTplId(String tplId) {
		this.tplId = tplId;
	}

	public String getTplParams() {
		return this.tplParams;
	}
	public void setTplParams(String tplParams) {
		this.tplParams = tplParams;
	}

}
