package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass更新模版接口
 *
 * @author auto create
 * @since 1.0, 2016-07-29 00:37:39
 */
public class AlipayPassTemplateUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8252258445718227773L;

	/**
	 * 模板内容信息，遵循JSON规范，详情参见<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=193&articleId=105249&docType=1#tpl_content">tpl_content参数说明</a>
	 */
	@ApiField("tpl_content")
	private String tplContent;

	/**
	 * 更新的模板ID
	 */
	@ApiField("tpl_id")
	private String tplId;

	public String getTplContent() {
		return this.tplContent;
	}
	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	public String getTplId() {
		return this.tplId;
	}
	public void setTplId(String tplId) {
		this.tplId = tplId;
	}

}
