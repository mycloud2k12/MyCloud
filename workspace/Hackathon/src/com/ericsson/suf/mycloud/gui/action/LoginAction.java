package com.ericsson.suf.mycloud.gui.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {
	
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
		    HttpServletRequest request, HttpServletResponse response)
		    throws Exception {
		
		LoginForm formBean = (LoginForm)form;
		String name = formBean.getName();
		String password = formBean.getPassword();
		
		// perform validation
	    if ((name == null) || // name parameter does not exist
	    		password == null || // email parameter does not exist
	            name.equals("")  // name parameter is emp
	            ) {   

	    	formBean.setError();
	        return mapping.findForward(FAILURE);
	    }

		    return mapping.findForward(SUCCESS);
		}

}
