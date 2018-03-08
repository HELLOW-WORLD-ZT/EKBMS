package com.ultimate.ekbms.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ultimate.ekbms.dto.UserDetailInfo;
import com.ultimate.ekbms.idao.UserDetailInfoDAO;

public class UserDetailInfoDAOImpl extends BaseDAO implements UserDetailInfoDAO{

	@Override
	public UserDetailInfo getUserDetailInfoById(int id) {
		Session session = null;
		UserDetailInfo user = null;
		try{
			session = getSession();
			String hql = "from UserDetailInfo where id=?";
			Query query = session.createQuery(hql);
			query.setInteger(0, id);
			query.setMaxResults(1);
			user = (UserDetailInfo)query.uniqueResult();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeSession(session);
		}
		
		return null;
	}

}
