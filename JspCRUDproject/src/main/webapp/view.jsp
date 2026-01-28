<%@page import="com.UserDao"%>
<%@page import="com.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Users</title>
</head>
<body>
<h2>User List</h2>
<table border="1" width="100%" style="font-size:30px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Age</th>
<th>Password</th>
<th>City</th>
</tr>
<%
	List<User> list = UserDao.getUsers();
	for(User u: list)
	{
%>
<tr align="center">
	<td><%= u.getId() %></td>
	<td><%= u.getName() %></td>
	<td><%= u.getAge() %></td>
	<td><%= u.getPassword() %></td>
	<td><%= u.getCity() %></td>
</tr>
<%
	}
%>
</table>
</body>
</html>