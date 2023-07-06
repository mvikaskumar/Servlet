package com.learning;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// when you extend HttpServet, then class become Servlet itself.
//@WebServlet("/add")
public class ServletClass extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//You need to declare this service method for instansing the servlet.
	//regarding life cycle of servlet you will learn later.
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		System.out.println("Result is _"+ k );
		
		PrintWriter out= res.getWriter();
		
		out.println("<html><body bgcolor='purple'> <h1>This page is created for learning, why jsp page required.");
		out.println("</h1></body></html>");
		
	}
	

}
