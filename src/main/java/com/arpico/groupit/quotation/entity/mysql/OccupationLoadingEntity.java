package com.arpico.groupit.quotation.entity.mysql;



import java.util.Date;

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
@Table(name = "ocupation_loading")
public class OccupationLoadingEntity {

	private Integer id;
	private Double value;
	private BenefictEntity benefictEntity;
	private OccupationEntity occupationEntity;

	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ocu_loading_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "value")
	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "benifit_id", nullable = false)
	public BenefictEntity getBenefictEntity() {
		return benefictEntity;
	}

	public void setBenefictEntity(BenefictEntity benefictEntity) {
		this.benefictEntity = benefictEntity;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ocupation_id", nullable = false)
	public OccupationEntity getOccupationEntity() {
		return occupationEntity;
	}

	public void setOccupationEntity(OccupationEntity occupationEntity) {
		this.occupationEntity = occupationEntity;
	}

	@Column(name = "ocu_loading_create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "ocu_loading_create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "ocu_loading_modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "ocu_loading_modify_date")
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Override
	public String toString() {
		return "OccupationLoadingEntity [id=" + id + ", value=" + value + ", benefictEntity=" + benefictEntity
				+ ", occupationEntity=" + occupationEntity + ", createBy=" + createBy + ", createDate=" + createDate
				+ ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate + "]";
	}

}
