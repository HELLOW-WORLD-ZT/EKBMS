package com.ultimate.ekbms.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer managerId;
	private Set userDetailInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String name, Integer managerId, Set userDetailInfos) {
		this.name = name;
		this.managerId = managerId;
		this.userDetailInfos = userDetailInfos;
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

	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Set getUserDetailInfos() {
		return this.userDetailInfos;
	}

	public void setUserDetailInfos(Set userDetailInfos) {
		this.userDetailInfos = userDetailInfos;
	}

}