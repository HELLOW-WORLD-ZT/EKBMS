package com.ultimate.ekbms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 * 
 * @info  
 * @date 2018年3月5日 下午8:05:53
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
    public void closeSession(Session session){
    	if(session!=null){
    		session.close();
    	}
    }
}
