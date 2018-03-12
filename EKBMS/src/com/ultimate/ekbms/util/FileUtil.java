package com.ultimate.ekbms.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;
/**
 * 
 * @info  
 * @date 2018年3月10日 下午12:23:01
 * @author 肖鹏
 *
 */

public class FileUtil {
	/**
	 * 
	 * @param file 文件
	 * @param directory 上传目录
	 * @param fileName	文件名
	 * @return 上传成功 true /失败 false
	 */
	public boolean uploadFile(File file,String directory,String fileName){
		try{
			//根据上传的文件得到输入流
			InputStream is = new FileInputStream(file);  
			String targetDirectory = ServletActionContext.getServletContext().getRealPath(directory);
			byte buffer[]=new byte[1024];   
			//指定输出流地址
			OutputStream os=new FileOutputStream(targetDirectory + "/" +fileName);  
			int count=0;
			while((count=is.read(buffer))>0){
				//把文件写到指定位置的文件中
				os.write(buffer,0,count);	
			}
			//关闭
			os.close();	
			is.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
}
