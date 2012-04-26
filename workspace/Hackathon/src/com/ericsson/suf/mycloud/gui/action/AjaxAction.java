package com.ericsson.suf.mycloud.gui.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class AjaxAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
		    HttpServletRequest request, HttpServletResponse response)
		    throws Exception {
		String theOccurrenceXMLData = getXMLData();
		response.getWriter().write(theOccurrenceXMLData);
		
	    return null;
	}
	
	private String getXMLData()
	{
		StringBuilder sd = new StringBuilder();
		sd.append("<?xml version='1.0' encoding='iso-8859-1'?>");
		sd.append("<tree id='0'>");
		sd.append("<item text='Books' id='mystery'/>");
		sd.append("</tree>");
		return sd.toString();
	}
}
