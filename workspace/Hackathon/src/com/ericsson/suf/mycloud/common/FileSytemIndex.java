package com.ericsson.suf.mycloud.common;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FileSytemIndex {
	private List<MyCloudFile> myCloudFiles;

	public List<MyCloudFile> getMyCloudFiles() {
		return myCloudFiles;
	}

	public void setMyCloudFiles(List<MyCloudFile> myCloudFiles) {
		this.myCloudFiles = myCloudFiles;
	}
	
}
