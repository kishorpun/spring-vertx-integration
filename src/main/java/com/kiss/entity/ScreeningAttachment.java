package com.kiss.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "screening_attachment")

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScreeningAttachment implements Serializable {

	private static final long serialVersionUID = 1005053891872674233L;

	@Id
	@JsonProperty("id")
	@SequenceGenerator(name = "n_attachment_seq", sequenceName = "n_attachment_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "n_attachment_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "screeningn_id")
	@JsonIgnore
	private ScreeningNRequest screeningNRequest;

	@ManyToOne
	@JoinColumn(name = "screeningn_related_id")
	@JsonIgnore
	private ScreeningRelatedPersonRequest screeningNRelated;

	@JsonProperty("scanned_document_type")
	@Column(name = "scanned_document_type")
	private String scannedDocumentType;

	@JsonProperty("scanned_content")
	@Lob
	@Type(type = "text")
	@Column(name = "scanned_content")
	private String scannedContent;

	@JsonProperty("extension_text")
	@Column(name = "extension_text")
	private String extensionText;

	@JsonProperty("notes")
	@Column(name = "notes")
	String notes;

	@JsonProperty("action_id")
	@Column(name = "action_id")
	private String screeningActionId;

	@Override
	public String toString() {
		return "ScreeningNAttachment [id=" + id + ", scannedDocumentType=" + scannedDocumentType + ", scannedContent="
				+ scannedContent + ", extensionText=" + extensionText + ", notes=" + notes + ", screeningActionId="
				+ screeningActionId + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScannedDocumentType() {
		return scannedDocumentType;
	}

	public void setScannedDocumentType(String scannedDocumentType) {
		this.scannedDocumentType = scannedDocumentType;
	}

	public String getScannedContent() {
		return scannedContent;
	}

	public void setScannedContent(String scannedContent) {
		this.scannedContent = scannedContent;
	}

	public String getExtensionText() {
		return extensionText;
	}

	public void setExtensionText(String extensionText) {
		this.extensionText = extensionText;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getScreeningActionId() {
		return screeningActionId;
	}

	public void setScreeningActionId(String screeningActionId) {
		this.screeningActionId = screeningActionId;
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

}
