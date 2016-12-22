package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><h2 align = center> Setting Cookies Example</h2></html>");
			
			
			Cookie ck[] = request.getCookies();
			for(Cookie kc : ck){
				out.println("<html><ul><li>" + kc.getName() + "</li>"
						+ "<li>" + kc.getValue() + "</li></ul></html>");
			}
			
			out.println("<form><input type = 'Submit' value = 'ReadCookies'><br><br> <input type = 'Submit' value = 'DeleteCookies'></form>");
			
			
			
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
