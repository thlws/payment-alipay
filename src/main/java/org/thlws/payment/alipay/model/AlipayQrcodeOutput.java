package org.thlws.payment.alipay.model;

import org.thlws.payment.alipay.utils.JsonUtil;

import java.io.Serializable;

/**
 * 支付宝扫码支付Response Bean,用户打开支付宝APP扫描Qrcode
 * @author Hanley Tang
 * @email hanley@hanley.cn
 * @version 1.0
 */
public class AlipayQrcodeOutput implements Serializable{

	private String outTradeNo;
	private String qrCode;
	private boolean isSuccess;
	private String desc;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean success) {
		isSuccess = success;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
