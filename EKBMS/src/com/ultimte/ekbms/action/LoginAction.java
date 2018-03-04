package com.ultimte.ekbms.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ultimate.ekbms.dao.UserBasicDAO;

/**
 * 
 * @info  
 * @date 2018年3月4日 下午3:05:51
 * @author 肖鹏
 *
 */
public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String account;
	private String password;
	private UserBasicDAO userDao;
	
	@Override
	public String execute() throws Exception {
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
