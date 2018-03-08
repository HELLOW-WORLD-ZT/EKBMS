package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * StructureRemark entity. @author MyEclipse Persistence Tools
 */

public class StructureRemark implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer struId;
	private Integer reviewerId;
	private String content;
	private Timestamp remarkTime;

	// Constructors

	/** default constructor */
	public StructureRemark() {
	}

	/** full constructor */
	public StructureRemark(Integer struId, Integer reviewerId, String content,
			Timestamp remarkTime) {
		this.struId = struId;
		this.reviewerId = reviewerId;
		this.content = content;
		this.remarkTime = remarkTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStruId() {
		return this.struId;
	}

	public void setStruId(Integer struId) {
		this.struId = struId;
	}

	public Integer getReviewerId() {
		return this.reviewerId;
	}

	public void setReviewerId(Integer reviewerId) {
		this.reviewerId = reviewerId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getRemarkTime() {
		return this.remarkTime;
	}

	public void setRemarkTime(Timestamp remarkTime) {
		this.remarkTime = remarkTime;
	}

}