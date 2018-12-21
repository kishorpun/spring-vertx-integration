package com.kiss.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "screening_match_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScreeningMatchInfo implements Serializable {

	private static final long serialVersionUID = 2963787952570166259L;

	@Id
	@JsonProperty("id")
	@SequenceGenerator(name = "n_matchinfo_id", sequenceName = "n_matchinfo_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "n_matchinfo_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "screeningn_id")
	@JsonIgnore
	private ScreeningNRequest screeningNRequest;



	@ManyToOne
	@JoinColumn(name = "screeningn_related_id")
	@JsonIgnore
	private ScreeningRelatedPersonRequest screeningNRelated;

	@ManyToOne
	@JoinColumn(name = "screeningn_entity_related_id")
	@JsonIgnore
	private ScreeningRelatedEntityRequest requestRelatedEntityRequestData;

	@JsonProperty("type")
	@Column(name = "type")
	private String type;

	@JsonProperty("risk")
	@Column(name = "risk")
	private int risk;

	@JsonProperty("match")
	@Column(name = "match")
	private boolean match;

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

	private String gender;

	private String nationality;

	private String designation;

	@JsonProperty("office_name")
	@Column(name = "office_name")
	private String officeName;

	@JsonProperty("second_name")
	@Column(name = "second_name")
	private String secondName;

	@JsonProperty("third_name")
	@Column(name = "third_name")
	private String thirdName;

	@JsonProperty("fourth_name")
	@Column(name = "fourth_name")
	private String fourthName;

	@JsonProperty("original_script_name")
	@Column(name = "original_script_name")
	private String originalScriptName;

	@JsonProperty("identification_name")
	@Column(name = "identification_name")
	private String identificationNumber;

	@JsonProperty("date_of_birth")
	@Column(name = "date_of_birth")
	private String dateOfBirth;

	private String name;

	@JsonProperty("original_source")
	@Column(name = "original_source")
	private String originalSource;

	@JsonProperty("place_of_birth")
	@Column(name = "place_of_birth")
	private String placeOfBirth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ScreeningRelatedEntityRequest getRequestRelatedEntityRequestData() {
		return requestRelatedEntityRequestData;
	}

	public void setRequestRelatedEntityRequestData(ScreeningRelatedEntityRequest requestRelatedEntityRequestData) {
		this.requestRelatedEntityRequestData = requestRelatedEntityRequestData;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRisk() {
		return risk;
	}

	public void setRisk(int risk) {
		this.risk = risk;
	}

	public boolean isMatch() {
		return match;
	}

	public void setMatch(boolean match) {
		this.match = match;
	}

	public ScreeningNRequest getScreeningNRequest() {
		return screeningNRequest;
	}

	

	public ScreeningRelatedPersonRequest getScreeningNRelated() {
		return screeningNRelated;
	}

	public void setScreeningNRequest(ScreeningNRequest screeningNRequest) {
		this.screeningNRequest = screeningNRequest;
	}

	public void setScreeningNRelated(ScreeningRelatedPersonRequest screeningNRelated) {
		this.screeningNRelated = screeningNRelated;
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

	public String getGender() {
		return gender;
	}

	public String getNationality() {
		return nationality;
	}

	public String getDesignation() {
		return designation;
	}

	public String getOfficeName() {
		return officeName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getThirdName() {
		return thirdName;
	}

	public String getFourthName() {
		return fourthName;
	}

	public String getOriginalScriptName() {
		return originalScriptName;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public String getOriginalSource() {
		return originalSource;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
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

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}

	public void setFourthName(String fourthName) {
		this.fourthName = fourthName;
	}

	public void setOriginalScriptName(String originalScriptName) {
		this.originalScriptName = originalScriptName;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOriginalSource(String originalSource) {
		this.originalSource = originalSource;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

}
