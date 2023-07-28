<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personalize page cookie set</title>
</head>
<body>
	<!-- Create and send cookie to the browser -->
	<%
	String favLang = request.getParameter("favLanguage");
	// encode cookie data ... handle case of languages with spaces in them
	favLang = URLEncoder.encode(favLang, "UTF-8");
	//create a cookie
	Cookie theCookie = new Cookie("myApp.FavoriteLanguage", favLang);
	//set the life span time for the cookie
	theCookie.setMaxAge(365 * 24 * 60 * 60);
	//send the response to the browser
	response.addCookie(theCookie);
	%>

	<!-- Print some message to the user and home page navigating URL -->
	Thanks! We set your favorite language to :
	<%=request.getParameter("favLanguage")%>
	<br />
	<a href="cookies-homepage.jsp">Return to the home page.</a>


</body>
</html>
*
