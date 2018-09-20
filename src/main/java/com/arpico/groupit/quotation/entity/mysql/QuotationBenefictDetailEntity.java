package com.arpico.groupit.quotation.entity.mysql;

import java.util.Date;
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
@Table(name = "quo_benef_details")
public class QuotationBenefictDetailEntity {

	private Integer id;
	private Double riderPremium;
	private Integer riderTerm;
	private Double riderSum;
	private String riderCode;
	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;

	private QuotationDetailEntity quotationDetailEntity;
	private BenefictEntity benefictEntity;

	private List<QuotationChildBenefitDetailEntity> quotationChildBenefitDetailEntities;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "quo_benef_details_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "rider_premium")
	public Double getRiderPremium() {
		return riderPremium;
	}

	public void setRiderPremium(Double riderPremium) {
		this.riderPremium = riderPremium;
	}

	@Column(name = "rider_term")
	public Integer getRiderTerm() {
		return riderTerm;
	}

	public void setRiderTerm(Integer riderTerm) {
		this.riderTerm = riderTerm;
	}

	@Column(name = "rider_sum")
	public Double getRiderSum() {
		return riderSum;
	}

	public void setRiderSum(Double riderSum) {
		this.riderSum = riderSum;
	}

	@Column(name = "rier_code")
	public String getRiderCode() {
		return riderCode;
	}

	public void setRiderCode(String riderCode) {
		this.riderCode = riderCode;
	}

	@Column(name = "quo_benef_create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "quo_benef_create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "quo_benef_modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "quo_benef_modify_date")
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "quodetails_id", nullable = false)
	public QuotationDetailEntity getQuotationDetailEntity() {
		return quotationDetailEntity;
	}

	public void setQuotationDetailEntity(QuotationDetailEntity quotationDetailEntity) {
		this.quotationDetailEntity = quotationDetailEntity;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "benef_id", nullable = false)
	public BenefictEntity getBenefictEntity() {
		return benefictEntity;
	}

	public void setBenefictEntity(BenefictEntity benefictEntity) {
		this.benefictEntity = benefictEntity;
	}

	@OneToMany(mappedBy = "quotationBenefictDetailEntity", targetEntity = QuotationChildBenefitDetailEntity.class)
	public List<QuotationChildBenefitDetailEntity> getQuotationChildBenefitDetailEntities() {
		return quotationChildBenefitDetailEntities;
	}

	public void setQuotationChildBenefitDetailEntities(
			List<QuotationChildBenefitDetailEntity> quotationChildBenefitDetailEntities) {
		this.quotationChildBenefitDetailEntities = quotationChildBenefitDetailEntities;
	}

}
