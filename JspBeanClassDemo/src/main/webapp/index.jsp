<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.Calculate"/>
<jsp:useBean id="obj2" class="com.Square"/>

<%
out.println("Value of Data: "+obj.getData());
out.println("<br>Cube of 3: "+obj.cube(3));
out.println("<br>Square of 5: "+obj2.square(5));
%>
</body>
</html>