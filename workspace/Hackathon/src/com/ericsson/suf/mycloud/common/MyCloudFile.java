package com.ericsson.suf.mycloud.common;


public class MyCloudFile {
	private String id;
	private String name;
	private long size;
	private String path;
	private String uploadTimeAndDate;
	private boolean isFolder;
	private String locationID;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
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
	public boolean isFolder() {
		return isFolder;
	}
	public void setFolder(boolean isFolder) {
		this.isFolder = isFolder;
	}
	public String getLocation() {
		return locationID;
	}
	public void setLocation(String location) {
		this.locationID = location;
	}
}
