package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xuweibo测试api
 *
 * @author auto create
 * @since 1.0, 2017-11-17 11:00:46
 */
public class AlipayOpenAppXwbtstabcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5355615415796277434L;

	/**
	 * 1
	 */
	@ApiField("xwbaa")
	private String xwbaa;

    /**
     * Gets xwbaa.
     *
     * @return the xwbaa
     */
    public String getXwbaa() {
		return this.xwbaa;
	}

    /**
     * Sets xwbaa.
     *
     * @param xwbaa the xwbaa
     */
    public void setXwbaa(String xwbaa) {
		this.xwbaa = xwbaa;
	}

}