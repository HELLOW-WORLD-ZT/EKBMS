package com.ultimate.ekbms.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ultimate.ekbms.dto.UserBasicInfo;
import com.ultimate.ekbms.idao.UserBasicInfoDAO;
/**
 * 
 * @info  
 * @date 2018年3月5日 下午8:29:58
 * @author 肖鹏
 *
 */
public class UserBasicInfoDAOImpl extends BaseDAO implements UserBasicInfoDAO{

	@Override
	public UserBasicInfo login(String account, String password) {
		Session session = null;
		UserBasicInfo user = null;
		try{
			session = getSession();
			String hql="from UserBasicInfo where account=? and password=?";
			Query query = session.createQuery(hql);
			query.setString(0, account);
			query.setString(1, password);
			query.setMaxResults(1);
			user= (UserBasicInfo)query.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeSession(session);
		}
		return user;
	}

}
