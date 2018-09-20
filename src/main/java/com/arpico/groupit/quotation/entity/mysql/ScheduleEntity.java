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
@Table(name = "shedule")
public class ScheduleEntity {

	private Integer id;
	private Integer policyYear;
	private Integer outYear;
	private Double outSum;
	private Double lorned;
	private Double premiumRate;
	private Double premium;
	
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

	@Column(name = "policy_year")
	public Integer getPolicyYear() {
		return policyYear;
	}

	public void setPolicyYear(Integer policyYear) {
		this.policyYear = policyYear;
	}

	@Column(name = "out_year")
	public Integer getOutYear() {
		return outYear;
	}

	public void setOutYear(Integer outYear) {
		this.outYear = outYear;
	}

	@Column(name = "out_sum")
	public Double getOutSum() {
		return outSum;
	}

	public void setOutSum(Double outSum) {
		this.outSum = outSum;
	}

	@Column(name = "lorned")
	public Double getLorned() {
		return lorned;
	}

	public void setLorned(Double lorned) {
		this.lorned = lorned;
	}

	@Column(name = "premium_rate")
	public Double getPremiumRate() {
		return premiumRate;
	}

	public void setPremiumRate(Double premiumRate) {
		this.premiumRate = premiumRate;
	}

	@Column(name = "premium")
	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "quotation_detail_id", nullable = false)
	public QuotationDetailEntity getQuotationDetailEntity() {
		return quotationDetailEntity;
	}

	public void setQuotationDetailEntity(QuotationDetailEntity quotationDetailEntity) {
		this.quotationDetailEntity = quotationDetailEntity;
	}
}
