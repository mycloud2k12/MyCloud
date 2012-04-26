package com.ericsson.suf.mycloud.gui.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ConfigurationAction extends Action {
	
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
		    HttpServletRequest request, HttpServletResponse response)
		    throws Exception {
		  
		ConfigurationForm formBean = (ConfigurationForm)form;
		String name = formBean.getEmail();
		String password = formBean.getPassword();
		String accounttype = formBean.getAccountType();
		
		formBean.setError("Saved...");
		return mapping.findForward(SUCCESS);


}
}
