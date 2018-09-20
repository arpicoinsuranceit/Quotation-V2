package com.arpico.groupit.quotation.entity.mysql;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cust_child_details")
public class CustomerChildDetailEntity {

	private Integer id;
	private CustomerDetailEntity customerDetailEntity;
	private ChildEntity childEntity;
	
	private List<QuotationChildBenefitDetailEntity> quotationChildBenefitDetailEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cust_id", nullable = false)
	public CustomerDetailEntity getCustomerDetailEntity() {
		return customerDetailEntity;
	}

	public void setCustomerDetailEntity(CustomerDetailEntity customerDetailEntity) {
		this.customerDetailEntity = customerDetailEntity;
	}

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "child_id", nullable = false)
	public ChildEntity getChildEntity() {
		return childEntity;
	}

	public void setChildEntity(ChildEntity childEntity) {
		this.childEntity = childEntity;
	}

	@OneToMany(targetEntity = QuotationChildBenefitDetailEntity.class, mappedBy = "customerChildDetailEntity")
	public List<QuotationChildBenefitDetailEntity> getQuotationChildBenefitDetailEntities() {
		return quotationChildBenefitDetailEntities;
	}

	public void setQuotationChildBenefitDetailEntities(
			List<QuotationChildBenefitDetailEntity> quotationChildBenefitDetailEntities) {
		this.quotationChildBenefitDetailEntities = quotationChildBenefitDetailEntities;
	}

}
