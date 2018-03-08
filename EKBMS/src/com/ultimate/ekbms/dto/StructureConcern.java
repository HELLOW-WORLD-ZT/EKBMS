package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * StructureConcern entity. @author MyEclipse Persistence Tools
 */

public class StructureConcern implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer structureId;
	private Integer userId;
	private Timestamp concernTime;

	// Constructors

	/** default constructor */
	public StructureConcern() {
	}

	/** full constructor */
	public StructureConcern(Integer structureId, Integer userId,
			Timestamp concernTime) {
		this.structureId = structureId;
		this.userId = userId;
		this.concernTime = concernTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStructureId() {
		return this.structureId;
	}

	public void setStructureId(Integer structureId) {
		this.structureId = structureId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Timestamp getConcernTime() {
		return this.concernTime;
	}

	public void setConcernTime(Timestamp concernTime) {
		this.concernTime = concernTime;
	}

}