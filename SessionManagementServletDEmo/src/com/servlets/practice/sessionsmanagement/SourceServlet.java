package com.servlets.practice.sessionsmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sourceServlet")
public class SourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	 	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get parameter form html
		String name = request.getParameter("first_name");
		
		//get session handle
		HttpSession session = request.getSession();
		
		//set the attribute to the session
		session.setAttribute("user", name);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<a href='targetServlet'>Click here to get username</a>");
	}

}
