package com.ericsson.suf.mycloud.common;

import java.io.FileInputStream;
import java.io.InputStream;

public interface Facade {
	public void signup(String user, String password);

	public boolean login(String user, String password);

	public void addAccountSetup(String userId, String type, String emailID,
			String emailPassword) throws Exception;

	public MyCloudFile[] getFilesAtPath(String path);

	public void createFolder(String path, String folderName);

	public void deleteFile(int id);

	public InputStream downloadFile(int id);

	public void uploadFile(FileInputStream fis, MyCloudFile fileInfo);

}
