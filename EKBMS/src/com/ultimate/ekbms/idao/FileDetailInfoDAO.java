package com.ultimate.ekbms.idao;

/**
 * 
 * @info  
 * @date 2018年3月18日 下午10:26:37
 * @author 曾祥
 *
 */
public interface FileDetailInfoDAO {
	/**
	 * 添加文件 
	 * @param name
	 * @param path
	 * @return
	 */
	public int addFileByIndex(String name,String path);
}
