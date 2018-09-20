package com.arpico.groupit.quotation.entity.mysql;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pension_shedule")
public class PensionScheduleEntity {

	private Integer id;
	
	private Integer polyer;
	private Integer month;
	private Double contribution;
	private Double commision;
	private Double expenses;
	private Double profit;
	private Double amtcrtfnd;
	private Double fndBeforeInt;
	private Double intRat1;
	private Double clsFnd1;
	private Double intRat2;
	private Double clsFnd2;
	private Double intRat3;
	private Double clsFnd3;
	private Double varExpences;
	
	private QuotationDetailEntity quotationDetailEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shedule_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "polyer")
	public Integer getPolyer() {
		return polyer;
	}

	public void setPolyer(Integer polyer) {
		this.polyer = polyer;
	}

	@Column(name = "month")
	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@Column(name = "contribution")
	public Double getContribution() {
		return contribution;
	}

	public void setContribution(Double contribution) {
		this.contribution = contribution;
	}

	@Column(name = "commision")
	public Double getCommision() {
		return commision;
	}

	public void setCommision(Double commision) {
		this.commision = commision;
	}

	@Column(name = "expenses")
	public Double getExpenses() {
		return expenses;
	}

	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}

	
	@Column(name = "profit")
	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	@Column(name = "amtcrtfnd")
	public Double getAmtcrtfnd() {
		return amtcrtfnd;
	}

	public void setAmtcrtfnd(Double amtcrtfnd) {
		this.amtcrtfnd = amtcrtfnd;
	}

	@Column(name = "fnd_before_int")
	public Double getFndBeforeInt() {
		return fndBeforeInt;
	}

	public void setFndBeforeInt(Double fndBeforeInt) {
		this.fndBeforeInt = fndBeforeInt;
	}

	@Column(name = "int_rat1")
	public Double getIntRat1() {
		return intRat1;
	}

	public void setIntRat1(Double intRat1) {
		this.intRat1 = intRat1;
	}

	@Column(name = "cls_fnd1")
	public Double getClsFnd1() {
		return clsFnd1;
	}

	public void setClsFnd1(Double clsFnd1) {
		this.clsFnd1 = clsFnd1;
	}

	@Column(name = "int_rat2")
	public Double getIntRat2() {
		return intRat2;
	}

	public void setIntRat2(Double intRat2) {
		this.intRat2 = intRat2;
	}

	@Column(name = "cls_fnd2")
	public Double getClsFnd2() {
		return clsFnd2;
	}

	public void setClsFnd2(Double clsFnd2) {
		this.clsFnd2 = clsFnd2;
	}

	@Column(name = "int_rat3")
	public Double getIntRat3() {
		return intRat3;
	}

	public void setIntRat3(Double intRat3) {
		this.intRat3 = intRat3;
	}

	@Column(name = "cls_fnd3")
	public Double getClsFnd3() {
		return clsFnd3;
	}

	public void setClsFnd3(Double clsFnd3) {
		this.clsFnd3 = clsFnd3;
	}

	@Column(name = "var_expences")
	public Double getVarExpences() {
		return varExpences;
	}

	public void setVarExpences(Double varExpences) {
		this.varExpences = varExpences;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "quotation_detail_id", nullable =false)
	public QuotationDetailEntity getQuotationDetailEntity() {
		return quotationDetailEntity;
	}

	public void setQuotationDetailEntity(QuotationDetailEntity quotationDetailEntity) {
		this.quotationDetailEntity = quotationDetailEntity;
	}
	
}
