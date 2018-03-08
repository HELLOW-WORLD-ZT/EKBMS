package com.ultimate.ekbms.dto;

/**
 * StructureDetailInfo entity. @author MyEclipse Persistence Tools
 */

public class StructureDetailInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer paerntId;

	// Constructors

	/** default constructor */
	public StructureDetailInfo() {
	}

	/** full constructor */
	public StructureDetailInfo(String name, Integer paerntId) {
		this.name = name;
		this.paerntId = paerntId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPaerntId() {
		return this.paerntId;
	}

	public void setPaerntId(Integer paerntId) {
		this.paerntId = paerntId;
	}

}