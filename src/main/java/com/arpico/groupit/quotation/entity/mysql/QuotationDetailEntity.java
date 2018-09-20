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
@Table(name = "quotation_details")
public class QuotationDetailEntity {

	private Integer id;
	private String paingTerm;
	private Integer polTerm;
	private Double baseSum;
	private String payMode;
	private Double premiumMonth;
	private Double premiumMonthT;
	private Double premiumQuater;
	private Double premiumQuaterT;
	private Double premiumHalf;
	private Double premiumHalfT;
	private Double premiumYear;
	private Double premiumYearT;
	private Double premiumSingle;
	private Double premiumSingleT;
	private Double sumAtRiskMain;
	private Double sumAtRiskSpouse;

	private Double policyFee;
	private Double taxAmount;
	private Double adminFee;

	private Double interestRate;
	private Double investmentPos;
	private Double lifePos;

	private Integer pensionTerm;
	private Integer retirmentAge;

	private Double premium = 0.0;
	private Integer seqnum = 1;

	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;

	private QuotationEntity quotationEntity;
	private CustomerDetailEntity customerDetailEntity;
	private CustomerDetailEntity spouseDetailEntity;

	private List<NomineeEntity> nomineeEntities;
	private List<SurrenderValueEntity> surrenderValueEntities;
	private List<ScheduleEntity> scheduleEntities;
	private List<MedicalDetailEntity> medicalDetailEntities;
	private List<PensionScheduleEntity> pensionScheduleEntities;
	private List<QuotationBenefictDetailEntity> quotationBenefictDetailEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "qd_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "paing_term")
	public String getPaingTerm() {
		return paingTerm;
	}

	public void setPaingTerm(String paingTerm) {
		this.paingTerm = paingTerm;
	}

	@Column(name = "pol_term")
	public Integer getPolTerm() {
		return polTerm;
	}

	public void setPolTerm(Integer polTerm) {
		this.polTerm = polTerm;
	}

	@Column(name = "base_sum")
	public Double getBaseSum() {
		return baseSum;
	}

	public void setBaseSum(Double baseSum) {
		this.baseSum = baseSum;
	}

	@Column(name = "pay_mode")
	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	@Column(name = "premium_month")
	public Double getPremiumMonth() {
		return premiumMonth;
	}

	public void setPremiumMonth(Double premiumMonth) {
		this.premiumMonth = premiumMonth;
	}

	@Column(name = "premium_montht")
	public Double getPremiumMonthT() {
		return premiumMonthT;
	}

	public void setPremiumMonthT(Double premiumMonthT) {
		this.premiumMonthT = premiumMonthT;
	}

	@Column(name = "premium_quater")
	public Double getPremiumQuater() {
		return premiumQuater;
	}

	public void setPremiumQuater(Double premiumQuater) {
		this.premiumQuater = premiumQuater;
	}

	@Column(name = "premium_quatert")
	public Double getPremiumQuaterT() {
		return premiumQuaterT;
	}

	public void setPremiumQuaterT(Double premiumQuaterT) {
		this.premiumQuaterT = premiumQuaterT;
	}

	@Column(name = "premium_half")
	public Double getPremiumHalf() {
		return premiumHalf;
	}

	public void setPremiumHalf(Double premiumHalf) {
		this.premiumHalf = premiumHalf;
	}

	@Column(name = "premium_halft")
	public Double getPremiumHalfT() {
		return premiumHalfT;
	}

	public void setPremiumHalfT(Double premiumHalfT) {
		this.premiumHalfT = premiumHalfT;
	}

	@Column(name = "premium_year")
	public Double getPremiumYear() {
		return premiumYear;
	}

	public void setPremiumYear(Double premiumYear) {
		this.premiumYear = premiumYear;
	}

	@Column(name = "premium_yeart")
	public Double getPremiumYearT() {
		return premiumYearT;
	}

	public void setPremiumYearT(Double premiumYearT) {
		this.premiumYearT = premiumYearT;
	}

	@Column(name = "premium_single")
	public Double getPremiumSingle() {
		return premiumSingle;
	}

	public void setPremiumSingle(Double premiumSingle) {
		this.premiumSingle = premiumSingle;
	}

	@Column(name = "premium_singlet")
	public Double getPremiumSingleT() {
		return premiumSingleT;
	}

	public void setPremiumSingleT(Double premiumSingleT) {
		this.premiumSingleT = premiumSingleT;
	}

	@Column(name = "sum_at_risk_main")
	public Double getSumAtRiskMain() {
		return sumAtRiskMain;
	}

	public void setSumAtRiskMain(Double sumAtRiskMain) {
		this.sumAtRiskMain = sumAtRiskMain;
	}

	@Column(name = "sum_at_risk_spouse")
	public Double getSumAtRiskSpouse() {
		return sumAtRiskSpouse;
	}

