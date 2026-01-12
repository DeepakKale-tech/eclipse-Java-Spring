package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("sname");
		String age = request.getParameter("sage");
		String city = request.getParameter("scity");
		
		pw.println("<html><body>");
		pw.println("<h1>Student Information</h1>");
		pw.println("<b>Name : "+name+"</b><br><br>");
		pw.println("<b>Age : "+age+"</b><br><br>");
		pw.println("<b>City : "+city+"</b><br><br>");
		pw.println("</body></html>");
		
		pw.close();
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("sname");
		String age = request.getParameter("sage");
		String city = request.getParameter("scity");
		
		pw.println("<html><body>");
		pw.println("<h1>Student Information</h1>");
		pw.println("<b>Name : "+name+"</b><br><br>");
		pw.println("<b>Age : "+age+"</b><br><br>");
		pw.println("<b>City : "+city+"</b><br><br>");
		pw.println("</body></html>");
		
		pw.close();
	}

}
