package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * StructurePraise entity. @author MyEclipse Persistence Tools
 */

public class StructurePraise implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer struId;
	private Integer praiseId;
	private Timestamp priaseTime;

	// Constructors

	/** default constructor */
	public StructurePraise() {
	}

	/** full constructor */
	public StructurePraise(Integer struId, Integer praiseId,
			Timestamp priaseTime) {
		this.struId = struId;
		this.praiseId = praiseId;
		this.priaseTime = priaseTime;
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

	public Integer getPraiseId() {
		return this.praiseId;
	}

	public void setPraiseId(Integer praiseId) {
		this.praiseId = praiseId;
	}

	public Timestamp getPriaseTime() {
		return this.priaseTime;
	}

	public void setPriaseTime(Timestamp priaseTime) {
		this.priaseTime = priaseTime;
	}

}