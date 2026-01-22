<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is my Include Action Tag Example</h1>
<jsp:include page="printdate.jsp">
<jsp:param  name="action" value="include"/>
</jsp:include>
<h2>End of my page</h2>
<%@ include file="index.html" %>
</body>
</html>