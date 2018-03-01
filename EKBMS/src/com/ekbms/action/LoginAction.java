package com.ekbms.action;

import com.ekbms.dao.UserBasicDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String account;
	private String password;
	private UserBasicDAO userDao;
	
	public String execute() throws Exception {
		//System.out.println(account + ":" + password);
		if(userDao.login(account, password)){
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserBasicDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserBasicDAO userDao) {
		this.userDao = userDao;
	}

}
