package com.kiss.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "screening_related_entity_request_data")

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScreeningRelatedEntityRequestData implements Serializable{
	private static final long serialVersionUID = -999476750190025236L;
	@Id
	@JsonProperty("id")
	@SequenceGenerator(name = "screening_related_entity_request_data_id_seq", sequenceName = "screening_related_entity_request_data_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screening_related_entity_request_data_id_seq")
	private Long id;
	
	@OneToOne
	@JsonIgnore
	@JoinColumn(name="screening_related_entity_request_id")
	private ScreeningRelatedEntityRequest screeningRelatedEntityRequest;
	
	@JsonProperty("accounts_l_sub_type")
	@Column(name = "accounts_l_sub_type")
	private String accountsLSubType;

	@JsonProperty("kycl_id")
	@Column(name = "kycl_id")
	private String kyclId;

	@JsonProperty("cust_id")
	@Column(name = "cust_id")
	private String custId;

	@JsonProperty("name_of_institution")
	@Column(name = "name_of_institution")
	private String nameOfInstitution;

	@JsonProperty("ls_name")
	@Column(name = "ls_name")
	private String lsName;

	@JsonProperty("date_of_establishment")
	@Column(name = "date_of_establishment")
	private String dateOfEstablishment;

	@JsonProperty("registration_no")
	@Column(name = "registration_no")
	private String registrationNo;

	@JsonProperty("type_of_industry")
	@Column(name = "type_of_industry")
	private String typeOfIndustry;

	@JsonProperty("country_of_issue")
	@Column(name = "country_of_issue")
	private String countryOfIssue;

	@JsonProperty("zone")
	@Column(name = "zone")
	private String zone;

	@JsonProperty("district")
	@Column(name = "district")
	private String district;

	@JsonProperty("mn_vdc")
	@Column(name = "mn_vdc")
	private String mnVdc;

	@JsonProperty("province")
	@Column(name = "province")
	private String province;

	@JsonProperty("ward_no")
	@Column(name = "ward_no")
	private String wardNo;

	@JsonProperty("pan_number")
	@Column(name = "pan_number")
	private String panNumber;

	@JsonProperty("contact_number")
	@Column(name = "contact_number")
	private String contactNumber;

	@JsonProperty("email_id")
	@Column(name = "email_id")
	private String emailId;

	@JsonProperty("notes")
	@Column(name = "notes")
	private String notes;

	@JsonProperty("find_match_index")
	@Column(name = "find_match_index")
	private String findMatchIndex;

	@JsonProperty("has_kyc")
	@Column(name = "has_kyc")
	private boolean haskyc;

	@JsonProperty("has_cust_id")
	@Column(name = "has_cust_id")
	boolean hasCustId;

	@JsonProperty("branch_sol_id")
	@Column(name = "branch_sol_id")
	private String branchSolId;

	@JsonProperty("date_of_establishment_bs")
	@Column(name = "date_of_establishment_bs")
	private Date dateOfEstablishmentBS;

	@JsonProperty("repair_screening_l_request_id")
	@Column(name = "repair_screening_l_request_id")
	private long repairScreeningLRequestId;
	
	@JsonProperty("search_text")
	@Column(name="search_text")
	private String searchText;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountsLSubType() {
		return accountsLSubType;
	}

	public void setAccountsLSubType(String accountsLSubType) {
		this.accountsLSubType = accountsLSubType;
	}

	public String getKyclId() {
		return kyclId;
	}

	public void setKyclId(String kyclId) {
		this.kyclId = kyclId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getNameOfInstitution() {
		return nameOfInstitution;
	}

	public void setNameOfInstitution(String nameOfInstitution) {
		this.nameOfInstitution = nameOfInstitution;
	}

	public String getLsName() {
		return lsName;
	}

	public void setLsName(String lsName) {
		this.lsName = lsName;
	}

	public String getDateOfEstablishment() {
		return dateOfEstablishment;
	}

	public void setDateOfEstablishment(String dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getTypeOfIndustry() {
		return typeOfIndustry;
	}

	public void setTypeOfIndustry(String typeOfIndustry) {
		this.typeOfIndustry = typeOfIndustry;
	}

	public String getCountryOfIssue() {
		return countryOfIssue;
	}

	public void setCountryOfIssue(String countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMnVdc() {
		return mnVdc;
	}

	public void setMnVdc(String mnVdc) {
		this.mnVdc = mnVdc;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getWardNo() {
		return wardNo;
	}

	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getFindMatchIndex() {
		return findMatchIndex;
	}

	public void setFindMatchIndex(String findMatchIndex) {
		this.findMatchIndex = findMatchIndex;
	}

	public boolean isHaskyc() {
		return haskyc;
	}

	public void setHaskyc(boolean haskyc) {
		this.haskyc = haskyc;
	}

	public boolean isHasCustId() {
		return hasCustId;
	}

	public void setHasCustId(boolean hasCustId) {
		this.hasCustId = hasCustId;
	}

	public String getBranchSolId() {
		return branchSolId;
	}

	public void setBranchSolId(String branchSolId) {
		this.branchSolId = branchSolId;
	}

	public Date getDateOfEstablishmentBS() {
		return dateOfEstablishmentBS;
	}

	public void setDateOfEstablishmentBS(Date dateOfEstablishmentBS) {
		this.dateOfEstablishmentBS = dateOfEstablishmentBS;
	}

	public long getRepairScreeningLRequestId() {
		return repairScreeningLRequestId;
	}

	public void setRepairScreeningLRequestId(long repairScreeningLRequestId) {
		this.repairScreeningLRequestId = repairScreeningLRequestId;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public ScreeningRelatedEntityRequest getScreeningRelatedEntityRequest() {
		return screeningRelatedEntityRequest;
	}

	public void setScreeningRelatedEntityRequest(ScreeningRelatedEntityRequest screeningRelatedEntityRequest) {
		this.screeningRelatedEntityRequest = screeningRelatedEntityRequest;
	}


}
