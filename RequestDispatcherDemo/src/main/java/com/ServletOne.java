package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator.RequestorType;


@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			String user = request.getParameter("username");
			String pass = request.getParameter("upass");
			
			if(pass.equals("abc@123"))
			{
				RequestDispatcher rd = request.getRequestDispatcher("ServletTwo");
				rd.forward(request, response);
			}
			else
			{
				pw.print("Sorry, Incorrect Paasword");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
