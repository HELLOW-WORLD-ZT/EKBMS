package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * FileBrowse entity. @author MyEclipse Persistence Tools
 */

public class FileBrowse implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserDetailInfo userDetailInfo;
	private FileDetailInfo fileDetailInfo;
	private Timestamp browseTime;

	// Constructors

	/** default constructor */
	public FileBrowse() {
	}

	/** minimal constructor */
	public FileBrowse(UserDetailInfo userDetailInfo,
			FileDetailInfo fileDetailInfo) {
		this.userDetailInfo = userDetailInfo;
		this.fileDetailInfo = fileDetailInfo;
	}

	/** full constructor */
	public FileBrowse(UserDetailInfo userDetailInfo,
			FileDetailInfo fileDetailInfo, Timestamp browseTime) {
		this.userDetailInfo = userDetailInfo;
		this.fileDetailInfo = fileDetailInfo;
		this.browseTime = browseTime;
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

	public Timestamp getBrowseTime() {
		return this.browseTime;
	}

	public void setBrowseTime(Timestamp browseTime) {
		this.browseTime = browseTime;
	}

}