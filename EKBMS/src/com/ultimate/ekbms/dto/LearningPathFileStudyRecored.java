package com.ultimate.ekbms.dto;

/**
 * LearningPathFileStudyRecored entity. @author MyEclipse Persistence Tools
 */

public class LearningPathFileStudyRecored implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer learningPathId;
	private Integer fileId;
	private Integer userId;
	private Short isFinished;

	// Constructors

	/** default constructor */
	public LearningPathFileStudyRecored() {
	}

	/** full constructor */
	public LearningPathFileStudyRecored(Integer learningPathId, Integer fileId,
			Integer userId, Short isFinished) {
		this.learningPathId = learningPathId;
		this.fileId = fileId;
		this.userId = userId;
		this.isFinished = isFinished;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLearningPathId() {
		return this.learningPathId;
	}

	public void setLearningPathId(Integer learningPathId) {
		this.learningPathId = learningPathId;
	}

	public Integer getFileId() {
		return this.fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Short getIsFinished() {
		return this.isFinished;
	}

	public void setIsFinished(Short isFinished) {
		this.isFinished = isFinished;
	}

}