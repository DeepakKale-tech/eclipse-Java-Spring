<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="test.User" scope="session"/>

Record :<br>
Name: <jsp:getProperty  name="obj" property="name"/><br>
Password: <jsp:getProperty name="obj" property="password"/><br>
Email: <jsp:getProperty name="obj" property="email"/><br>

<a href="processtwo.jsp">Vist 2nd process page</a>
</body>
</html>