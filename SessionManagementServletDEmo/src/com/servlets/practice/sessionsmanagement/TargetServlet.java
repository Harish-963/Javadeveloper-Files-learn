package com.servlets.practice.sessionsmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/targetServlet")
public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get session handle
				HttpSession session = request.getSession();
				
				//get the attribute from the session
				String name = (String) session.getAttribute("user");
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				out.print("<p>The name of user is "+name+"</p>");
	}


}
