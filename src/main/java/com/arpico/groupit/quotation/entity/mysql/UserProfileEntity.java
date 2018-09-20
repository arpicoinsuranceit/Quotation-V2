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
@Table(name = "user_profile_picture")
public class UserProfileEntity {
	private Integer id;
	private String url;
	private UserEntity userEntity;
	private boolean approve;
	private String status;
	private Date uploadDate;
	private Date approvedDate;
	private UserEntity approvedBy;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "user_id")
	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	@Column(name = "approve")
	public boolean isApprove() {
		return approve;
	}

	public void setApprove(boolean approve) {
		this.approve = approve;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "upload_date")
	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	@Column(name = "approved_date")
	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "approve_id")
	public UserEntity getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(UserEntity approvedBy) {
		this.approvedBy = approvedBy;
	}
}
