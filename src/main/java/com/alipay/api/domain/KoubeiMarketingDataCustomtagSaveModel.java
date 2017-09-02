package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自定义标签保存
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:36
 */
public class KoubeiMarketingDataCustomtagSaveModel extends AlipayObject {

	private static final long serialVersionUID = 7667569278416561612L;

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
	 * 自定义标签名称，该属性不支持修改。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 标签CODE-为空则为创建规则，否则更新规则
	 */
	@ApiField("tag_code")
	private String tagCode;

	public List<DataEnumValue> getEnumValues() {
		return this.enumValues;
	}
	public void setEnumValues(List<DataEnumValue> enumValues) {
		this.enumValues = enumValues;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
