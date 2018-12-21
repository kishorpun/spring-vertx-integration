package com.kiss.entity;

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
@Table(name = "screening_n_request_data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScreeningNRequestData {

	@Id
	@JsonProperty("id")
	@SequenceGenerator(name = "screening_n_request_data_id_seq", sequenceName = "screening_n_request_data_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screening_n_request_data_id_seq")
	private Long id;
	
	@OneToOne
	@JoinColumn(name="screening_n_request_id")
	@JsonIgnore
	private ScreeningNRequest screeningNRequest;
	

	@OneToOne
	@JoinColumn(name="screening_related_request_id")
	@JsonIgnore
	private ScreeningRelatedPersonRequest screeningRelatedRequest;
	
	@JsonProperty("branch_sol_id")
	@Column(name = "branch_sol_id")
	private String branchSolId;

	@JsonProperty("purpose_of_screening_n")
	@Column(name = "purpose_of_screening_n")
	private String purposeOfScreeningN;

	@JsonProperty("sender_receiver")
	@Column(name = "sender_receiver")
	private String senderReceiver;

	@JsonProperty("has_kycn")
	@Column(name = "has_kycn")
	private boolean hasKycn;

	@JsonProperty("kycn_id")
	@Column(name = "kycn_id")
	private long kycnId;

	@JsonProperty("has_cust_id")
	@Column(name = "has_cust_id")
	private boolean hasCustId;

	@JsonProperty("cust_id")
	@Column(name = "cust_id")
	private String custId;
	
	@JsonProperty("cbs_name")
	@Column(name = "cbs_name")
	private String cbsName;
	
	@JsonProperty("account_id")
	@Column(name = "account_id")
	private String accountId;

	@JsonProperty("first_name")
	@Column(name = "first_name")
	private String firstName;

	@JsonProperty("middle_name")
	@Column(name = "middle_name")
	private String middleName;

	@JsonProperty("last_name")
	@Column(name = "last_name")
	private String lastName;

	@JsonProperty("lsf_name")
	@Column(name = "lsf_name")
	private String lsfName;

	@JsonProperty("lsm_name")
	@Column(name = "lsm_name")
	private String lsmName;

	@JsonProperty("lsl_name")
	@Column(name = "lsl_name")
	private String lslName;

	@JsonProperty("date_of_birth")
	@Column(name = "date_of_birth")
	private java.sql.Date dateOfBirth;

	@JsonProperty("primary_identification_document_type")
	@Column(name = "primary_identification_document_type")
	private String primaryIdentificationType;

	@JsonProperty("primary_identification_document_no")
	@Column(name = "primary_identification_document_no")
	private String primaryIdentificationNo;

	@JsonProperty("country_of_issue")
	@Column(name = "country_of_issue")
	private String countryOfIssue;

	@JsonProperty("state")
	@Column(name = "state")
	private String state;

	@JsonProperty("district")
	@Column(name = "district")
	private String district;

	@JsonProperty("mn_vdc")
	@Column(name = "mn_vdc")
	private String mnVdc;

	@JsonProperty("ward_no")
	@Column(name = "ward_no")
	private String wardNo;

	@JsonProperty("username")
	@Column(name = "username")
	private String maker;

	@JsonProperty("request_date")
	@Column(name = "request_date")
	private java.sql.Date requestDate;

	@JsonProperty("request_time")
	@Column(name = "request_time")
	private java.sql.Time requestTime;

	@JsonProperty("status")
	@Column(name = "status")
	private String status;

	@JsonProperty("screening_completed")
	@Column(name = "screening_completed")
	private boolean screeningCompleted;

	@JsonProperty("risk")
	@Column(name = "risk")
	private int risk;

	@JsonProperty("workflow_completed")
	@Column(name = "workflow_completed")
	private boolean workflowCompleted;

	@JsonProperty("account_type")
	@Column(name = "account_type")
	private String accountType;

	@JsonProperty("account_sub_type")
	@Column(name = "account_sub_type")
	private String accountSubType;

	@JsonProperty("has_nominee")
	@Column(name = "has_nominee")
	private boolean hasNominee;

	@JsonProperty("num_nominee")
	@Column(name = "num_nominee")
	private int numNominee;

	@JsonProperty("has_mandate")
	@Column(name = "has_mandate")
	private boolean hasMandate;

	@JsonProperty("num_mandate")
	@Column(name = "num_mandate")
	private int numMandate;

	@JsonProperty("has_signatory")
	@Column(name = "has_signatory")
	private boolean hasSignatory;

	@JsonProperty("num_signatory")
	@Column(name = "num_signatory")
	private int numSignatory;

	@JsonProperty("has_joint_account_holder")
	@Column(name = "has_joint_account_holder")
	private boolean hasJointAccountHolder;

	@JsonProperty("num_joint_account_holder")
	@Column(name = "num_joint_account_holder")
	private int numJointAccountHolder;

	@JsonProperty("find_match_index")
	@Column(name = "find_match_index")
	private float matchIndex;

	@JsonProperty("notes")
	@Column(name = "notes")
	private String notes;

	@JsonProperty("zone")
	@Column(name = "zone")
	private String zone;

	@JsonProperty("province")
	@Column(name = "province")
	private String province;

	@JsonProperty("repair_screening_n_request_id")
	@Column(name = "repair_screening_n_request_id")
	private long repairScreeningNRequestId;

	@JsonProperty("salutation")
	@Column(name = "salutation")
	private String salutation;

	@JsonProperty("gender")
	@Column(name = "gender")
	private String gender;

	@JsonProperty("mobile_number")
	@Column(name = "mobile_number")
	private String mobileNumber;

	@JsonProperty("email_id")
	@Column(name = "email_id")
	private String emailId;

	@JsonProperty("nature_of_account")
	@Column(name = "nature_of_account")
	private String natureOfAccount;

	@JsonProperty("scheme_description")
	@Column(name = "scheme_description")
	private String schemeDescription;

	@JsonProperty("deposit_amount")
	@Column(name = "deposit_amount")
	private String depositAmount;

	@JsonProperty("pan_number")
	@Column(name = "pan_number")
	private String panNumber;

	@JsonProperty("repaired")
	@Column(name = "repaired")
	private boolean repaired;

	@JsonProperty("migrated")
	@Column(name = "migrated")
	private boolean migrated;

	@JsonProperty("date_of_birth_bs")
	@Column(name = "date_of_birth_bs")
	private Date dateOfBirthBS;

	@JsonProperty("search_text")
	@Column(name = "search_text")
	private String searchText;

	public Long getId() {
		return id;
	}

	public ScreeningNRequest getScreeningNRequest() {
		return screeningNRequest;
	}

	public ScreeningRelatedPersonRequest getScreeningRelatedRequest() {
		return screeningRelatedRequest;
	}

	public String getBranchSolId() {
		return branchSolId;
	}

	public String getPurposeOfScreeningN() {
		return purposeOfScreeningN;
	}

	public String getSenderReceiver() {
		return senderReceiver;
	}

	public boolean isHasKycn() {
		return hasKycn;
	}

	public long getKycnId() {
		return kycnId;
	}

	public boolean isHasCustId() {
		return hasCustId;
	}

	public String getCustId() {
		return custId;
	}

	public String getCbsName() {
		return cbsName;
	}

	public String getAccountId() {
		return accountId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLsfName() {
		return lsfName;
	}

	public String getLsmName() {
		return lsmName;
	}

	public String getLslName() {
		return lslName;
	}

	public java.sql.Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getPrimaryIdentificationType() {
		return primaryIdentificationType;
	}

	public String getPrimaryIdentificationNo() {
		return primaryIdentificationNo;
	}

	public String getCountryOfIssue() {
		return countryOfIssue;
	}

	public String getState() {
		return state;
	}

	public String getDistrict() {
		return district;
	}

	public String getMnVdc() {
		return mnVdc;
	}

	public String getWardNo() {
		return wardNo;
	}

	public String getMaker() {
		return maker;
	}

	public java.sql.Date getRequestDate() {
		return requestDate;
	}

	public java.sql.Time getRequestTime() {
		return requestTime;
	}

	public String getStatus() {
		return status;
	}

	public boolean isScreeningCompleted() {
		return screeningCompleted;
	}

	public int getRisk() {
		return risk;
	}

	public boolean isWorkflowCompleted() {
		return workflowCompleted;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getAccountSubType() {
		return accountSubType;
	}

	public boolean isHasNominee() {
		return hasNominee;
	}

	public int getNumNominee() {
		return numNominee;
	}

	public boolean isHasMandate() {
		return hasMandate;
	}

	public int getNumMandate() {
		return numMandate;
	}

	public boolean isHasSignatory() {
		return hasSignatory;
	}

	public int getNumSignatory() {
		return numSignatory;
	}

	public boolean isHasJointAccountHolder() {
		return hasJointAccountHolder;
	}

	public int getNumJointAccountHolder() {
		return numJointAccountHolder;
	}

	public float getMatchIndex() {
		return matchIndex;
	}

	public String getNotes() {
		return notes;
	}

	public String getZone() {
		return zone;
	}

	public String getProvince() {
		return province;
	}

	public long getRepairScreeningNRequestId() {
		return repairScreeningNRequestId;
	}

	public String getSalutation() {
		return salutation;
	}

	public String getGender() {
		return gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getNatureOfAccount() {
		return natureOfAccount;
	}

	public String getSchemeDescription() {
		return schemeDescription;
	}

	public String getDepositAmount() {
		return depositAmount;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public boolean isRepaired() {
		return repaired;
	}

	public boolean isMigrated() {
		return migrated;
	}

	public Date getDateOfBirthBS() {
		return dateOfBirthBS;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setScreeningNRequest(ScreeningNRequest screeningNRequest) {
		this.screeningNRequest = screeningNRequest;
	}

	public void setScreeningRelatedRequest(ScreeningRelatedPersonRequest screeningRelatedRequest) {
		this.screeningRelatedRequest = screeningRelatedRequest;
	}

	public void setBranchSolId(String branchSolId) {
		this.branchSolId = branchSolId;
	}

	public void setPurposeOfScreeningN(String purposeOfScreeningN) {
		this.purposeOfScreeningN = purposeOfScreeningN;
	}

	public void setSenderReceiver(String senderReceiver) {
		this.senderReceiver = senderReceiver;
	}

	public void setHasKycn(boolean hasKycn) {
		this.hasKycn = hasKycn;
	}

	public void setKycnId(long kycnId) {
		this.kycnId = kycnId;
	}

	public void setHasCustId(boolean hasCustId) {
		this.hasCustId = hasCustId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void setCbsName(String cbsName) {
		this.cbsName = cbsName;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLsfName(String lsfName) {
		this.lsfName = lsfName;
	}

	public void setLsmName(String lsmName) {
		this.lsmName = lsmName;
	}

	public void setLslName(String lslName) {
		this.lslName = lslName;
	}

	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setPrimaryIdentificationType(String primaryIdentificationType) {
		this.primaryIdentificationType = primaryIdentificationType;
	}

	public void setPrimaryIdentificationNo(String primaryIdentificationNo) {
		this.primaryIdentificationNo = primaryIdentificationNo;
	}

	public void setCountryOfIssue(String countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setMnVdc(String mnVdc) {
		this.mnVdc = mnVdc;
	}

	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setRequestDate(java.sql.Date requestDate) {
		this.requestDate = requestDate;
	}

	public void setRequestTime(java.sql.Time requestTime) {
		this.requestTime = requestTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setScreeningCompleted(boolean screeningCompleted) {
		this.screeningCompleted = screeningCompleted;
	}

	public void setRisk(int risk) {
		this.risk = risk;
	}

	public void setWorkflowCompleted(boolean workflowCompleted) {
		this.workflowCompleted = workflowCompleted;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setAccountSubType(String accountSubType) {
		this.accountSubType = accountSubType;
	}

	public void setHasNominee(boolean hasNominee) {
		this.hasNominee = hasNominee;
	}

	public void setNumNominee(int numNominee) {
		this.numNominee = numNominee;
	}

	public void setHasMandate(boolean hasMandate) {
		this.hasMandate = hasMandate;
	}

	public void setNumMandate(int numMandate) {
		this.numMandate = numMandate;
	}

	public void setHasSignatory(boolean hasSignatory) {
		this.hasSignatory = hasSignatory;
	}

	public void setNumSignatory(int numSignatory) {
		this.numSignatory = numSignatory;
	}

	public void setHasJointAccountHolder(boolean hasJointAccountHolder) {
		this.hasJointAccountHolder = hasJointAccountHolder;
	}

	public void setNumJointAccountHolder(int numJointAccountHolder) {
		this.numJointAccountHolder = numJointAccountHolder;
	}

	public void setMatchIndex(float matchIndex) {
		this.matchIndex = matchIndex;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setRepairScreeningNRequestId(long repairScreeningNRequestId) {
		this.repairScreeningNRequestId = repairScreeningNRequestId;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setNatureOfAccount(String natureOfAccount) {
		this.natureOfAccount = natureOfAccount;
	}

	public void setSchemeDescription(String schemeDescription) {
		this.schemeDescription = schemeDescription;
	}

	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public void setRepaired(boolean repaired) {
		this.repaired = repaired;
	}

	public void setMigrated(boolean migrated) {
		this.migrated = migrated;
	}

	public void setDateOfBirthBS(Date dateOfBirthBS) {
		this.dateOfBirthBS = dateOfBirthBS;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	
	
}
