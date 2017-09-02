package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantSaleLeadsQueryBypageDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.saleleads.info.querybypage response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-16 16:16:23
 */
public class AlipayOfflineSaleleadsInfoQuerybypageResponse extends AlipayResponse {

	private static final long serialVersionUID = 6644213821516866135L;

	/** 
	 * 服务商按照条件分页查询leads信息返回信息
	 */
	@ApiListField("merchantsaleleadsquerybypagelist")
	@ApiField("merchant_sale_leads_query_bypage_d_t_o")
	private List<MerchantSaleLeadsQueryBypageDTO> merchantsaleleadsquerybypagelist;

	public void setMerchantsaleleadsquerybypagelist(List<MerchantSaleLeadsQueryBypageDTO> merchantsaleleadsquerybypagelist) {
		this.merchantsaleleadsquerybypagelist = merchantsaleleadsquerybypagelist;
	}
	public List<MerchantSaleLeadsQueryBypageDTO> getMerchantsaleleadsquerybypagelist( ) {
		return this.merchantsaleleadsquerybypagelist;
	}

}
