package com.ultimate.ekbms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ultimate.ekbms.dto.FileDetailInfo;
import com.ultimate.ekbms.idao.FileDetailInfoDAO;
/**
 * 
 * @info  
 * @date 2018年3月18日 下午8:29:58
 * @author 曾祥
 *
 */
public class FileDetailInfoDAOImpl extends BaseDAO implements FileDetailInfoDAO {
	private SessionFactory sessionFactory;
	@Override
	
	public int addFileByIndex(String name, String path) {
		// TODO Auto-generated method stub
		Session session = null;
		FileDetailInfo file = null;
		int id = 0;
		try{
			session = sessionFactory.openSession();
			Transaction t1=session.beginTransaction();
			file=new FileDetailInfo();
			file.setName(name);
			file.setPath(path);
			session.save(file);
			id=file.getId();
			t1.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(session!=null){
	    		session.close();
	    	}
		}
		return id;
	}

}
