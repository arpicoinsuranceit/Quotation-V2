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
@Table(name = "surrendervals")
public class SurrenderValueEntity {

	private Integer id;
	private Integer padtrm;
	private Double isumas;
	private Double paidup;
	private Double surrnd;
	private Double mature;
	private Double prmpyr;
	private Double prmpad;
	private Integer polyer;
	
	private String createBy;
	private Date createdate;
	
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

	@Column(name = "padtrm")
	public Integer getPadtrm() {
		return padtrm;
	}

	public void setPadtrm(Integer padtrm) {
		this.padtrm = padtrm;
	}

	@Column(name = "isumas")
	public Double getIsumas() {
		return isumas;
	}

	public void setIsumas(Double isumas) {
		this.isumas = isumas;
	}

	@Column(name = "paidup")
	public Double getPaidup() {
		return paidup;
	}

	public void setPaidup(Double paidup) {
		this.paidup = paidup;
	}

	@Column(name = "surrnd")
	public Double getSurrnd() {
		return surrnd;
	}

	public void setSurrnd(Double surrnd) {
		this.surrnd = surrnd;
	}

	@Column(name = "mature")
	public Double getMature() {
		return mature;
	}

	public void setMature(Double mature) {
		this.mature = mature;
	}

	@Column(name = "prmpyr")
	public Double getPrmpyr() {
		return prmpyr;
	}

	public void setPrmpyr(Double prmpyr) {
		this.prmpyr = prmpyr;
	}

	@Column(name = "prmpad")
	public Double getPrmpad() {
		return prmpad;
	}

	public void setPrmpad(Double prmpad) {
		this.prmpad = prmpad;
	}

	@Column(name = "polyer")
	public Integer getPolyer() {
		return polyer;
	}

	public void setPolyer(Integer polyer) {
		this.polyer = polyer;
	}

	@Column(name = "create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "createdate")
	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
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
