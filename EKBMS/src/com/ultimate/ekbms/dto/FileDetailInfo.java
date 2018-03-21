package com.ultimate.ekbms.dto;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * FileDetailInfo entity. @author MyEclipse Persistence Tools
 */

public class FileDetailInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserDetailInfo userDetailInfo;
	private String name;
	private Integer clickRate;
	private Integer praiseNum;
	private String formate;
	private Integer classificationId;
	private String desc;
	private Double size;
	private Timestamp uploadTime;
	private String path;
	
	private Set fileRemarks = new HashSet(0);
	private Set fileBrowses = new HashSet(0);
	private Set fileDownloads = new HashSet(0);
	private Set filePraises = new HashSet(0);
	private Set fileCollections = new HashSet(0);
	private Set filePowerControls = new HashSet(0);
	private Set fileDeletes = new HashSet(0);
	private Set fileExamines = new HashSet(0);

	// Constructors

	/** default constructor */
	public FileDetailInfo() {
	}

	/** full constructor */
	public FileDetailInfo(UserDetailInfo userDetailInfo, String name,
			Integer clickRate, Integer praiseNum, String formate,
			Integer classificationId, String desc, Double size,
			Timestamp uploadTime, String path, Set fileRemarks,
			Set fileBrowses, Set fileDownloads, Set filePraises,
			Set fileCollections, Set filePowerControls, Set fileDeletes,
			Set fileExamines) {
		this.userDetailInfo = userDetailInfo;
		this.name = name;
		this.clickRate = clickRate;
		this.praiseNum = praiseNum;
		this.formate = formate;
		this.classificationId = classificationId;
		this.desc = desc;
		this.size = size;
		this.uploadTime = uploadTime;
		this.path = path;
		this.fileRemarks = fileRemarks;
		this.fileBrowses = fileBrowses;
		this.fileDownloads = fileDownloads;
		this.filePraises = filePraises;
		this.fileCollections = fileCollections;
		this.filePowerControls = filePowerControls;
		this.fileDeletes = fileDeletes;
		this.fileExamines = fileExamines;
	}

	// Property accessors

	

	public FileDetailInfo(String name2, String parserFile) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserDetailInfo getUserDetailInfo() {
		return this.userDetailInfo;
	}

	public void setUserDetailInfo(UserDetailInfo userDetailInfo) {
		this.userDetailInfo = userDetailInfo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getClickRate() {
		return this.clickRate;
	}

	public void setClickRate(Integer clickRate) {
		this.clickRate = clickRate;
	}

	public Integer getPraiseNum() {
		return this.praiseNum;
	}

	public void setPraiseNum(Integer praiseNum) {
		this.praiseNum = praiseNum;
	}

	public String getFormate() {
		return this.formate;
	}

	public void setFormate(String formate) {
		this.formate = formate;
	}

	public Integer getClassificationId() {
		return this.classificationId;
	}

	public void setClassificationId(Integer classificationId) {
		this.classificationId = classificationId;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getSize() {
		return this.size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Timestamp getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Timestamp uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set getFileRemarks() {
		return this.fileRemarks;
	}

	public void setFileRemarks(Set fileRemarks) {
		this.fileRemarks = fileRemarks;
	}

	public Set getFileBrowses() {
		return this.fileBrowses;
	}

	public void setFileBrowses(Set fileBrowses) {
		this.fileBrowses = fileBrowses;
	}

	public Set getFileDownloads() {
		return this.fileDownloads;
	}

	public void setFileDownloads(Set fileDownloads) {
		this.fileDownloads = fileDownloads;
	}

	public Set getFilePraises() {
		return this.filePraises;
	}

	public void setFilePraises(Set filePraises) {
		this.filePraises = filePraises;
	}

	public Set getFileCollections() {
		return this.fileCollections;
	}

	public void setFileCollections(Set fileCollections) {
		this.fileCollections = fileCollections;
	}

	public Set getFilePowerControls() {
		return this.filePowerControls;
	}

	public void setFilePowerControls(Set filePowerControls) {
		this.filePowerControls = filePowerControls;
	}

	public Set getFileDeletes() {
		return this.fileDeletes;
	}

	public void setFileDeletes(Set fileDeletes) {
		this.fileDeletes = fileDeletes;
	}

	public Set getFileExamines() {
		return this.fileExamines;
	}

	public void setFileExamines(Set fileExamines) {
		this.fileExamines = fileExamines;
	}

}