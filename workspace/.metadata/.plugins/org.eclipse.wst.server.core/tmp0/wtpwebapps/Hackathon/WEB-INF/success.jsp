<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <title>Login Success</title>
</head>
<body>
    <h1>Congratulations!</h1>

    <p>You have successfully logged in.</p>

    <p>Your name is: <bean:write name="LoginForm" property="name" />.</p>

    <p>Your password is: <bean:write name="LoginForm" property="password" />.</p>
</body>
</html>