package com.ekbms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * 
 * @info  
 * @date 2018年3月4日 下午3:05:56
 * @author 肖鹏
 *
 */
public class BaseDAO {
	private SessionFactory sessionFactory;

	public Session getSession(){
		Session session = sessionFactory.openSession();
		return session;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
 