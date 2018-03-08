package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * LearningPathDelete entity. @author MyEclipse Persistence Tools
 */

public class LearningPathDelete implements java.io.Serializable {

	// Fields

	private Integer id;
	private LearningPathInfo learningPathInfo;
	private UserDetailInfo userDetailInfo;
	private Timestamp deleteTime;

	// Constructors

	/** default constructor */
	public LearningPathDelete() {
	}

	/** full constructor */
	public LearningPathDelete(LearningPathInfo learningPathInfo,
			UserDetailInfo userDetailInfo, Timestamp deleteTime) {
		this.learningPathInfo = learningPathInfo;
		this.userDetailInfo = userDetailInfo;
		this.deleteTime = deleteTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LearningPathInfo getLearningPathInfo() {
		return this.learningPathInfo;
	}

	public void setLearningPathInfo(LearningPathInfo learningPathInfo) {
		this.learningPathInfo = learningPathInfo;
	}

	public UserDetailInfo getUserDetailInfo() {
		return this.userDetailInfo;
	}

	public void setUserDetailInfo(UserDetailInfo userDetailInfo) {
		this.userDetailInfo = userDetailInfo;
	}

	public Timestamp getDeleteTime() {
		return this.deleteTime;
	}

	public void setDeleteTime(Timestamp deleteTime) {
		this.deleteTime = deleteTime;
	}

}