package com.kiss.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "screening_n_request")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScreeningNRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@JsonProperty("id")
	@SequenceGenerator(name = "screening_n_id_seq", sequenceName = "screening_n_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screening_n_id_seq")
	private Long id;
	
	@JsonProperty("screening_n_request_data")
	@OneToOne(mappedBy= "screeningNRequest", fetch= FetchType.EAGER, cascade= CascadeType.ALL)
	private ScreeningNRequestData screeningNRequestData;

	@JsonProperty("screening_n_related_person")
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "natural_related", joinColumns = @JoinColumn(name = "natural_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "related_id", referencedColumnName = "id"))
	private Set<ScreeningRelatedPersonRequest> listOfRelated = new HashSet<>();

	@JsonProperty("screening_n_attachment")
	@OneToMany(mappedBy = "screeningNRequest", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningAttachment> attachment = new HashSet<>();

	@JsonProperty("screening_match_info")
	@OneToMany(mappedBy = "screeningNRequest", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningMatchInfo> screeningNMatchInfo = new HashSet<>();

	@JsonProperty("screening_n_related_entity")
	@OneToMany(mappedBy = "screeningNRequest", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningRelatedEntityRequest> relatedEntityRequest = new HashSet<>();

	@JsonProperty("screening_n_action")
	@OneToMany(mappedBy = "screeningNRequest", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningAction> screeningNAction = new HashSet<>();

	@Column(name = "is_updated")
	@JsonProperty("is_updated")
	private boolean isUpdated;

	@Column(name = "maker")
	private String maker;

	@Column(name = "checker")
	private String checker;

	@Column(name = "approved")
	private boolean approved;
	
	@Column(name="replied")
	private boolean replied;
	
	@Column(name="action")
	private boolean action;

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

	public Set<ScreeningRelatedPersonRequest> getListOfRelated() {
		return listOfRelated;
	}

	public void setListOfRelated(Set<ScreeningRelatedPersonRequest> listOfRelated) {
		this.listOfRelated = listOfRelated;
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

	public Set<ScreeningRelatedEntityRequest> getRelatedEntityRequest() {
		return relatedEntityRequest;
	}

	public void setRelatedEntityRequest(Set<ScreeningRelatedEntityRequest> relatedEntityRequest) {
		this.relatedEntityRequest = relatedEntityRequest;
	}

	public Set<ScreeningAction> getScreeningNAction() {
		return screeningNAction;
	}

	public void setScreeningNAction(Set<ScreeningAction> screeningNAction) {
		this.screeningNAction = screeningNAction;
	}

	public boolean isUpdated() {
		return isUpdated;
	}

	public void setUpdated(boolean isUpdated) {
		this.isUpdated = isUpdated;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public boolean isReplied() {
		return replied;
	}

	public void setReplied(boolean replied) {
		this.replied = replied;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}
	
	
}