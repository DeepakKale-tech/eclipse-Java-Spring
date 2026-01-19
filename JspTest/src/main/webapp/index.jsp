<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int age=26;
int cube(int n)
{
	return n*n*n;
}
%>
<%= "Welcome to JSP Page" 
%>
<%= "<br>Welcome "+request.getParameter("uname")+
" <br> Password: "+request.getParameter("upass")
+"<br>Age :"+age%>
<%="<br>Cube of 3: "+cube(3) %>
<br>

</body>
</html>