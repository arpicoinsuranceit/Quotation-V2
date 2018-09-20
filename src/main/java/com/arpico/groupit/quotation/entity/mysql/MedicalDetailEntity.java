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
@Table(name = "medical_details")
public class MedicalDetailEntity {

	private Integer id;
	private String status;
	private String custStatus;
	private String createBy;
	private Date createdate;
	private String modifyBy;
	private Date modifydate;

	private MedicalRequirmentEntity medicalRequirmentEntity;
	private QuotationDetailEntity quotationDetailEntity;

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

	@Column(name = "cust_status")
	public String getCustStatus() {
		return custStatus;
	}

	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}

	@Column(name = "med_details_create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "med_details_createdate")
	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Column(name = "med_details_modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "med_details_modifydate")
	public Date getModifydate() {
		return modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "medical_req_id", nullable = false)
	public MedicalRequirmentEntity getMedicalRequirmentEntity() {
		return medicalRequirmentEntity;
	}

	public void setMedicalRequirmentEntity(MedicalRequirmentEntity medicalRequirmentEntity) {
		this.medicalRequirmentEntity = medicalRequirmentEntity;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "quotation_detail_id", nullable = false)
	public QuotationDetailEntity getQuotationDetailEntity() {
		return quotationDetailEntity;
	}

	public void setQuotationDetailEntity(QuotationDetailEntity quotationDetailEntity) {
		this.quotationDetailEntity = quotationDetailEntity;
	}

}
