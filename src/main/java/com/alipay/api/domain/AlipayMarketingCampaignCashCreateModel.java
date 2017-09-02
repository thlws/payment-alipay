package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建现金活动
 *
 * @author auto create
 * @since 1.0, 2016-11-25 16:44:01
 */
public class AlipayMarketingCampaignCashCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7795159515365853729L;

	/**
	 * 红包名称,商户在查询列表、详情看到的名字,同时也会显示在商户付款页面。
	 */
	@ApiField("coupon_name")
	private String couponName;

	/**
	 * 活动结束时间,必须大于活动开始时间, 基本格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商户打款后的跳转链接，从支付宝收银台打款成功后的跳转链接。不填时，打款后停留在支付宝支付成功页。商户实际跳转会自动添加crowdNo作为跳转参数。示例: http://www.koubei.com?crowdNo=XXX
	 */
	@ApiField("merchant_link")
	private String merchantLink;

	/**
	 * 活动文案,用户在账单、红包中看到的账单描述、红包描述
	 */
	@ApiField("prize_msg")
	private String prizeMsg;

	/**
	 * 现金红包的发放形式, fixed为固定金额,random为随机金额。
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 活动开始时间,必须大于活动创建的时间. 
(1) 填固定时间:2016-08-10 22:28:30, 基本格式:yyyy-MM-dd HH:mm:ss
(2) 填字符串NowTime
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 活动发放的现金总金额,最小金额1.00元,最大金额10000000.00元。每个红包的最大金额不允许超过200元,最小金额不得低于0.10元。 实际的金额限制可能会根据业务进行动态调整。
	 */
	@ApiField("total_money")
	private String totalMoney;

	/**
	 * 红包发放个数，不同的发奖类型含义不同：
(1) 固定金额：活动总共发放的现金红包个数,最小100个,最大10000000个。 实际的个数限制可能会根据业务进行动态调整。
(2) 随机金额：用于计算每个随机红包的平均值，但最终发放个数不一定是total_num.
	 */
	@ApiField("total_num")
	private String totalNum;

	public String getCouponName() {
		return this.couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMerchantLink() {
		return this.merchantLink;
	}
	public void setMerchantLink(String merchantLink) {
		this.merchantLink = merchantLink;
	}

	public String getPrizeMsg() {
		return this.prizeMsg;
	}
	public void setPrizeMsg(String prizeMsg) {
		this.prizeMsg = prizeMsg;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTotalMoney() {
		return this.totalMoney;
	}
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}

	public String getTotalNum() {
		return this.totalNum;
	}
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

}
