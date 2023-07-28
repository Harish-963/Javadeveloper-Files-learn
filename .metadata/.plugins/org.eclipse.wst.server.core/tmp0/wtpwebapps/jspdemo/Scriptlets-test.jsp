<html>
<body>
<h3>Scriptlets Test JSP</h3>

Printing even numbers upto 10:
<br/>
<% for(int i = 1;i<=10;i++)
	{
	if(i%2 == 0)
	{
		out.println("<br/>"+i);
	}
	}
	%>

</body>

</html> 