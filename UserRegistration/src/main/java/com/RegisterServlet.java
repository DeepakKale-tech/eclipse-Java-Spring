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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		
		String name = request.getParameter("uname");
		int age = Integer.parseInt(request.getParameter("uage"));
		String email = request.getParameter("umail");
		String password = request.getParameter("upass");
		String city = request.getParameter("ucity");
		
		User u = new User();
		u.setName(name);
		u.setAge(age);
		u.setEmail(email);
		u.setPassword(password);
		u.setCity(city);
		
		int status = UserDAO.saveUser(u);
		if(status > 0)
		{
			pw.print("<h2>Registration Successfull!!</h3>");
			pw.print("<br><h3><a href='Login.html'>Click here to Login</a></h3>");
		}
		else
		{
			pw.print("<h2 style='color:red'>Unable to Register User</h2>");
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.include(request, response);
		}
		pw.close();
	}

}
