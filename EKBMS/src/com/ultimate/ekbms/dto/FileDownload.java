package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * FileDownload entity. @author MyEclipse Persistence Tools
 */

public class FileDownload implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserDetailInfo userDetailInfo;
	private FileDetailInfo fileDetailInfo;
	private Timestamp downloadTime;

	// Constructors

	/** default constructor */
	public FileDownload() {
	}

	/** full constructor */
	public FileDownload(UserDetailInfo userDetailInfo,
			FileDetailInfo fileDetailInfo, Timestamp downloadTime) {
		this.userDetailInfo = userDetailInfo;
		this.fileDetailInfo = fileDetailInfo;
		this.downloadTime = downloadTime;
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

	public Timestamp getDownloadTime() {
		return this.downloadTime;
	}

	public void setDownloadTime(Timestamp downloadTime) {
		this.downloadTime = downloadTime;
	}

}