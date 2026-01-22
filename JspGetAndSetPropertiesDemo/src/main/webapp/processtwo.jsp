<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj2" class="test.User"/>
<%
String name="Deepak";
String password="dk1234";
String email = "dk@example.com";
%>

<jsp:setProperty name="obj2" property="name" value="<%=name%>"/>
<jsp:setProperty  name="obj2" property="password" value="<%=password %>"/>
<jsp:setProperty  name="obj2" property="email" value="<%=email%>"/>

Record: <br>
<jsp:getProperty  name="obj2" property="name"/><br>
<jsp:getProperty  name="obj2" property="password"/><br>
<jsp:getProperty  name="obj2" property="email"/><br>


</body>
</html>