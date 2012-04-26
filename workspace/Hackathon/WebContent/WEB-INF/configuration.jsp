<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Configuration</title>
</head>
<body>
<jsp:include page="mycloudLinks.jsp"></jsp:include>
        <html:form action="/saveconfig.do">
<table border="0">        
        <tbody>
                	<tr>
                <td colspan="2">
                    <bean:write name="ConfigurationForm" property="error" filter="false"/>
                    &nbsp;</td>
            </tr>
            <tr>
            <td>Account Type</td>
            <td>
            <html:select property="accountType">
    			<html:option value="none">-- None --</html:option>
    			<html:option value="gmail">james</html:option>
				<html:option value="gmail">gmail</html:option>
				<html:option value="hotmail">hotmail</html:option>
			</html:select>
			</td>
            </tr>
            <tr>
                <td>Email Id:</td>
                <td><html:text property="email" /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><html:password property="password" /></td>
            </tr>
            <tr>
                <td></td>
                <td><html:submit value="Save" /></td>
            </tr>
        </tbody>
    </table>  
            </html:form>

</body>
</html>