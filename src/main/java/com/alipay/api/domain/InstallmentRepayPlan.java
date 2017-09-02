package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台查询得到的每期还款计划
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class InstallmentRepayPlan extends AlipayObject {

	private static final long serialVersionUID = 3728747223898718969L;

	/**
	 * 是否是当期 ?? 默认值为不是当期计划。如果合约最后一期计划都已经逾期，就不再存在当期计划，合约下所有计划明细的该值都为false
	 */
	@ApiField("cur_term")
	private Boolean curTerm;

	/**
	 * 分期状态（NORMAL：正常，OVD：逾期），分期结清预算不包含已结清（CLEAR状态）的分期
	 */
	@ApiField("status")
	private String status;

	/**
	 * 本期到期日
	 */
	@ApiField("term_end_date")
	private Date termEndDate;

	/**
	 * 期次号
	 */
	@ApiField("term_no")
	private Long termNo;

	/**
	 * 本期正常利息
	 */
	@ApiField("term_nom_int")
	private String termNomInt;

	/**
	 * 本期正常本金
	 */
	@ApiField("term_nom_prin")
	private String termNomPrin;

	/**
	 * 本期逾期利息
	 */
	@ApiField("term_ovd_int")
	private String termOvdInt;

	/**
	 * 本期逾期利息罚息
	 */
	@ApiField("term_ovd_int_pen_int")
	private String termOvdIntPenInt;

	/**
	 * 本期逾期本金
	 */
	@ApiField("term_ovd_prin")
	private String termOvdPrin;

	/**
	 * 本期逾期本金罚息
	 */
	@ApiField("term_ovd_prin_pen_int")
	private String termOvdPrinPenInt;

	/**
	 * 本期开始日
	 */
	@ApiField("term_start_date")
	private Date termStartDate;

	public Boolean getCurTerm() {
		return this.curTerm;
	}
	public void setCurTerm(Boolean curTerm) {
		this.curTerm = curTerm;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTermEndDate() {
		return this.termEndDate;
	}
	public void setTermEndDate(Date termEndDate) {
		this.termEndDate = termEndDate;
	}

	public Long getTermNo() {
		return this.termNo;
	}
	public void setTermNo(Long termNo) {
		this.termNo = termNo;
	}

	public String getTermNomInt() {
		return this.termNomInt;
	}
	public void setTermNomInt(String termNomInt) {
		this.termNomInt = termNomInt;
	}

	public String getTermNomPrin() {
		return this.termNomPrin;
	}
	public void setTermNomPrin(String termNomPrin) {
		this.termNomPrin = termNomPrin;
	}

	public String getTermOvdInt() {
		return this.termOvdInt;
	}
	public void setTermOvdInt(String termOvdInt) {
		this.termOvdInt = termOvdInt;
	}

	public String getTermOvdIntPenInt() {
		return this.termOvdIntPenInt;
	}
	public void setTermOvdIntPenInt(String termOvdIntPenInt) {
		this.termOvdIntPenInt = termOvdIntPenInt;
	}

	public String getTermOvdPrin() {
		return this.termOvdPrin;
	}
	public void setTermOvdPrin(String termOvdPrin) {
		this.termOvdPrin = termOvdPrin;
	}

	public String getTermOvdPrinPenInt() {
		return this.termOvdPrinPenInt;
	}
	public void setTermOvdPrinPenInt(String termOvdPrinPenInt) {
		this.termOvdPrinPenInt = termOvdPrinPenInt;
	}

	public Date getTermStartDate() {
		return this.termStartDate;
	}
	public void setTermStartDate(Date termStartDate) {
		this.termStartDate = termStartDate;
	}

}
