package com.ultimate.ekbms.dto;

/**
 * UserStorageDirectory entity. @author MyEclipse Persistence Tools
 */

public class UserStorageDirectory implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserDetailInfo userDetailInfo;
	private String directoryName;

	// Constructors

	/** default constructor */
	public UserStorageDirectory() {
	}

	/** full constructor */
	public UserStorageDirectory(UserDetailInfo userDetailInfo,
			String directoryName) {
		this.userDetailInfo = userDetailInfo;
		this.directoryName = directoryName;
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

	public String getDirectoryName() {
		return this.directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}

}