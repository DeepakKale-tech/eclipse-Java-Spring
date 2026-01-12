package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;


@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");		
		String n = request.getParameter("uname");
		System.out.println("Welcome "+n);
		
		request.setAttribute("surname", "Kale");
		
		request.getRequestDispatcher("ServletTwo").forward(request, response);
		
		HttpSession session = request.getSession();
		session.setAttribute("dname", "Admin");
		
		ServletContext context = getServletContext();
		
		context.setAttribute("cname", "JavaSpring");
		
	}

}
