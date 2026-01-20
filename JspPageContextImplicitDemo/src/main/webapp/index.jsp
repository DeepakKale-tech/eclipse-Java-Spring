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
out.println("Funfact is "+request.getParameter("funfact"));

pageContext.setAttribute("user","HeroKing",PageContext.SESSION_SCOPE);

%>
<br>
<a href="welcome.jsp">GO to Welcome Page</a>
</body>
</html>