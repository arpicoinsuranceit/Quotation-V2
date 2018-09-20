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
@Table(name = "quo_benef_child_details")
public class QuotationChildBenefitDetailEntity {

	private Integer id;
	private Integer term;
	private Double premium;

	private CustomerChildDetailEntity customerChildDetailEntity;
	private QuotationBenefictDetailEntity quotationBenefictDetailEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "quo_benef_child_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "term")
	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	@Column(name = "premium")
	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "child_id", nullable = false)
	public CustomerChildDetailEntity getCustomerChildDetailEntity() {
		return customerChildDetailEntity;
	}

	public void setCustomerChildDetailEntity(CustomerChildDetailEntity customerChildDetailEntity) {
		this.customerChildDetailEntity = customerChildDetailEntity;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "quo_benf_details_id", nullable = false)
	public QuotationBenefictDetailEntity getQuotationBenefictDetailEntity() {
		return quotationBenefictDetailEntity;
	}

	public void setQuotationBenefictDetailEntity(QuotationBenefictDetailEntity quotationBenefictDetailEntity) {
		this.quotationBenefictDetailEntity = quotationBenefictDetailEntity;
	}
}
