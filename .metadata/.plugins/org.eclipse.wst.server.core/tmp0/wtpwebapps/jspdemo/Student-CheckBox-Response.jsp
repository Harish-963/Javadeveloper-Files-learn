<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>

	The Student is confirmed: ${param.firstName} ${param.lastName}
	<br />
	<br /> The Student's county: ${param.country}
	<br />
	<br />
	<!--Display the list of selected items for favourite language  -->
	Favorite Programming Languages selected by the student:
	<ul>
		<%
		String[] langs = request.getParameterValues("favoriteLang");
		 if (langs != null) {
		for (String lang : langs) {
			out.println("<li>" + lang + "</li>");
		}
		 }
		 else{
			 out.println("<li>" +"None"+ "</li>");
			 
		 }
		%>

	</ul>

</body>
</html>