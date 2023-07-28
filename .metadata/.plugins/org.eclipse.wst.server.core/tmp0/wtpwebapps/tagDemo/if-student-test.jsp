<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*,com.jsp.tagdemo.Student"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
//just creating a scriptlet for some sample data..  normally provided by mvc
List<Student> students = new ArrayList<>();
students.add(new Student("Harish", "Alapati", true));
students.add(new Student("Sam", "Palla", false));
students.add(new Student("Kumar", "Sai", true));
students.add(new Student("Raju", "Konda", false));
students.add(new Student("Eswar", "Siva", true));

pageContext.setAttribute("myStudents", students);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student tags data</title>
</head>
<body>
	<table border="1">
		<tr style="text-shadow: green;">
			<td>First Name</td>
			<td>Last Name</td>
			<td>Gold Customer</td>
			<td>Discount</td>
		</tr>

		<c:forEach var="tempStudent" items="${myStudents }">

			<tr>
				<th>${tempStudent.firstName}</th>
				<th>${tempStudent.lastName }</th>
				<th>${tempStudent.goldCustomer }</th>

				<c:if test="${tempStudent.goldCustomer }">
					<th>50%</th>
				</c:if>
				<c:if test="${ not tempStudent.goldCustomer }">
					<th>20%</th>
				</c:if>
			</tr>
		</c:forEach>

	</table>

</body>
</html>