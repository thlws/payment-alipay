package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass更新卡券实例接口
 *
 * @author auto create
 * @since 1.0, 2016-07-29 00:44:01
 */
public class AlipayPassInstanceUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 3394821558458686165L;

	/**
	 * 代理商代替商户发放卡券后，再代替商户更新卡券时，此值为商户的pid/appid
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 商户指定卡券唯一值
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 券状态，支持更新为USED、CLOSED两种状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模版动态参数信息【支付宝pass模版参数键值对JSON字符串】
	 */
	@ApiField("tpl_params")
	private String tplParams;

	/**
	 * 核销码串值【当状态变更为USED时，建议传】
	 */
	@ApiField("verify_code")
	private String verifyCode;

	/**
	 * 核销方式，目前支持：wave（声波方式）、qrcode（二维码方式）、barcode（条码方式）、input（文本方式，即手工输入方式）。pass和verify_type不能同时为空
	 */
	@ApiField("verify_type")
	private String verifyType;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTplParams() {
		return this.tplParams;
	}
	public void setTplParams(String tplParams) {
		this.tplParams = tplParams;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getVerifyType() {
		return this.verifyType;
	}
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
