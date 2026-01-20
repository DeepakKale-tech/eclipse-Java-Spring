<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Welcome "+request.getParameter("uname"));

String driver = config.getInitParameter("dname");
out.println("<br>Driver is: "+driver);
%>
<br>

<%
String cname = application.getInitParameter("cpara");
out.println("Project Parameter: "+cname);
%>
</body>
</html>