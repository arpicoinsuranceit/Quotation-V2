package com.arpico.groupit.quotation.entity.mysql;

import java.util.Date;
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
@Table(name = "customer_details")
public class CustomerDetailEntity {

	private Integer id;
	private String title;
	private String name;
	private String nic;
	private String address;
	private Date dob;
	private String gender;
	private String civilStatus;
	private String tel;
	private String telx;
	private String email;

	private Date lockinDate;
	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;

	private CustomerEntity customerEntity;
	private OccupationEntity occupationEntity;
	
	private List<QuotationDetailEntity> quotationDetailEntities;
	private List<QuotationDetailEntity> quotationDetailEntitiesSpouse;
	private List<CustomerChildDetailEntity> customerChildDetailEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cust_detail_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "cust_title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "cust_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "cust_nic")
	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	@Column(name = "cust_address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "cust_dob")
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "cust_gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "cust_civil_status")
	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	@Column(name = "cust_tel")
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "cust_telx")
	public String getTelx() {
		return telx;
	}

	public void setTelx(String telx) {
		this.telx = telx;
	}

	@Column(name = "cust_email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "lockin_date")
	public Date getLockinDate() {
		return lockinDate;
	}

	public void setLockinDate(Date lockinDate) {
		this.lockinDate = lockinDate;
	}

	@Column(name = "cust_create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "cust_create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "cust_modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "cust_modify_date")
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cust_id", nullable = false)
	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ocupation_id", nullable = false)
	public OccupationEntity getOccupationEntity() {
		return occupationEntity;
	}

	public void setOccupationEntity(OccupationEntity occupationEntity) {
		this.occupationEntity = occupationEntity;
	}

	@OneToMany(mappedBy = "customerDetailEntity", targetEntity = QuotationDetailEntity.class)
	public List<QuotationDetailEntity> getQuotationDetailEntities() {
		return quotationDetailEntities;
	}

	public void setQuotationDetailEntities(List<QuotationDetailEntity> quotationDetailEntities) {
		this.quotationDetailEntities = quotationDetailEntities;
	}

	@OneToMany(mappedBy = "spouseDetailEntity", targetEntity = QuotationDetailEntity.class)
	public List<QuotationDetailEntity> getQuotationDetailEntitiesSpouse() {
		return quotationDetailEntitiesSpouse;
	}

	public void setQuotationDetailEntitiesSpouse(List<QuotationDetailEntity> quotationDetailEntitiesSpouse) {
		this.quotationDetailEntitiesSpouse = quotationDetailEntitiesSpouse;
	}

	@OneToMany(mappedBy = "customerDetailEntity", targetEntity = CustomerChildDetailEntity.class)
	public List<CustomerChildDetailEntity> getCustomerChildDetailEntities() {
		return customerChildDetailEntities;
	}

	public void setCustomerChildDetailEntities(List<CustomerChildDetailEntity> customerChildDetailEntities) {
		this.customerChildDetailEntities = customerChildDetailEntities;
	}

}
