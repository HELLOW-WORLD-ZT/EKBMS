package com.ultimate.ekbms.dto;

import java.sql.Timestamp;

/**
 * MessageRewardReply entity. @author MyEclipse Persistence Tools
 */

public class MessageRewardReply implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer rewardId;
	private Integer replyFileId;
	private Integer replyerId;
	private Timestamp replyTime;

	// Constructors

	/** default constructor */
	public MessageRewardReply() {
	}

	/** full constructor */
	public MessageRewardReply(Integer rewardId, Integer replyFileId,
			Integer replyerId, Timestamp replyTime) {
		this.rewardId = rewardId;
		this.replyFileId = replyFileId;
		this.replyerId = replyerId;
		this.replyTime = replyTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRewardId() {
		return this.rewardId;
	}

	public void setRewardId(Integer rewardId) {
		this.rewardId = rewardId;
	}

	public Integer getReplyFileId() {
		return this.replyFileId;
	}

	public void setReplyFileId(Integer replyFileId) {
		this.replyFileId = replyFileId;
	}

	public Integer getReplyerId() {
		return this.replyerId;
	}

	public void setReplyerId(Integer replyerId) {
		this.replyerId = replyerId;
	}

	public Timestamp getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Timestamp replyTime) {
		this.replyTime = replyTime;
	}

}