package com.ultimate.ekbms.dto;

/**
 * Classification entity. @author MyEclipse Persistence Tools
 */

public class Classification implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer pid;
	private String name;

	// Constructors

	/** default constructor */
	public Classification() {
	}

	/** full constructor */
	public Classification(Integer pid, String name) {
		this.pid = pid;
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}