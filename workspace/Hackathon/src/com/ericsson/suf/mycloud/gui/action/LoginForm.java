package com.ericsson.suf.mycloud.gui.action;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {
	
	String name;
	
	String password;
	
	// error message
	private String error;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	public void setError() {
	    this.error =
	        "<span style='color:red'>Please provide valid entries for both fields</span>";
	}

}
