package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DataEnumValue;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customtag.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:40
 */
public class KoubeiMarketingDataCustomtagDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3253512995655676486L;

	/** 
	 * 列表中的每一个DataEnumValue表示自定义标签的一个枚举值，例如：定义标签为高富帅，则高富帅有高，中，低三个枚举值，本期只支持枚举值为1个的场景，并且枚举值的value固定为1，目前支持的数据标签字典参见<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/reportAPIrule.xls">附件</a>
	 */
	@ApiListField("enum_values")
	@ApiField("data_enum_value")
	private List<DataEnumValue> enumValues;

	/** 
	 * 对自定义标签的描述
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 标签名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 标签code
	 */
	@ApiField("tag_code")
	private String tagCode;

	public void setEnumValues(List<DataEnumValue> enumValues) {
		this.enumValues = enumValues;
	}
	public List<DataEnumValue> getEnumValues( ) {
		return this.enumValues;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}
	public String getTagCode( ) {
		return this.tagCode;
	}

}
