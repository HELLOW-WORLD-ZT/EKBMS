package com.ultimate.ekbms.idao;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ultimate.ekbms.dao.BaseDAO;
import com.ultimate.ekbms.dao.UserBasicDAO;
/**
 * 
 * @info  
 * @date 2018��3��4�� ����3:05:12
 * @author Ф��
 *
 */
public class UserBasicDAOImpl extends BaseDAO implements UserBasicDAO{

	@Override
	public boolean login(String account, String password){
		Session session = getSession();
		String hql="from UserBasic where account = ? and password = ?";
		Query query  = session.createQuery(hql);
		query.setString(0, account);
		query.setString(1, password);
		//System.out.println(query.list().size());
		if(query.list().size()>0){
			return true;
		}
		session.close();
		return false;
	}
}
