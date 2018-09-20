package com.arpico.groupit.quotation.entity.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medi_test_grid")
public class MediTestGridEntity {

	private Integer id;
	private Double sumAssuredFrom;
	private Double sumAssuredTo;
	private Integer ageFrom;
	private Integer ageTo;
	private String tests;
	private String mediGrade;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "sum_assured_from")
	public Double getSumAssuredFrom() {
		return sumAssuredFrom;
	}

	public void setSumAssuredFrom(Double sumAssuredFrom) {
		this.sumAssuredFrom = sumAssuredFrom;
	}

	@Column(name = "sum_assured_to")
	public Double getSumAssuredTo() {
		return sumAssuredTo;
	}

	public void setSumAssuredTo(Double sumAssuredTo) {
		this.sumAssuredTo = sumAssuredTo;
	}

	@Column(name = "age_from")
	public Integer getAgeFrom() {
		return ageFrom;
	}

	public void setAgeFrom(Integer ageFrom) {
		this.ageFrom = ageFrom;
	}

	@Column(name = "age_to")
	public Integer getAgeTo() {
		return ageTo;
	}

	public void setAgeTo(Integer ageTo) {
		this.ageTo = ageTo;
	}

	@Column(name = "tests")
	public String getTests() {
		return tests;
	}

	public void setTests(String tests) {
		this.tests = tests;
	}

	@Column(name = "medi_grade")
	public String getMediGrade() {
		return mediGrade;
	}

	public void setMediGrade(String mediGrade) {
		this.mediGrade = mediGrade;
	}

}
