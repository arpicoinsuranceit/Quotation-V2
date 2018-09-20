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
@Table(name = "region")
public class RegionEntity {
	private Integer id;
	private String code;
	private String name;
	
	private String createBy;
	private Date createDate;
	private Date lockiDate;
	
	private ZoneEntity zoneEntity;
	
	private List<BranchEntity> branchEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "region_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "region_code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "region_name")
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
	public Date getLockiDate() {
		return lockiDate;
	}

	public void setLockiDate(Date lockiDate) {
		this.lockiDate = lockiDate;
	}

	@ManyToOne
	@JoinColumn(name = "zone_zone_id", nullable = false)
	public ZoneEntity getZoneEntity() {
		return zoneEntity;
	}

	public void setZoneEntity(ZoneEntity zoneEntity) {
		this.zoneEntity = zoneEntity;
	}

	@OneToMany(mappedBy = "regionEntity", targetEntity = BranchEntity.class)
	public List<BranchEntity> getBranchEntities() {
		return branchEntities;
	}

	public void setBranchEntities(List<BranchEntity> branchEntities) {
		this.branchEntities = branchEntities;
	}
}
