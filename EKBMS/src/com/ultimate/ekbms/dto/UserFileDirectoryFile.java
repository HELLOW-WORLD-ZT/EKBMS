package com.ultimate.ekbms.dto;

/**
 * UserFileDirectoryFile entity. @author MyEclipse Persistence Tools
 */

public class UserFileDirectoryFile implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer directoryId;
	private Integer fileId;

	// Constructors

	/** default constructor */
	public UserFileDirectoryFile() {
	}

	/** full constructor */
	public UserFileDirectoryFile(Integer directoryId, Integer fileId) {
		this.directoryId = directoryId;
		this.fileId = fileId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(Integer directoryId) {
		this.directoryId = directoryId;
	}

	public Integer getFileId() {
		return this.fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

}