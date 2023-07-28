package com.practice.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDBUtil {

	private DataSource datasource;

	public StudentDBUtil(DataSource datasource) {
		this.datasource = datasource;
	}

	public List<Student> getStudents() throws Exception {
		List<Student> students = new ArrayList<>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		try {
			// get connection
			connection = datasource.getConnection();
			// step create a sql statement
			String query = "Select * from student order by last_name";
			statement = connection.createStatement();
			// step execute sql query
			resultset = statement.executeQuery(query);
			// step process the result set and a
			while (resultset.next()) {
				// retrieve data from result set row
				int id = resultset.getInt("id");
				String first_name = resultset.getString("first_name");
				String last_name = resultset.getString("last_name");
				String email = resultset.getString("email");

				// create an student object with that data
				Student tempStudent = new Student(id, first_name, last_name, email);
				// add objects to the list of students
				students.add(tempStudent);
			}
			return students;
		}
		// close jdbc object
		finally {
			close(connection, statement, resultset);
		}

	}

	private void close(Connection connection, Statement statement, ResultSet resultset) {
		// TODO Auto-generated method stub
		try {
			if (resultset != null) {
				resultset.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();// doesn't really close it just puts back in the connection pool
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addStudent(Student theStudent) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		try {
			// get connection
			connection = datasource.getConnection();
			// create a SQL query for insert
			String query = "insert into student(first_name,last_name,email) values(?,?,?)";
			preparedstatement = connection.prepareStatement(query);
			// set the parameters for the passing valye for the student..
			preparedstatement.setString(1, theStudent.getFirstName());
			preparedstatement.setString(2, theStudent.getLastName());
			preparedstatement.setString(3, theStudent.getEmail());

			// execute the SQL insert query
			preparedstatement.execute();

		} finally {
			close(connection, preparedstatement, null);
		}

	}

	public Student getStudent(String theStudentId) throws Exception {
		ResultSet resultset = null;
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		Student theStudent = null;
		int studentId;
		try {
			// convert Student id to int
			studentId = Integer.parseInt(theStudentId);
			// get connection
			connection = datasource.getConnection();

			// create a SQL query for select by id
			String query = "select * from student where id = ?";
			preparedstatement = connection.prepareStatement(query);

			// set the parameters for the passing valye for the student..
			preparedstatement.setInt(1, studentId);

			// execute the SQL query to get student details
			resultset = preparedstatement.executeQuery();

			// retrieve data from result set row.
			if (resultset.next()) {
				String firstName = resultset.getString("first_name");
				String lastName = resultset.getString("last_name");
				String email = resultset.getString("email");

				// user the student id during construction;
				theStudent = new Student(studentId, firstName, lastName, email);
			} else {
				throw new Exception("Could not find the id: " + studentId);
			}

			return theStudent;
		} finally {
			close(connection, preparedstatement, resultset);
		}
	}

	public void updateStudent(Student theStudent) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		try {
			// get connection
			connection = datasource.getConnection();
			// create a SQL query for update
			String query = "update student set first_name = ?, last_name = ?, email = ? where id = ?; ";
			preparedstatement = connection.prepareStatement(query);
			// set the parameters for the passing valye for the student..
			preparedstatement.setInt(4, theStudent.getId());
			preparedstatement.setString(1, theStudent.getFirstName());
			preparedstatement.setString(2, theStudent.getLastName());
			preparedstatement.setString(3, theStudent.getEmail());

			// execute the SQL update query
			preparedstatement.execute();

		} finally {
			close(connection, preparedstatement, null);
		}
	}

	public void deleteStudent(int theStudentId) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		try {
			// get connection
			connection = datasource.getConnection();
			// create a SQL query for delete
			String query = "delete from student where id = ?;";
			preparedstatement = connection.prepareStatement(query);
			// set the parameters for the passing valye for the student..
			preparedstatement.setInt(1, theStudentId);

			// execute the SQL delete query
			preparedstatement.execute();

		} finally {
			close(connection, preparedstatement, null);
		}

	}

}