	public void setSumAtRiskSpouse(Double sumAtRiskSpouse) {
		this.sumAtRiskSpouse = sumAtRiskSpouse;
	}

	@Column(name = "policy_fee")
	public Double getPolicyFee() {
		return policyFee;
	}

	public void setPolicyFee(Double policyFee) {
		this.policyFee = policyFee;
	}

	@Column(name = "tax_amount")
	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	@Column(name = "admin_fee")
	public Double getAdminFee() {
		return adminFee;
	}

	public void setAdminFee(Double adminFee) {
		this.adminFee = adminFee;
	}

	@Column(name = "interest_rate")
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Column(name = "investment_pos")
	public Double getInvestmentPos() {
		return investmentPos;
	}

	public void setInvestmentPos(Double investmentPos) {
		this.investmentPos = investmentPos;
	}

	@Column(name = "life_pos")
	public Double getLifePos() {
		return lifePos;
	}

	public void setLifePos(Double lifePos) {
		this.lifePos = lifePos;
	}

	@Column(name = "pension_term")
	public Integer getPensionTerm() {
		return pensionTerm;
	}

	public void setPensionTerm(Integer pensionTerm) {
		this.pensionTerm = pensionTerm;
	}

	@Column(name = "retirment_age")
	public Integer getRetirmentAge() {
		return retirmentAge;
	}

	public void setRetirmentAge(Integer retirmentAge) {
		this.retirmentAge = retirmentAge;
	}

	@Column(name = "premium")
	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	@Column(name = "seqnum")
	public Integer getSeqnum() {
		return seqnum;
	}

	public void setSeqnum(Integer seqnum) {
		this.seqnum = seqnum;
	}

	@Column(name = "quotation_create_by")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "quotation_create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "quotation_modify_by")
	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Column(name = "quotation_modify_date")
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "quotation_id", nullable = false)
	public QuotationEntity getQuotationEntity() {
		return quotationEntity;
	}

	public void setQuotationEntity(QuotationEntity quotationEntity) {
		this.quotationEntity = quotationEntity;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", nullable = false)
	public CustomerDetailEntity getCustomerDetailEntity() {
		return customerDetailEntity;
	}

	public void setCustomerDetailEntity(CustomerDetailEntity customerDetailEntity) {
		this.customerDetailEntity = customerDetailEntity;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "spouse_id", nullable = false)
	public CustomerDetailEntity getSpouseDetailEntity() {
		return spouseDetailEntity;
	}

	public void setSpouseDetailEntity(CustomerDetailEntity spouseDetailEntity) {
		this.spouseDetailEntity = spouseDetailEntity;
	}

	@OneToMany(mappedBy = "quotationDetailEntity", targetEntity = NomineeEntity.class)
	public List<NomineeEntity> getNomineeEntities() {
		return nomineeEntities;
	}

	public void setNomineeEntities(List<NomineeEntity> nomineeEntities) {
		this.nomineeEntities = nomineeEntities;
	}

	@OneToMany(mappedBy = "quotationDetailEntity", targetEntity = SurrenderValueEntity.class)
	public List<SurrenderValueEntity> getSurrenderValueEntities() {
		return surrenderValueEntities;
	}

	public void setSurrenderValueEntities(List<SurrenderValueEntity> surrenderValueEntities) {
		this.surrenderValueEntities = surrenderValueEntities;
	}

	@OneToMany(mappedBy = "quotationDetailEntity", targetEntity = ScheduleEntity.class)
	public List<ScheduleEntity> getScheduleEntities() {
		return scheduleEntities;
	}

	public void setScheduleEntities(List<ScheduleEntity> scheduleEntities) {
		this.scheduleEntities = scheduleEntities;
	}

	@OneToMany(mappedBy = "quotationDetailEntity", targetEntity = MedicalDetailEntity.class)
	public List<MedicalDetailEntity> getMedicalDetailEntities() {
		return medicalDetailEntities;
	}

	public void setMedicalDetailEntities(List<MedicalDetailEntity> medicalDetailEntities) {
		this.medicalDetailEntities = medicalDetailEntities;
	}

	@OneToMany(mappedBy = "quotationDetailEntity", targetEntity = PensionScheduleEntity.class)
	public List<PensionScheduleEntity> getPensionScheduleEntities() {
		return pensionScheduleEntities;
	}

	public void setPensionScheduleEntities(List<PensionScheduleEntity> pensionScheduleEntities) {
		this.pensionScheduleEntities = pensionScheduleEntities;
	}

	@OneToMany(mappedBy = "quotationDetailEntity", targetEntity = QuotationBenefictDetailEntity.class)
	public List<QuotationBenefictDetailEntity> getQuotationBenefictDetailEntities() {
		return quotationBenefictDetailEntities;
	}

	public void setQuotationBenefictDetailEntities(List<QuotationBenefictDetailEntity> quotationBenefictDetailEntities) {
		this.quotationBenefictDetailEntities = quotationBenefictDetailEntities;
	}

}
