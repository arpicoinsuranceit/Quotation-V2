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
@Table(name = "nominee")
public class NomineeEntity {

	private Integer id;
	private String name;
	private Integer age;
	private Date dob;
	private String relation;
	
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

	@Column(name = "nominee_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "age")
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "nominee_dob")
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Column(name = "relation")
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "quotation_detail_id")
	public QuotationDetailEntity getQuotationDetailEntity() {
		return quotationDetailEntity;
	}

	public void setQuotationDetailEntity(QuotationDetailEntity quotationDetailEntity) {
		this.quotationDetailEntity = quotationDetailEntity;
	}
	
	
}
