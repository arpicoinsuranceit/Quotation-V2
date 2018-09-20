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
@Table(name = "previous_password")
public class PreviousPasswordEntity {

	private Integer id;
	private String password;
	private Date disableDate;
	private String disabledBy;
	private LoginEntity loginEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "disable_date")
	public Date getDisableDate() {
		return disableDate;
	}

	public void setDisableDate(Date disableDate) {
		this.disableDate = disableDate;
	}

	@Column(name = "disabled_by")
	public String getDisabledBy() {
		return disabledBy;
	}

	public void setDisabledBy(String disabledBy) {
		this.disabledBy = disabledBy;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn ( name = "login_login_id", nullable = false)
	public LoginEntity getLoginEntity() {
		return loginEntity;
	}

	public void setLoginEntity(LoginEntity loginEntity) {
		this.loginEntity = loginEntity;
	}

}
