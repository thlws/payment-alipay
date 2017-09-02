package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 只能查询到服务商自己下面的员工
 *
 * @author auto create
 * @since 1.0, 2015-11-20 19:11:14
 */
public class AlipayOfflineProviderQuerystaffModel extends AlipayObject {

	private static final long serialVersionUID = 4382521983798515669L;

	/**
	 * 操作人PID
	 */
	@ApiField("ope_pid")
	private String opePid;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小，<=100
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 全局唯一的流水号
	 */
	@ApiField("request_id")
	private String requestId;

	public String getOpePid() {
		return this.opePid;
	}
	public void setOpePid(String opePid) {
		this.opePid = opePid;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
