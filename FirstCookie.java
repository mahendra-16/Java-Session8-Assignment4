package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FirstCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out =response.getWriter();
			out.println("<html><title><h2 align = center> Setting Cookies EXample </h2></title></html>");
			
			String firstname = request.getParameter("Username");
			
			//out.println("First Name :"+ firstname);
			
			
			
			Cookie cookie = new Cookie("FirstName", firstname);
			
			response.addCookie(cookie);
			
			
			
			out.println("<form action = 'SecondCookie' method = 'post'>");
			out.println("LastName: "+"<input type = 'text' Name = 'lastname'><br><br>");
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
