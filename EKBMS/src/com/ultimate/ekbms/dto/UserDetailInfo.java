package com.ultimate.ekbms.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UserDetailInfo entity. @author MyEclipse Persistence Tools
 */

public class UserDetailInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Department department;
	private String jobNumber;
	private String realName;
	private String sex;
	private Date birthDate;
	private String email;
	private String position;
	private Double integral;
	private String headThumb;
	private Set fileDetailInfos = new HashSet(0);
	private Set fileCollections = new HashSet(0);
	private Set fileBrowses = new HashSet(0);
	private Set filePowerControls = new HashSet(0);
	private Set learningPathChooses = new HashSet(0);
	private Set userStorageDirectories = new HashSet(0);
	private Set fileDeletes = new HashSet(0);
	private Set fileExamines = new HashSet(0);
	private Set learningPathDeletes = new HashSet(0);
	private Set fileDownloads = new HashSet(0);
	private Set fileRemarks = new HashSet(0);
	private UserBasicInfo  userBasicInfo;
	// Constructors

	/** default constructor */
	public UserDetailInfo() {
	}

	/** full constructor */
	public UserDetailInfo(Department department, String jobNumber,
			String realName, String sex, Date birthDate, String email,
			String position, Double integral, String headThumb,
			Set fileDetailInfos, Set fileCollections, Set fileBrowses,
			Set filePowerControls, Set learningPathChooses,
			Set userStorageDirectories, Set fileDeletes, Set fileExamines,
			Set learningPathDeletes, Set fileDownloads, Set fileRemarks) {
		this.department = department;
		this.jobNumber = jobNumber;
		this.realName = realName;
		this.sex = sex;
		this.birthDate = birthDate;
		this.email = email;
		this.position = position;
		this.integral = integral;
		this.headThumb = headThumb;
		this.fileDetailInfos = fileDetailInfos;
		this.fileCollections = fileCollections;
		this.fileBrowses = fileBrowses;
		this.filePowerControls = filePowerControls;
		this.learningPathChooses = learningPathChooses;
		this.userStorageDirectories = userStorageDirectories;
		this.fileDeletes = fileDeletes;
		this.fileExamines = fileExamines;
		this.learningPathDeletes = learningPathDeletes;
		this.fileDownloads = fileDownloads;
		this.fileRemarks = fileRemarks;
	}

	// Property accessors
    
	public Integer getId() {
		return this.id;
	}

	public UserBasicInfo getUserBasicInfo() {
		return userBasicInfo;
	}

	public void setUserBasicInfo(UserBasicInfo userBasicInfo) {
		this.userBasicInfo = userBasicInfo;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getJobNumber() {
		return this.jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Double getIntegral() {
		return this.integral;
	}

	public void setIntegral(Double integral) {
		this.integral = integral;
	}

	public String getHeadThumb() {
		return this.headThumb;
	}

	public void setHeadThumb(String headThumb) {
		this.headThumb = headThumb;
	}

	public Set getFileDetailInfos() {
		return this.fileDetailInfos;
	}

	public void setFileDetailInfos(Set fileDetailInfos) {
		this.fileDetailInfos = fileDetailInfos;
	}

	public Set getFileCollections() {
		return this.fileCollections;
	}

	public void setFileCollections(Set fileCollections) {
		this.fileCollections = fileCollections;
	}

	public Set getFileBrowses() {
		return this.fileBrowses;
	}

	public void setFileBrowses(Set fileBrowses) {
		this.fileBrowses = fileBrowses;
	}

	public Set getFilePowerControls() {
		return this.filePowerControls;
	}

	public void setFilePowerControls(Set filePowerControls) {
		this.filePowerControls = filePowerControls;
	}

	public Set getLearningPathChooses() {
		return this.learningPathChooses;
	}

	public void setLearningPathChooses(Set learningPathChooses) {
		this.learningPathChooses = learningPathChooses;
	}

	public Set getUserStorageDirectories() {
		return this.userStorageDirectories;
	}

	public void setUserStorageDirectories(Set userStorageDirectories) {
		this.userStorageDirectories = userStorageDirectories;
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

	public Set getLearningPathDeletes() {
		return this.learningPathDeletes;
	}

	public void setLearningPathDeletes(Set learningPathDeletes) {
		this.learningPathDeletes = learningPathDeletes;
	}

	public Set getFileDownloads() {
		return this.fileDownloads;
	}
     
	public void setFileDownloads(Set fileDownloads) {
		this.fileDownloads = fileDownloads;
	}

	public Set getFileRemarks() {
		return this.fileRemarks;
	}

	public void setFileRemarks(Set fileRemarks) {
		this.fileRemarks = fileRemarks;
	}

	
	
}