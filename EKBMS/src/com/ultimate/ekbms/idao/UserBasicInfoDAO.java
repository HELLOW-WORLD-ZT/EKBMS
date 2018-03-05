package com.ultimate.ekbms.idao;

import com.ultimate.ekbms.dto.UserBasicInfo;
/**
 * 
 * @info  
 * @date 2018年3月5日 下午8:07:37
 * @author 肖鹏
 *
 */
public interface UserBasicInfoDAO {
	/**
	 * 登录验证 
	 * @param account
	 * @param password
	 * @return
	 */
	public UserBasicInfo login(String account,String password);
}
