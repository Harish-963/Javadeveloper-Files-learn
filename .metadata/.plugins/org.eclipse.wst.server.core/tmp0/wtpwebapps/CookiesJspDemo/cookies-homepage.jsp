<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<!-- Read cookie from the browser -->
	<%
	String favLang = "Java";
	Cookie[] theCookies = request.getCookies();
	if (theCookies != null) {
		for (Cookie cookie : theCookies) {
			if (cookie.getName().equals("myApp.FavoriteLanguage")) {
		// decode cookie data ... handle case of languages with spaces in them
		favLang = URLDecoder.decode(cookie.getValue(), "UTF-8");
		break;
			}
		}

	}
	pageContext.setAttribute("favLang", favLang);
	%>

	<!-- Display some customized text base on user personalize with storing values in cookie -->
	<h1 align="center">Training Portal</h1>
	<br>

	<h3>
		New Books for
		<%=pageContext.getAttribute("favLang")%>
	</h3>
	<ul>
		<li>Some Thing Book</li>
		<li>Some Kind of Book</li>
	</ul>

	<br>

	<h3>
		Latest new report for
		<%=pageContext.getAttribute("favLang")%>
	</h3>
	<ul>
		<li>New version released for <%=pageContext.getAttribute("favLang")%></li>
		<li><%=pageContext.getAttribute("favLang")%> rated as Top 1</li>
	</ul>

	<br>

	<h3>
		Hot Jobs for
		<%=pageContext.getAttribute("favLang")%>
	</h3>
	<ul>
		<li><%=pageContext.getAttribute("favLang")%> Developer</li>
		<li>BackEnd <%=pageContext.getAttribute("favLang")%> developer
		</li>
	</ul>

	<br>
	<hr>
	<a href="cookies-personalize-form.html">Personalize this Page</a>

</body>
</html>