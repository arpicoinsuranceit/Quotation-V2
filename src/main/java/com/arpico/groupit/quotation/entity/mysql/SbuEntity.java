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
@Table(name = "rms_sbu")
public class SbuEntity {

	private Integer id;
	private String code;
	private String name;
	private String sName;
	private String address;
	private String city;
	private String tel;
	private String telx;
	private String fax;
	private String tax_no;
	private String email;
	private Integer active;
	private String createBy;
	private Date createdate;
	private String modifyBy;
	private Date modifydate;
	private Date lockin_date;
	
	private List<ZoneEntity> zoneEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sbu_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "sbu_code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "sbu_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sbu_s_name")
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "tel")
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "telx")
	public String getTelx() {
		return telx;
	}

	public void setTelx(String telx) {
		this.telx = telx;
	}

	@Column(name = "fax")
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "tax_no")
	public String getTax_no() {
		return tax_no;
	}

	public void setTax_no(String tax_no) {
		this.tax_no = tax_no;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "active")
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
	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Column(name = "modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "modifydate")
	public Date getModifydate() {
		return modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	@Column(name = "lockin_date")
	public Date getLockin_date() {
		return lockin_date;
	}

	public void setLockin_date(Date lockin_date) {
		this.lockin_date = lockin_date;
	}

	@OneToMany(mappedBy = "sbuEntity", targetEntity = ZoneEntity.class)
	public List<ZoneEntity> getZoneEntities() {
		return zoneEntities;
	}

	public void setZoneEntities(List<ZoneEntity> zoneEntities) {
		this.zoneEntities = zoneEntities;
	}

}
