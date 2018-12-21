package com.kiss.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

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

//class for table screening_action 

@Entity
@Table(name = "screening_action")

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScreeningAction implements Serializable{

	
	private static final long serialVersionUID = -614266981554488026L;

	@Id
	@JsonProperty("id")
	@SequenceGenerator(name = "screening_n_action_id_seq", sequenceName = "screening_n_action_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screening_n_action_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "screeningn_id")
	@JsonIgnore
	private ScreeningNRequest screeningNRequest;
	
	
	
	@JsonProperty("purpose_of_screening")
	@Column(name = "purpose_of_screening")
	private String purposeOfScreening;

	@JsonProperty("reason")
	@Column(name = "reason")
	private String reason;

	@JsonProperty("action_type")
	@Column(name = "action_type")
	private String action;

	@JsonProperty("reply_date")
	@Column(name = "reply_date")
	private Date action_date;

	public ScreeningNRequest getScreeningNRequest() {
		return screeningNRequest;
	}


	@JsonProperty("reply_time")
	@Column(name = "reply_time")
	private Time action_time;

	@JsonProperty("replied")
	@Column(name = "replied")
	private boolean replied;

	@JsonProperty("checker")
	@Column(name = "checker")
	private String checker;

	@Override
	public String toString() {
		return "ScreeningAction [id=" + id + ", purposeOfScreening=" + purposeOfScreening + ", reason=" + reason
				+ ", action=" + action + ", action_date=" + action_date + ", action_time=" + action_time + ", replied="
				+ replied + ", checker=" + checker + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPurposeOfScreening() {
		return purposeOfScreening;
	}

	public void setPurposeOfScreening(String purposeOfScreening) {
		this.purposeOfScreening = purposeOfScreening;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getAction_date() {
		return action_date;
	}

	public void setAction_date(Date action_date) {
		this.action_date = action_date;
	}

	public Time getAction_time() {
		return action_time;
	}

	public void setAction_time(Time action_time) {
		this.action_time = action_time;
	}

	public boolean isReplied() {
		return replied;
	}

	public void setReplied(boolean replied) {
		this.replied = replied;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}
	
	


}