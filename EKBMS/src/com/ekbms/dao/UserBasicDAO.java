package com.ekbms.dao;
/**
 * 
 * @info  
 * @date 2018��3��4�� ����3:05:29
 * @author Ф��
 *
 */
public interface UserBasicDAO {
	/**
	 * ��¼����
	 * @param account ����
	 * @param password ����
	 * @return
	 */
	public boolean login(String account,String password);
}	
