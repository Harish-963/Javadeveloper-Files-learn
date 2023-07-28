<%@page import = "com.demo.jsp.FunUtils" %>
<html>
<body>
<h3>Fun Test JSP</h3>

<!--call java class code instead of writing lines of code in jsp..  -->

Let's Have some Fun: <%= FunUtils.upperCase("hello world oo") %>

</body>

</html> 