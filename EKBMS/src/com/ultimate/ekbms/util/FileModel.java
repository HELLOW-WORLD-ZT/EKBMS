package com.ultimate.ekbms.util;

/**
 * 
 * @info  
 * @date 2018��3��20�� ����19:23:01
 * @author ����
 *
 */

public class FileModel {
	/**
	 * 
	 * @param file �ļ�
	 */
	
	private String title;   // �ļ�����
	private String content;  // �ļ�����
	private String path;     //�ļ�·��
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public FileModel() {
	}
	public FileModel(String title, String content,String path) {
		this.title = title;
		this.content = content;
		this.path = path;
	}
	public FileModel(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
}
