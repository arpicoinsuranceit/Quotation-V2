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
@Table(name = "child")
public class ChildEntity {

	private Integer id;
	private String name;
	private String nic;
	private Date dob;
	private String gender;
	private String relation;
	
	List<CustomerChildDetailEntity> customerChildDetailEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "child_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "child_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "child_nic")
	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	@Column(name = "child_dob")
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "child_gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "child_relation")
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@OneToMany(mappedBy = "childEntity", targetEntity = CustomerChildDetailEntity.class)
	public List<CustomerChildDetailEntity> getCustomerChildDetailEntities() {
		return customerChildDetailEntities;
	}

	public void setCustomerChildDetailEntities(List<CustomerChildDetailEntity> customerChildDetailEntities) {
		this.customerChildDetailEntities = customerChildDetailEntities;
	}



}
