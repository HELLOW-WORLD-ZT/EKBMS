package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * StructureDelete entity. @author MyEclipse Persistence Tools
 */

public class StructureDelete implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer struId;
	private Integer userId;
	private Timestamp deleteTime;

	// Constructors

	/** default constructor */
	public StructureDelete() {
	}

	/** full constructor */
	public StructureDelete(Integer struId, Integer userId, Timestamp deleteTime) {
		this.struId = struId;
		this.userId = userId;
		this.deleteTime = deleteTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStruId() {
		return this.struId;
	}

	public void setStruId(Integer struId) {
		this.struId = struId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Timestamp getDeleteTime() {
		return this.deleteTime;
	}

	public void setDeleteTime(Timestamp deleteTime) {
		this.deleteTime = deleteTime;
	}

}