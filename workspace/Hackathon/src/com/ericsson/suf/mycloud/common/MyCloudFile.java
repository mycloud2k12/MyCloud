package com.ericsson.suf.mycloud.common;

public class MyCloudFile {
	private int id;
	private String name;
	private String size;
	private String path;
	private String uploadTimeAndDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getUploadTimeAndDate() {
		return uploadTimeAndDate;
	}
	public void setUploadTimeAndDate(String uploadTimeAndDate) {
		this.uploadTimeAndDate = uploadTimeAndDate;
	}
	
}
