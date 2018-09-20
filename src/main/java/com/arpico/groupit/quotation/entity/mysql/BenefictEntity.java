package com.arpico.groupit.quotation.entity.mysql;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "benefits")
public class BenefictEntity {

	private Integer id;
	private String riderCode;
	private String name;
	private Integer minAge;
	private Integer maxAge;
	private String benefitType;
	private String benefictCombination;

	private Integer active;

	private Date lockinDate;
	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;
	
	private List<ProductBenefictDetailEntity> productBenefictDetailEntities;
	private List<OccupationLoadingEntity> occupationLoadingEntities;
	private List<QuotationBenefictDetailEntity> quotationBenefictDetailEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "rider_code")
	public String getRiderCode() {
		return riderCode;
	}

	public void setRiderCode(String riderCode) {
		this.riderCode = riderCode;
	}

	@Column(name = "benefit_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "benefit_min_age")
	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	@Column(name = "benefit_max_age")
	public Integer getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}

	@Column(name = "benefit_type")
	public String getBenefitType() {
		return benefitType;
	}

	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	@Column(name = "benefict_combination")
	public String getBenefictCombination() {
		return benefictCombination;
	}

	public void setBenefictCombination(String benefictCombination) {
		this.benefictCombination = benefictCombination;
	}

	@Column(name = "active")
	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Column(name = "lockin_date")
	public Date getLockinDate() {
		return lockinDate;
	}

	public void setLockinDate(Date lockinDate) {
		this.lockinDate = lockinDate;
	}

	@Column(name = "benefit_create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "benefit_create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "benefit_modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "benefit_modify_date")
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@OneToMany(mappedBy = "benefictEntity", targetEntity = ProductBenefictDetailEntity.class)
	public List<ProductBenefictDetailEntity> getProductBenefictDetailEntities() {
		return productBenefictDetailEntities;
	}

	public void setProductBenefictDetailEntities(List<ProductBenefictDetailEntity> productBenefictDetailEntities) {
		this.productBenefictDetailEntities = productBenefictDetailEntities;
	}

	@OneToMany(mappedBy = "benefictEntity", targetEntity = OccupationLoadingEntity.class)
	public List<OccupationLoadingEntity> getOccupationLoadingEntities() {
		return occupationLoadingEntities;
	}

	public void setOccupationLoadingEntities(List<OccupationLoadingEntity> occupationLoadingEntities) {
		this.occupationLoadingEntities = occupationLoadingEntities;
	}

	@OneToMany(mappedBy = "benefictEntity", targetEntity = QuotationBenefictDetailEntity.class)
	public List<QuotationBenefictDetailEntity> getQuotationBenefictDetailEntities() {
		return quotationBenefictDetailEntities;
	}

	public void setQuotationBenefictDetailEntities(List<QuotationBenefictDetailEntity> quotationBenefictDetailEntities) {
		this.quotationBenefictDetailEntities = quotationBenefictDetailEntities;
	}

	



}
