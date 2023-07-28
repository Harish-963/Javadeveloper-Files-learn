<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<div align="center">
		<h1>Employee Registration form</h1>
		<form action="EmployeeServlet" method="post" >
			<table style="width: 80%" >
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name"></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>Contact</td>
					<td><input type="text" name="contact"></td>
				</tr>

				<tr>
					<td><input type="submit" name="submit"></td>
				</tr>


			</table>

		</form>

	</div>

</body>
</html>