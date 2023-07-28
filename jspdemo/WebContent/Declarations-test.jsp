<html>
<body>
<h3>Declarations Test JSP</h3>

<!--declare method  -->
<%! String upperCase(String word){
	return word.toUpperCase();
	}%>
	
UPPER case using a method: <%= upperCase("hello world") %>

</body>

</html> 