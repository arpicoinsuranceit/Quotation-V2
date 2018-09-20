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
@Table(name = "medical_req")
public class MedicalRequirmentEntity {

	private Integer id;
	private String code;
	private String name;
	private String sName;
	private String catCode;
	private String createBy;
	private Date createdate;
	private String modifyBy;
	private Date modifydate;

	private List<MedicalDetailEntity> medicalDetailEntities;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "med_code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "med_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "short_med_name")
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Column(name = "cat_code")
	public String getCatCode() {
		return catCode;
	}

	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}

	@Column(name = "med_create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "med_createdate")
	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Column(name = "med_modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "med_modifydate")
	public Date getModifydate() {
		return modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	@OneToMany(mappedBy = "medicalRequirmentEntity", targetEntity = MedicalDetailEntity.class)
	public List<MedicalDetailEntity> getMedicalDetailEntities() {
		return medicalDetailEntities;
	}

	public void setMedicalDetailEntities(List<MedicalDetailEntity> medicalDetailEntities) {
		this.medicalDetailEntities = medicalDetailEntities;
	}

}
