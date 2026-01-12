package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try 
		{
			response.setContentType("text/html");
			
			PrintWriter pw = response.getWriter();
			String s = request.getParameter("username");
			
			pw.println("Welcome "+s);
			
			pw.print("<form action='ServletTwo' method='get'>");
			pw.print("<input type='hidden' name='hfield' value='"+s+"'>");
			pw.print("<input type='submit' value='visit'>");
			pw.print("</form>");
			
			pw.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try 
		{
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
