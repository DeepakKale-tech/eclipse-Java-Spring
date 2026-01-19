package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		List<User> list = UserDAO.getAll();
		
		pw.print("<h2>List of Users</h2>");
		pw.print("<table border='1' width='100%'>");
		pw.print("<tr><th>ID</th><th>Name</th><th>Age</th><th>Email</th><th>Password</th><th>City</th></tr>");
		
		for(User u:list)
		{
			pw.print("<tr><td>"+u.getId()+"</td><td>"+u.getName()+"</td><td>"+u.getAge()+"</td><td>"+u.getEmail()+"</td><td>"+u.getPassword()+"</td><td>"+u.getCity()+"</td></tr>");
		}
		pw.print("</table>");
		
		pw.print("<h3><a href='Login.html'>Go To Login Page</a></h3>");
		pw.print("<h3><a href='register.html'>Go To Registration Page</a></h3>");
		pw.close();
	}

}
