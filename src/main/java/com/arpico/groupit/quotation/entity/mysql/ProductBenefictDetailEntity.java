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

@Table(name = "prod_benef_details")
@Entity
public class ProductBenefictDetailEntity {

	private Integer id;
	private ProductEntity productEntity;
	private BenefictEntity benefictEntity;
	
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
	@JoinColumn(name = "product_id", nullable = false)
	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "benefit_id", nullable = false)
	public BenefictEntity getBenefictEntity() {
		return benefictEntity;
	}

	public void setBenefictEntity(BenefictEntity benefictEntity) {
		this.benefictEntity = benefictEntity;
	}

	
}
