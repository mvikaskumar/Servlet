package com.learning;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

//Creating servlet using Implementiong servlet
import javax.servlet.*;

public abstract class LifeCycleServlet implements Servlet {
	
/* *Life Cycle methods of servlet...
 * 
1)public abstract void init(javax.servlet.ServletConfig)
2)public ServletConfig getServletConfig();
3)public void
	service(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
4)public abstract java.lang.String getservletInfo();
5)public abstract void destroy(); 

#1,3,5 are servlet lifecycle method while 2,4 are non life cycle method.

*/
	ServletConfig conf;
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Creating object...");
		
	}
	
	public void service(ServletRequest req, ServletResponse reps) throws ServletException, IOException
	{
		System.out.println("Servicing.....");
		//set the content type of the response
		reps.setContentType("text/html");
		PrintWriter out= reps.getWriter();
		out.println("<h1>This is my output from servlet method:</h1>");
		out.println("<h1> Todays date and time is "+new Date(0).toString()+"</h1>");
	}
	
	public void destroy() {
		System.out.println("Going to destroy servlet object");
	}
	
	
	/// Non life cycle methos
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getStringInfoString() {
		return "Non life cycle method";
	}
}
