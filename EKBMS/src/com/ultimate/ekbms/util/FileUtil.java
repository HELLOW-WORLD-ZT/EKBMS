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
 * @date 2018��3��10�� ����12:23:01
 * @author Ф��
 *
 */

public class FileUtil {
	/**
	 * 
	 * @param file �ļ�
	 * @param directory �ϴ�Ŀ¼
	 * @param fileName	�ļ���
	 * @return �ϴ��ɹ� true /ʧ�� false
	 */
	public boolean uploadFile(File file,String directory,String fileName){
		try{
			//�����ϴ����ļ��õ�������
			InputStream is = new FileInputStream(file);  
			String targetDirectory = ServletActionContext.getServletContext().getRealPath(directory);
			byte buffer[]=new byte[1024];   
			//ָ���������ַ
			OutputStream os=new FileOutputStream(targetDirectory + "/" +fileName);  
			int count=0;
			while((count=is.read(buffer))>0){
				//���ļ�д��ָ��λ�õ��ļ���
				os.write(buffer,0,count);	
			}
			//�ر�
			os.close();	
			is.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
}
