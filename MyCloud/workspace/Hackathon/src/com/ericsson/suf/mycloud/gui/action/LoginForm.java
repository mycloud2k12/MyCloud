package com.ericsson.suf.mycloud.gui.action;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {
	
	String name;
	
	String email;
	
	// error message
	private String error;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
