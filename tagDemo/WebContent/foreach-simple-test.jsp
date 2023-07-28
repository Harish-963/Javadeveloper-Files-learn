<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
//just creating a scriptlet for some sample data..  normally provided by mvc
String[] cities = { "Mumbai", "Hyderabad", "Chennai" };
pageContext.setAttribute("myCities", cities);
%>

<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<c:forEach var="tempCity" items="${myCities}">
	
		${tempCity} <br />

	</c:forEach>

</body>
</html>