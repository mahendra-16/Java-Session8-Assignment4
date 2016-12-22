package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SecondCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String lastname = request.getParameter("lastname");
			//out.println("Last Name :"+ lastname);
			
			Cookie mycookie = new Cookie("LastName", lastname);
			response.addCookie(mycookie);
			
			out.println("<form action = 'ThirdServlet' method = 'post'>");
			out.println("<input type = 'Submit', value = 'go'>");
			out.println("</form>");
	
			out.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
