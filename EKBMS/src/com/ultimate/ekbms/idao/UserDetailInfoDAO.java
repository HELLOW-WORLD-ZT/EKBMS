package com.ultimate.ekbms.idao;

import com.ultimate.ekbms.dto.UserDetailInfo;
/**
 * 
 * @info  
 * @date 2018年3月8日 下午5:41:48
 * @author 肖鹏
 *
 */
public interface UserDetailInfoDAO {
	/**
	 * 由ID获取用户详细信息
	 * @param id
	 * @return
	 */
	public UserDetailInfo getUserDetailInfoById(int id);
}
