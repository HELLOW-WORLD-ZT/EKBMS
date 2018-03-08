package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * FileRemark entity. @author MyEclipse Persistence Tools
 */

public class FileRemark implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserDetailInfo userDetailInfo;
	private FileDetailInfo fileDetailInfo;
	private String content;
	private Timestamp remarkTime;

	// Constructors

	/** default constructor */
	public FileRemark() {
	}

	/** minimal constructor */
	public FileRemark(UserDetailInfo userDetailInfo,
			FileDetailInfo fileDetailInfo) {
		this.userDetailInfo = userDetailInfo;
		this.fileDetailInfo = fileDetailInfo;
	}

	/** full constructor */
	public FileRemark(UserDetailInfo userDetailInfo,
			FileDetailInfo fileDetailInfo, String content, Timestamp remarkTime) {
		this.userDetailInfo = userDetailInfo;
		this.fileDetailInfo = fileDetailInfo;
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

	public UserDetailInfo getUserDetailInfo() {
		return this.userDetailInfo;
	}

	public void setUserDetailInfo(UserDetailInfo userDetailInfo) {
		this.userDetailInfo = userDetailInfo;
	}

	public FileDetailInfo getFileDetailInfo() {
		return this.fileDetailInfo;
	}

	public void setFileDetailInfo(FileDetailInfo fileDetailInfo) {
		this.fileDetailInfo = fileDetailInfo;
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