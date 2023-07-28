<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>split join function tag demo</title>
</head>
<body>

	<c:set var="data"
		value="Chennai,Hyderabad,Vizag,Bengalore,Andhra Pradesh" />

	<h3>Split demo</h3>

	<c:set var="citiesArray" value="${fn:split(data,',') }" />
	<br>
	<c:forEach var="tempCity" items="${citiesArray }">
		<br>
${tempCity }
</c:forEach>

	<br>

	<h3>join demo</h3>
	<c:set var="joinCities" value="${fn:join(citiesArray,'*') }" />
	${joinCities }

</body>
</html>