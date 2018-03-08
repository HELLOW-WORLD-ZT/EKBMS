package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * LearningPathPraise entity. @author MyEclipse Persistence Tools
 */

public class LearningPathPraise implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer learningpathId;
	private Integer praiseId;
	private Timestamp priaseTime;

	// Constructors

	/** default constructor */
	public LearningPathPraise() {
	}

	/** full constructor */
	public LearningPathPraise(Integer learningpathId, Integer praiseId,
			Timestamp priaseTime) {
		this.learningpathId = learningpathId;
		this.praiseId = praiseId;
		this.priaseTime = priaseTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLearningpathId() {
		return this.learningpathId;
	}

	public void setLearningpathId(Integer learningpathId) {
		this.learningpathId = learningpathId;
	}

	public Integer getPraiseId() {
		return this.praiseId;
	}

	public void setPraiseId(Integer praiseId) {
		this.praiseId = praiseId;
	}

	public Timestamp getPriaseTime() {
		return this.priaseTime;
	}

	public void setPriaseTime(Timestamp priaseTime) {
		this.priaseTime = priaseTime;
	}

}