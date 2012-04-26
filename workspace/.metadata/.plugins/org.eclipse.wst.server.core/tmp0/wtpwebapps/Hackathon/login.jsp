<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
        <title>MyCloud Login!</title>
    </head>
    <body>
        <h2>
        <html:form action="/login.do">
        <table border="0">        
        <tbody>
        	<tr>
                <td colspan="2">
                    <bean:write name="LoginForm" property="error" filter="false"/>
                    &nbsp;</td>
            </tr>
            <tr>
                <td>Username:</td>
                <td><html:text property="name" /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><html:password property="password" /></td>
            </tr>
            <tr>
                <td></td>
                <td><html:submit value="Login" /></td>
            </tr>
        </tbody>
    </table>  

</html:form>
</h2>
    </body>
</html>