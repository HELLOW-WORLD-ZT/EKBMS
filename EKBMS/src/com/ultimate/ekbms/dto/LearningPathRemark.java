package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * LearningPathRemark entity. @author MyEclipse Persistence Tools
 */

public class LearningPathRemark implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private Integer learningPathId;
	private String content;
	private Timestamp remarkTime;

	// Constructors

	/** default constructor */
	public LearningPathRemark() {
	}

	/** full constructor */
	public LearningPathRemark(Integer userId, Integer learningPathId,
			String content, Timestamp remarkTime) {
		this.userId = userId;
		this.learningPathId = learningPathId;
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

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getLearningPathId() {
		return this.learningPathId;
	}

	public void setLearningPathId(Integer learningPathId) {
		this.learningPathId = learningPathId;
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