package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StaffDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.querystaff response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-16 16:12:59
 */
public class AlipayOfflineProviderQuerystaffResponse extends AlipayResponse {

	private static final long serialVersionUID = 3354775248378133142L;

	/** 
	 * 当前分页数
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页分页条数
	 */
	@ApiField("items_per_page")
	private Long itemsPerPage;

	/** 
	 * 员工信息列表
	 */
	@ApiListField("query_result")
	@ApiField("staff_d_t_o")
	private List<StaffDTO> queryResult;

	/** 
	 * 总员工数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总分页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setItemsPerPage(Long itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public Long getItemsPerPage( ) {
		return this.itemsPerPage;
	}

	public void setQueryResult(List<StaffDTO> queryResult) {
		this.queryResult = queryResult;
	}
	public List<StaffDTO> getQueryResult( ) {
		return this.queryResult;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
