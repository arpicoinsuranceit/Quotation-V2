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
@Table(name = "occupation")
public class OccupationEntity {

	private Integer id;
	private String code;
	private String name;

	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;
	
	private List<OccupationLoadingEntity> occupationLoadingEntities;
	private List<CustomerDetailEntity> customerDetailEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ocupationid")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ocupation_code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "ocupation_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "ocupation_create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "ocupation_create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "ocupation_modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "ocupation_modify_date")
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@OneToMany(mappedBy = "occupationEntity", targetEntity = OccupationLoadingEntity.class)
	public List<OccupationLoadingEntity> getOccupationLoadingEntities() {
		return occupationLoadingEntities;
	}

	public void setOccupationLoadingEntities(List<OccupationLoadingEntity> occupationLoadingEntities) {
		this.occupationLoadingEntities = occupationLoadingEntities;
	}

	@OneToMany(mappedBy = "occupationEntity", targetEntity = CustomerDetailEntity.class)
	public List<CustomerDetailEntity> getCustomerDetailEntities() {
		return customerDetailEntities;
	}

	public void setCustomerDetailEntities(List<CustomerDetailEntity> customerDetailEntities) {
		this.customerDetailEntities = customerDetailEntities;
	}


}
