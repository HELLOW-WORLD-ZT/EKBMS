package com.ultimate.ekbms.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * LearningPathInfo entity. @author MyEclipse Persistence Tools
 */

public class LearningPathInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String content;
	private Timestamp createTime;
	private String desc;
	private String image;
	private Set learningPathChooses = new HashSet(0);
	private Set learningPathDeletes = new HashSet(0);

	// Constructors

	/** default constructor */
	public LearningPathInfo() {
	}

	/** full constructor */
	public LearningPathInfo(String name, String content, Timestamp createTime,
			String desc, String image, Set learningPathChooses,
			Set learningPathDeletes) {
		this.name = name;
		this.content = content;
		this.createTime = createTime;
		this.desc = desc;
		this.image = image;
		this.learningPathChooses = learningPathChooses;
		this.learningPathDeletes = learningPathDeletes;
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set getLearningPathChooses() {
		return this.learningPathChooses;
	}

	public void setLearningPathChooses(Set learningPathChooses) {
		this.learningPathChooses = learningPathChooses;
	}

	public Set getLearningPathDeletes() {
		return this.learningPathDeletes;
	}

	public void setLearningPathDeletes(Set learningPathDeletes) {
		this.learningPathDeletes = learningPathDeletes;
	}

}