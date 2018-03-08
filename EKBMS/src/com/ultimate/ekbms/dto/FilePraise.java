package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * FilePraise entity. @author MyEclipse Persistence Tools
 */

public class FilePraise implements java.io.Serializable {

	// Fields

	private Integer id;
	private FileDetailInfo fileDetailInfo;
	private Integer userId;
	private Timestamp praiseTime;

	// Constructors

	/** default constructor */
	public FilePraise() {
	}

	/** full constructor */
	public FilePraise(FileDetailInfo fileDetailInfo, Integer userId,
			Timestamp praiseTime) {
		this.fileDetailInfo = fileDetailInfo;
		this.userId = userId;
		this.praiseTime = praiseTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public FileDetailInfo getFileDetailInfo() {
		return this.fileDetailInfo;
	}

	public void setFileDetailInfo(FileDetailInfo fileDetailInfo) {
		this.fileDetailInfo = fileDetailInfo;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Timestamp getPraiseTime() {
		return this.praiseTime;
	}

	public void setPraiseTime(Timestamp praiseTime) {
		this.praiseTime = praiseTime;
	}

}