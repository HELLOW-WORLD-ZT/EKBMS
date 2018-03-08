package com.ultimate.ekbms.dto;

/**
 * FilePowerControl entity. @author MyEclipse Persistence Tools
 */

public class FilePowerControl implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserDetailInfo userDetailInfo;
	private FileDetailInfo fileDetailInfo;
	private String levelStatus;

	// Constructors

	/** default constructor */
	public FilePowerControl() {
	}

	/** full constructor */
	public FilePowerControl(UserDetailInfo userDetailInfo,
			FileDetailInfo fileDetailInfo, String levelStatus) {
		this.userDetailInfo = userDetailInfo;
		this.fileDetailInfo = fileDetailInfo;
		this.levelStatus = levelStatus;
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

	public String getLevelStatus() {
		return this.levelStatus;
	}

	public void setLevelStatus(String levelStatus) {
		this.levelStatus = levelStatus;
	}

}