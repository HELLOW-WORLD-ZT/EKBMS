package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * MessageRewardInfo entity. @author MyEclipse Persistence Tools
 */

public class MessageRewardInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer questFileId;
	private Integer questerId;
	private Timestamp questTime;

	// Constructors

	/** default constructor */
	public MessageRewardInfo() {
	}

	/** full constructor */
	public MessageRewardInfo(Integer questFileId, Integer questerId,
			Timestamp questTime) {
		this.questFileId = questFileId;
		this.questerId = questerId;
		this.questTime = questTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuestFileId() {
		return this.questFileId;
	}

	public void setQuestFileId(Integer questFileId) {
		this.questFileId = questFileId;
	}

	public Integer getQuesterId() {
		return this.questerId;
	}

	public void setQuesterId(Integer questerId) {
		this.questerId = questerId;
	}

	public Timestamp getQuestTime() {
		return this.questTime;
	}

	public void setQuestTime(Timestamp questTime) {
		this.questTime = questTime;
	}

}