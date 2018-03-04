package com.ekbms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * 
 * @info  
 * @date 2018��3��4�� ����3:05:56
 * @author Ф��
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
 