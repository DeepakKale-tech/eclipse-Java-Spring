<%@page import="com.UserDao"%>
<%@page import="com.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Status</title>
</head>
<body>
<jsp:useBean id="u" class="com.User" scope="request"/>
<jsp:setProperty name="u" property="id"  param="uid"/>
<jsp:setProperty name="u" property="name" param="uname"/>
<jsp:setProperty name="u" property="age" param="uage"/>
<jsp:setProperty name="u" property="password" param="upass"/>
<jsp:setProperty name="u" property="city" param="ucity"/>
<%

int status = UserDao.saveUser(u);
if(status > 0)
{
	out.print("Registration Successfull");
}else
{
	out.print("Registration not Successfull");
}
%>
<a href="view.jsp">View All Users</a>
</body>
</html>