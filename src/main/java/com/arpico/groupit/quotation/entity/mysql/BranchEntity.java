package com.arpico.groupit.quotation.entity.mysql;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class BranchEntity {

	private Integer id;
	private String code;
	private String name;
	private String sName;
	private String tele;
	private String webSite;
	private String email;
	private String fax;

	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;
	private Date lockinDate;

	private RegionEntity regionEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "branch_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "branch_code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "branch_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "branch_s_name")
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Column(name = "branch_tele")
	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	@Column(name = "branch_web_site")
	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	@Column(name = "branch_email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "branch_fax")
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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

	@ManyToOne
	@JoinColumn(name = "region_region_id", nullable = false)
	public RegionEntity getRegionEntity() {
		return regionEntity;
	}

	public void setRegionEntity(RegionEntity regionEntity) {
		this.regionEntity = regionEntity;
	}

	@Override
	public String toString() {
		return "BranchEntity [id=" + id + ", code=" + code + ", name=" + name + ", sName=" + sName + ", tele=" + tele
				+ ", webSite=" + webSite + ", email=" + email + ", fax=" + fax + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate
				+ ", lockinDate=" + lockinDate + ", regionEntity=" + regionEntity + "]";
	}

}
