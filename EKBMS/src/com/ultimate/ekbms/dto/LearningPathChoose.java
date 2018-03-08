package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * LearningPathChoose entity. @author MyEclipse Persistence Tools
 */

public class LearningPathChoose implements java.io.Serializable {

	// Fields

	private Integer id;
	private LearningPathInfo learningPathInfo;
	private UserDetailInfo userDetailInfo;
	private Timestamp chooseTime;

	// Constructors

	/** default constructor */
	public LearningPathChoose() {
	}

	/** full constructor */
	public LearningPathChoose(LearningPathInfo learningPathInfo,
			UserDetailInfo userDetailInfo, Timestamp chooseTime) {
		this.learningPathInfo = learningPathInfo;
		this.userDetailInfo = userDetailInfo;
		this.chooseTime = chooseTime;
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

	public Timestamp getChooseTime() {
		return this.chooseTime;
	}

	public void setChooseTime(Timestamp chooseTime) {
		this.chooseTime = chooseTime;
	}

}