package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String user = request.getParameter("user");
		String pass = request.getParameter("upass");
		
		try
		{
		User u = UserDAO.getUser(user);
		
		if(u!=null && u.getPassword().equals(pass))
		{
			pw.print("<h2>Login Success</h2>");
			pw.print("<table>");
			pw.print("<tr><th>ID</th><th>Name</th><th>Age</th><th>Email</th><th>Password</th><th>City</th><tr>");
			pw.print("<tr><td>"+u.getId()+"</td><td>"+u.getName()+"</td><td>"+u.getAge()+"</td><td>"+u.getEmail()+"</td><td>"+u.getPassword()+"</td><td>"+u.getCity()+"</td></tr>");
			pw.print("</table>");
		}else
		{
			pw.print("<h2 style='color:red'>Login failed</h2>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		pw.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
