package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * FileCollection entity. @author MyEclipse Persistence Tools
 */

public class FileCollection implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserDetailInfo userDetailInfo;
	private FileDetailInfo fileDetailInfo;
	private Timestamp collectionTime;

	// Constructors

	/** default constructor */
	public FileCollection() {
	}

	/** full constructor */
	public FileCollection(UserDetailInfo userDetailInfo,
			FileDetailInfo fileDetailInfo, Timestamp collectionTime) {
		this.userDetailInfo = userDetailInfo;
		this.fileDetailInfo = fileDetailInfo;
		this.collectionTime = collectionTime;
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

	public Timestamp getCollectionTime() {
		return this.collectionTime;
	}

	public void setCollectionTime(Timestamp collectionTime) {
		this.collectionTime = collectionTime;
	}

}