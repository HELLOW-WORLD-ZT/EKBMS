package com.ultimate.ekbms.idao;

import com.ultimate.ekbms.dto.UserBasicInfo;
/**
 * 
 * @info  
 * @date 2018��3��5�� ����8:07:37
 * @author Ф��
 *
 */
public interface UserBasicInfoDAO {
	/**
	 * ��¼��֤ 
	 * @param account
	 * @param password
	 * @return
	 */
	public UserBasicInfo login(String account,String password);
}
