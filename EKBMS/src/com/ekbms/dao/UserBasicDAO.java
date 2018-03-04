package com.ekbms.dao;
/**
 * 
 * @info  
 * @date 2018年3月4日 下午3:05:29
 * @author 肖鹏
 *
 */
public interface UserBasicDAO {
	/**
	 * 登录功能
	 * @param account 工号
	 * @param password 密码
	 * @return
	 */
	public boolean login(String account,String password);
}	
