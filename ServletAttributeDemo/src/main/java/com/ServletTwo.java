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


@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String n = request.getParameter("uname");
		String s = (String)request.getAttribute("surname");
		pw.print("Username: "+n);
		pw.print("<br>//Refresh page once to see values");
		pw.print("<br>Request: "+s);
		
		HttpSession session = request.getSession(true);
		String a = (String)session.getAttribute("dname");
		
		pw.print("<br> Session: "+a);
		
		ServletContext context = getServletContext();
		String c = (String)context.getAttribute("cname");
		pw.print("<br> Context: "+c);
	}

}
