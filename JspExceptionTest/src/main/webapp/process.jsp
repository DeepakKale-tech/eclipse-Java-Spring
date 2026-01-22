<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String no1 = request.getParameter("num1");
String no2 = request.getParameter("num2");

int a = Integer.parseInt(no1);
int b = Integer.parseInt(no2);

int c = a/b;

out.print("Division of "+no1+" and "+no2+"  is "+c);
%>
</body>
</html>