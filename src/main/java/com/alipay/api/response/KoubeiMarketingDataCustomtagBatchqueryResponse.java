package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustomTagInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customtag.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:46
 */
public class KoubeiMarketingDataCustomtagBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1452385567323498673L;

	/** 
	 * 自定义标签详情信息
	 */
	@ApiListField("custom_tag_list")
	@ApiField("custom_tag_info")
	private List<CustomTagInfo> customTagList;

	public void setCustomTagList(List<CustomTagInfo> customTagList) {
		this.customTagList = customTagList;
	}
	public List<CustomTagInfo> getCustomTagList( ) {
		return this.customTagList;
	}

}
