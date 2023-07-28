package com.practice.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// define datasource/connection pool for resource injection
	@Resource(name = "jdbc/web_student_tracker")
	private DataSource dataSource;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// step1 set up the print writer..4
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		// step2 get connection to the database..
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		try {
			connection = dataSource.getConnection();
			// step3 create a sql statement
			String query = "Select * from student";
			statement = connection.createStatement();
			// step4 execute sql query
			resultset = statement.executeQuery(query);
			// step5 process the result set
			while (resultset.next()) {
				String email = resultset.getString("email");
				out.println(email);
			}
		} catch (Exception e) {

		}
	}

}
