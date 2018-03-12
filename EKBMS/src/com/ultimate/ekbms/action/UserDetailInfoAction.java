package com.ultimate.ekbms.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ultimate.ekbms.dto.UserDetailInfo;
import com.ultimate.ekbms.idao.UserDetailInfoDAO;

public class UserDetailInfoAction extends ActionSupport{
	private UserDetailInfo userDetailInfo;
	private InputStream inputStream;
	private UserDetailInfoDAO dao;
	public String getUserDetailInfoById() throws Exception{
		Map<String,Object> session = ActionContext.getContext().getSession();
		int id = (int) session.get("UID");
		userDetailInfo = dao.getUserDetailInfoById(id);
		String str = "载入用户信息";  
		inputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
		return SUCCESS;
	}
	public UserDetailInfo getUserDetailInfo() {
		return userDetailInfo;
	}
	public void setUserDetailInfo(UserDetailInfo userDetailInfo) {
		this.userDetailInfo = userDetailInfo;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public UserDetailInfoDAO getDao() {
		return dao;
	}
	public void setDao(UserDetailInfoDAO dao) {
		this.dao = dao;
	}
	
}
