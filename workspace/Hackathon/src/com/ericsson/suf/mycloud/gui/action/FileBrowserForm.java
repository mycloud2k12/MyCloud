package com.ericsson.suf.mycloud.gui.action;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class FileBrowserForm extends ActionForm {
	
	FormFile myFile;

	public FormFile getMyFile() {
		return myFile;
	}

	public void setMyFile(FormFile file) {
		this.myFile = file;
	}

}
