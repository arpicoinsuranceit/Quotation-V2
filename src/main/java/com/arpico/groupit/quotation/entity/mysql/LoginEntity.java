package com.arpico.groupit.quotation.entity.mysql;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginEntity {

	private Integer id;
	private String name;
	private String password;
	private Date lastLog;
	private Integer failCount;
	private Integer locks;
	private Date inactiveDate;

	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;
	
	private UserEntity userEntity;
	private List<PreviousPasswordEntity> previousPasswordEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "login_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "user_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "last_log")
	public Date getLastLog() {
		return lastLog;
	}

	public void setLastLog(Date lastLog) {
		this.lastLog = lastLog;
	}

	@Column(name = "fail_count")
	public Integer getFailCount() {
		return failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}

	@Column(name = "locks")
	public Integer getLocks() {
		return locks;
	}

	public void setLocks(Integer locks) {
		this.locks = locks;
	}

	@Column(name = "inactive_date")
	public Date getInactiveDate() {
		return inactiveDate;
	}

	public void setInactiveDate(Date inactiveDate) {
		this.inactiveDate = inactiveDate;
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

	@OneToOne(mappedBy = "loginEntity", targetEntity = UserEntity.class)
	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	@OneToMany(mappedBy = "loginEntity", targetEntity = PreviousPasswordEntity.class)
	public List<PreviousPasswordEntity> getPreviousPasswordEntities() {
		return previousPasswordEntities;
	}

	public void setPreviousPasswordEntities(List<PreviousPasswordEntity> previousPasswordEntities) {
		this.previousPasswordEntities = previousPasswordEntities;
	}

}
