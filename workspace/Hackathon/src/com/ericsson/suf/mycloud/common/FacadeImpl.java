package com.ericsson.suf.mycloud.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;

import com.ericsson.suf.mycloud.configuration.ConfigurationManager;
import com.ericsson.suf.mycloud.provider.JamesProvider;
import com.sun.mail.pop3.POP3Folder;

public class FacadeImpl implements Facade {

	private Map<String, FileSytemIndex> fileSystemIndexMap = new HashMap<String, FileSytemIndex>();

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
		if (type.equals("JAMES")) {
			JamesProvider.getInstance().testConnection(emailID, emailPassword);
			FileSytemIndex fileSytemIndex = new FileSytemIndex();
			List<MyCloudFile> myCloudFiles = new ArrayList<MyCloudFile>();
			fileSytemIndex.setMyCloudFiles(myCloudFiles);
			fileSystemIndexMap.put(userId, fileSytemIndex);
			ConfigurationManager.getInstance().persistConfiguration(emailID, emailPassword, userId);
		} else {
			throw new Exception("Provider '" + type + "' not supported");
		}
	}

	@Override
	public MyCloudFile[] getFilesAtPath(String path) {

		List<MyCloudFile> cloudFileList = new ArrayList<MyCloudFile>();
		try {
			Session session = JamesProvider.getInstance().getSession();
			Store store = session.getStore("pop3");
			store.connect();

			Folder fd = store.getFolder(path);
			POP3Folder folder = (POP3Folder) fd;
			folder.open(POP3Folder.READ_ONLY);
			Message[] messages = folder.getMessages();
			for (int i = 1; i <= messages.length ; i++) {
				Message message = messages[i];
				MyCloudFile cloudFile = new MyCloudFile();
				cloudFile.setId(UUID.randomUUID().toString());
				cloudFile.setFolder(false);
				cloudFile.setName(message.getFileName());
				cloudFile.setSize(message.getSize());
				cloudFile.setUploadTimeAndDate(message.getSentDate().toString());
				cloudFile.setPath(path);
//				cloudFile.setLocation(location);
				cloudFileList.add(cloudFile);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return  cloudFileList.toArray(new MyCloudFile[0]);
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
		return null;
	}

	@Override
	public void uploadFile(FileInputStream fis, MyCloudFile fileInfo) {

		Session session = JamesProvider.getInstance().getSession();

	}

}
