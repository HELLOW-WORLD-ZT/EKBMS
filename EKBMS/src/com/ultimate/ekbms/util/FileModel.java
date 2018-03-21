package com.ultimate.ekbms.util;

/**
 * 
 * @info  
 * @date 2018年3月20日 下午19:23:01
 * @author 曾祥
 *
 */

public class FileModel {
	/**
	 * 
	 * @param file 文件
	 */
	
	private String title;   // 文件标题
	private String content;  // 文件内容
	private String path;     //文件路径
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
