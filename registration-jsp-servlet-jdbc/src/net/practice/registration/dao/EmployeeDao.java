package net.practice.registration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import net.practice.registration.model.Employee;

public class EmployeeDao {
	private DataSource datasource;

	public EmployeeDao(DataSource datasource) {
		this.datasource = datasource;
	}

	public int registerEmployee(Employee employee) throws SQLException {

		Connection connection = null;
		PreparedStatement preparedstatement = null;
		try {
			// get connection
			connection = datasource.getConnection();
			// create a SQL query for insert
			String query = "insert into employee(first_name,last_name,username,password_,address,contact) values(?,?,?,?,?,?)";
			preparedstatement = connection.prepareStatement(query);

			// set the parameters for the passing valye for the employee..
			preparedstatement.setString(1, employee.getFirstName());
			preparedstatement.setString(2, employee.getLastName());
			preparedstatement.setString(3, employee.getUsername());
			preparedstatement.setString(4, employee.getPassword());
			preparedstatement.setString(5, employee.getAddress());
			preparedstatement.setString(6, employee.getContact());

			System.out.println(preparedstatement);
			// execute the SQL query to set employee details
			int result = preparedstatement.executeUpdate();
			return result;
		} finally {
			close(connection, preparedstatement, null);
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
}
