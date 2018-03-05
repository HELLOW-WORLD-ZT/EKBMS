package com.ultimate.ekbms.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ultimate.ekbms.dto.UserBasicInfo;
import com.ultimate.ekbms.idao.UserBasicInfoDAO;

public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String account;
	private String password;
	private UserBasicInfoDAO dao;
	public String execute() throws Exception{
		UserBasicInfo user = dao.login(account, password);
		if(user!=null){
			Map<String,Object> session = ActionContext.getContext().getSession();
			session.put("UID",user.getId());
			System.out.println("µÇÂ¼³É¹¦");
			return SUCCESS;
		}
		return ERROR;
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
	public UserBasicInfoDAO getDao() {
		return dao;
	}
	public void setDao(UserBasicInfoDAO dao) {
		this.dao = dao;
	}
}
