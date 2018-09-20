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
@Table(name = "quotation")
public class QuotationEntity {

	private Integer id;
	private String status;
	private ProductEntity productEntity;
	private UserEntity userEntity;

	private List<QuotationDetailEntity> quotationDetailEntities;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", nullable = false)
	public ProductEntity getProductEntity() {
		return productEntity;
	}
	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false)
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	@OneToMany(mappedBy = "quotationEntity", targetEntity = QuotationDetailEntity.class)
	public List<QuotationDetailEntity> getQuotationDetailEntities() {
		return quotationDetailEntities;
	}
	public void setQuotationDetailEntities(List<QuotationDetailEntity> quotationDetailEntities) {
		this.quotationDetailEntities = quotationDetailEntities;
	}
	
	
}
