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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

	private Integer id;
	private String code;
	private String empNo;
	private String title;
	private String name;
	private String address;
	private String nic;
	private String passport;
	private String email;
	private String tele;
	private String mobile;
	private Integer active;

	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;
	private Date lockinDate;
	
	private DesignationEntity designationEntity;
	private LoginEntity loginEntity;
	private List<UserProfileEntity> userProfileEntities;
	private List<QuotationEntity> quotationEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "user_code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "user_emp_no")
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	@Column(name = "user_title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "user_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "user_address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "user_nic")
	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	@Column(name = "user_passport")
	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	@Column(name = "user_email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "user_tele")
	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	@Column(name = "user_mobile")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "user_active")
	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Column(name = "create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "createdate")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "modifydate")
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Column(name = "lockin_date")
	public Date getLockinDate() {
		return lockinDate;
	}

	public void setLockinDate(Date lockinDate) {
		this.lockinDate = lockinDate;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "designation_designation_id" , nullable = false)
	public DesignationEntity getDesignationEntity() {
		return designationEntity;
	}

	public void setDesignationEntity(DesignationEntity designationEntity) {
		this.designationEntity = designationEntity;
	}

	@OneToOne()
	@JoinColumn(nullable = false, name = "login_login_id")
	public LoginEntity getLoginEntity() {
		return loginEntity;
	}

	public void setLoginEntity(LoginEntity loginEntity) {
		this.loginEntity = loginEntity;
	}

	@OneToMany(mappedBy = "userEntity", targetEntity = UserProfileEntity.class)
	public List<UserProfileEntity> getUserProfileEntities() {
		return userProfileEntities;
	}

	public void setUserProfileEntities(List<UserProfileEntity> userProfileEntities) {
		this.userProfileEntities = userProfileEntities;
	}

	@OneToMany(mappedBy = "userEntity", targetEntity = QuotationEntity.class)
	public List<QuotationEntity> getQuotationEntities() {
		return quotationEntities;
	}

	public void setQuotationEntities(List<QuotationEntity> quotationEntities) {
		this.quotationEntities = quotationEntities;
	}


	
}

