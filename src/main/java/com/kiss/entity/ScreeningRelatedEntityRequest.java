package com.kiss.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "screening_related_entity_request")

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScreeningRelatedEntityRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@JsonProperty("id")
	@SequenceGenerator(name = "screening_related_entity_request_id_seq", sequenceName = "screening_related_entity_request_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screening_related_entity_request_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "nscreening_id")
	@JsonIgnore
	private ScreeningNRequest screeningNRequest;


	@OneToOne(mappedBy = "screeningRelatedEntityRequest", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("related_entity_request_data")
	private ScreeningRelatedEntityRequestData screeningRelatedEntityRequestData;

	@JsonProperty("related_entity_match_data")
	@OneToMany(mappedBy = "requestRelatedEntityRequestData", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningMatchInfo> matchInfo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ScreeningRelatedEntityRequestData getScreeningRelatedEntityRequestData() {
		return screeningRelatedEntityRequestData;
	}

	public void setScreeningRelatedEntityRequestData(
			ScreeningRelatedEntityRequestData screeningRelatedEntityRequestData) {
		this.screeningRelatedEntityRequestData = screeningRelatedEntityRequestData;
	}

	public Set<ScreeningMatchInfo> getMatchInfo() {
		return matchInfo;
	}

	public void setMatchInfo(Set<ScreeningMatchInfo> matchInfo) {
		this.matchInfo = matchInfo;
	}

	public ScreeningNRequest getScreeningNRequest() {
		return screeningNRequest;
	}

	public void setScreeningNRequest(ScreeningNRequest screeningNRequest) {
		this.screeningNRequest = screeningNRequest;
	}

	

}
