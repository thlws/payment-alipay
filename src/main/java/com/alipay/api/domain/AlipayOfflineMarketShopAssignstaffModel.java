package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分配门店给员工
 *
 * @author auto create
 * @since 1.0, 2015-11-20 19:22:08
 */
public class AlipayOfflineMarketShopAssignstaffModel extends AlipayObject {

	private static final long serialVersionUID = 5861574937129591415L;

	/**
	 * 员工支付宝卡号ID
	 */
	@ApiField("allocated_staff_id")
	private String allocatedStaffId;

	/**
	 * 操作人PID
	 */
	@ApiField("ope_pid")
	private String opePid;

	/**
	 * 请求流水id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 门店id,可以多个，“，”分隔
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAllocatedStaffId() {
		return this.allocatedStaffId;
	}
	public void setAllocatedStaffId(String allocatedStaffId) {
		this.allocatedStaffId = allocatedStaffId;
	}

	public String getOpePid() {
		return this.opePid;
	}
	public void setOpePid(String opePid) {
		this.opePid = opePid;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
