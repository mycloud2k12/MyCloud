package com.ericsson.suf.mycloud.common;

import java.io.InputStream;

public class FacadeImpl implements Facade {

	@Override
	public void signup(String user, String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean login(String user, String password) {
		if (user.equals("guest") && password.equals("guest")) {
			return true;
		}
		return false;
	}

	@Override
	public void addAccountSetup(String userId, String type, String emailID,
			String emailPassword) throws Exception {
		
		if(type.equals("JAMES")) {
			
		} 
		else {
			throw new Exception("Provider '" + type + "' not supported");
		}

	}

	@Override
	public MyCloudFile[] getFilesAtPath(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createFolder(String path, String folderName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFile(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public InputStream downloadFile(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void uploadFile(InputStream os, MyCloudFile fileInfo) {
		// TODO Auto-generated method stub

	}

}
