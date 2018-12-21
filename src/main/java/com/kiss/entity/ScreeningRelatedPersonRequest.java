package com.kiss.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "screening_natural_related")

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScreeningRelatedPersonRequest implements Serializable{


	private static final long serialVersionUID = -4889007682493532773L;

	@Id
	@JsonProperty("id")
	@SequenceGenerator(name = "screening_nrelated_id_seq", sequenceName = "screening_nrelated_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screening_nrelated_id_seq")
	private Long id;

	@JsonProperty("related_person_request_data")
	@OneToOne(mappedBy= "screeningRelatedRequest", fetch= FetchType.EAGER, cascade= CascadeType.ALL)
	private ScreeningNRequestData screeningNRequestData;

	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER, targetEntity = ScreeningNRequest.class, mappedBy = "listOfRelated")
	private Set<ScreeningNRequest> listOfNaturalRequest = new HashSet<>();


	@JsonProperty("screening_attachment")
	@OneToMany(mappedBy = "screeningNRelated", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningAttachment> attachment = new HashSet<>();

	@JsonProperty("related_person_match_data")
	@OneToMany(mappedBy = "screeningNRelated", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningMatchInfo> screeningNMatchInfo = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ScreeningNRequestData getScreeningNRequestData() {
		return screeningNRequestData;
	}

	public void setScreeningNRequestData(ScreeningNRequestData screeningNRequestData) {
		this.screeningNRequestData = screeningNRequestData;
	}

	public Set<ScreeningAttachment> getAttachment() {
		return attachment;
	}

	public void setAttachment(Set<ScreeningAttachment> attachment) {
		this.attachment = attachment;
	}

	public Set<ScreeningMatchInfo> getScreeningNMatchInfo() {
		return screeningNMatchInfo;
	}

	public void setScreeningNMatchInfo(Set<ScreeningMatchInfo> screeningNMatchInfo) {
		this.screeningNMatchInfo = screeningNMatchInfo;
	}

	public Set<ScreeningNRequest> getListOfNaturalRequest() {
		return listOfNaturalRequest;
	}


	public void setListOfNaturalRequest(Set<ScreeningNRequest> listOfNaturalRequest) {
		this.listOfNaturalRequest = listOfNaturalRequest;
	}
	
	
}
