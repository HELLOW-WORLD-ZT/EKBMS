package com.ultimate.ekbms.idao;

import com.ultimate.ekbms.dto.UserDetailInfo;
/**
 * 
 * @info  
 * @date 2018��3��8�� ����5:41:48
 * @author Ф��
 *
 */
public interface UserDetailInfoDAO {
	/**
	 * ��ID��ȡ�û���ϸ��Ϣ
	 * @param id
	 * @return
	 */
	public UserDetailInfo getUserDetailInfoById(int id);
}
