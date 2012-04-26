package com.ericsson.suf.mycloud.gui.action;

import org.apache.struts.action.ActionForm;

public class ConfigurationForm extends ActionForm {
	
	String email;
	
	String password;
	
	String accountType;
	
	// error message
	private String error;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}
	
	public String getAccountType()
	{
		return this.accountType;
	}
	
	public void setError() {
	    this.error =
	        "<span style='color:red'>Please provide valid entries for both fields</span>";
	}

}
