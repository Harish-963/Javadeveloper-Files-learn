<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="theLocale"
	value="${not empty param.theLocale ? param.theLocale: pageContext.request.locale }"
	scope="session" />

<fmt:setLocale value="${theLocale }" />

<fmt:setBundle basename="com.jsp.tagdemo.i18n.resources.mylabels"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main page for messages</title>
</head>
<body>

	<a href="i18n-messages-test.jsp?theLocale=en_IN">English (IN)</a> |
	<a href="i18n-messages-test.jsp?theLocale=hi_IN">Hindi (IN)</a> |
	<a href="i18n-messages-test.jsp?theLocale=te_IN">Telugu (IN)</a>
	<br>
	<br>
	<fmt:message key="label.greeting" />
	<br>
	<br>

	<fmt:message key="label.firstname" />
	<i>Harish</i>
	<br>

	<fmt:message key="label.lastname" />
	<i>Alapati</i>
	<br>
	<br>

	<fmt:message key="label.welcome" />
	<br>
	<br>

</body>
</html>
