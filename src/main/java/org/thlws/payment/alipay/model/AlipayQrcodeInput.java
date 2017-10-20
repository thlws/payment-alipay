package org.thlws.payment.alipay.model;

import java.io.Serializable;
import java.util.List;

import com.alipay.trade.model.GoodsDetail;
import org.thlws.payment.alipay.utils.JsonUtil;

/**
 * 支付宝扫码支付Bean,用户打开支付宝APP扫描Qrcode
 * @author Hanley Tang
 * @email hanley@hanley.cn
 * @version 1.0
 */
public class AlipayQrcodeInput implements Serializable{

	/**long AlipayQrcodeInput.java**/
	private static final long serialVersionUID = 7943982676695868533L;
	
	private String outTradeNo; // (必填) 商户网站订单系统中唯一订单号，64个字符以内
	private String subject;// (必填) 订单标题
	private String totalAmount;// (必填) 订单总金额
	private String storeId;// (必填) 商户门店编号
	private String undiscountableAmount = "0";// (可选) 订单不可打折金额
	private String sellerId = "";//(可选)卖家支付宝账号ID
	private String body; // 订单描述
	private String operatorId; //(可选) 商户操作员编号
	
	private List<GoodsDetail> goodsDetailList;

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public String getSubject() {
		return subject;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public String getStoreId() {
		return storeId;
	}

	public String getUndiscountableAmount() {
		return undiscountableAmount;
	}

	public String getSellerId() {
		return sellerId;
	}

	public String getBody() {
		return body;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public List<GoodsDetail> getGoodsDetailList() {
		return goodsDetailList;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public void setGoodsDetailList(List<GoodsDetail> goodsDetailList) {
		this.goodsDetailList = goodsDetailList;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
	
}
