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
@Table(name = "products")
public class ProductEntity {

	private Integer id;
	private String code;
	private String name;
	private Integer minAge;
	private Integer maxAge;

	private Integer active;

	private Date lockin;
	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;

	
	private List<ProductBenefictDetailEntity> productBenefictDetailEntities;
	private List<QuotationEntity> quotationEntities ; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "product_code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "product_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "priduct_min_age")
	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	@Column(name = "priduct_max_age")
	public Integer getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}

	@Column(name = "active")
	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Column(name = "lockin_date")
	public Date getLockin() {
		return lockin;
	}

	public void setLockin(Date lockin) {
		this.lockin = lockin;
	}

	@Column(name = "product_create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "product_create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "product_modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "product_modify_date")
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	
	@OneToMany(mappedBy = "productEntity", targetEntity = ProductBenefictDetailEntity.class)
	public List<ProductBenefictDetailEntity> getProductBenefictDetailEntities() {
		return productBenefictDetailEntities;
	}

	public void setProductBenefictDetailEntities(List<ProductBenefictDetailEntity> productBenefictDetailEntities) {
		this.productBenefictDetailEntities = productBenefictDetailEntities;
	}

	@OneToMany(mappedBy = "productEntity", targetEntity = QuotationEntity.class)
	public List<QuotationEntity> getQuotationEntities() {
		return quotationEntities;
	}

	public void setQuotationEntities(List<QuotationEntity> quotationEntities) {
		this.quotationEntities = quotationEntities;
	}


}
