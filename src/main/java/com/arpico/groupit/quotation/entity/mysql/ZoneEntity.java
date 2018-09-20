package com.arpico.groupit.quotation.entity.mysql;


import java.util.Date;
import java.util.List;

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
@Table(name = "zone")
public class ZoneEntity {

	private Integer id;
	private String code;
	private String name;

	private String createBy;
	private Date createDate;
	private Date lockinDate;

	private SbuEntity sbuEntity;
	
	List<RegionEntity> regionEntities;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "zone_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "zone_code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "zone_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Column(name = "lockin_date")
	public Date getLockinDate() {
		return lockinDate;
	}

	public void setLockinDate(Date lockinDate) {
		this.lockinDate = lockinDate;
	}

	@ManyToOne
	@JoinColumn(name = "rms_sbu_sbu_id", nullable = false)
	public SbuEntity getSbuEntity() {
		return sbuEntity;
	}

	public void setSbuEntity(SbuEntity sbuEntity) {
		this.sbuEntity = sbuEntity;
	}

	@OneToMany(mappedBy = "zoneEntity",  targetEntity = RegionEntity.class)
	public List<RegionEntity> getRegionEntities() {
		return regionEntities;
	}

	public void setRegionEntities(List<RegionEntity> regionEntities) {
		this.regionEntities = regionEntities;
	}
}
