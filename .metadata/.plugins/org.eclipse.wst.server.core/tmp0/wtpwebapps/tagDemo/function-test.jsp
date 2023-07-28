<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function tags demo</title>
</head>
<body>
<c:set var="data" value="Sai Harish"/>
The length of ${data } is : ${fn:length(data)}

<br/><br>

The upper Case of ${data } is : ${fn:toUpperCase(data)}
<br/><br>

The lower Case of ${data } is : ${fn:toLowerCase(data)}

<br/><br>

The subString of ${data } is : ${fn:substring(data,4,10)}
</body>
</html>