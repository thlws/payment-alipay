package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业平台物业费账单数据集合
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class CPBillSet extends AlipayObject {

	private static final long serialVersionUID = 2181199541737146518L;

	/**
	 * 账期
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 应收金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_entry_amount")
	private String billEntryAmount;

	/**
	 * 物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 费用类型
	 */
	@ApiField("cost_type")
	private String costType;

	/**
	 * 缴费截止日期
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 物业系统端房屋编号
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 出账日期
	 */
	@ApiField("release_day")
	private String releaseDay;

	/**
	 * 房屋门牌地址
	 */
	@ApiField("room_address")
	private String roomAddress;

	public String getAcctPeriod() {
		return this.acctPeriod;
	}
	public void setAcctPeriod(String acctPeriod) {
		this.acctPeriod = acctPeriod;
	}

	public String getBillEntryAmount() {
		return this.billEntryAmount;
	}
	public void setBillEntryAmount(String billEntryAmount) {
		this.billEntryAmount = billEntryAmount;
	}

	public String getBillEntryId() {
		return this.billEntryId;
	}
	public void setBillEntryId(String billEntryId) {
		this.billEntryId = billEntryId;
	}

	public String getCostType() {
		return this.costType;
	}
	public void setCostType(String costType) {
		this.costType = costType;
	}

	public String getDeadline() {
		return this.deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getReleaseDay() {
		return this.releaseDay;
	}
	public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}

	public String getRoomAddress() {
		return this.roomAddress;
	}
	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}

}
