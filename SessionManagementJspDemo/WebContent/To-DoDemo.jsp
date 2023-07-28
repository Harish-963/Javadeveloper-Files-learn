
<%@page import="java.util.*"%>
<html>
<head>

<title>ToDo APP</title>
</head>
<body>
	<!-- 1.Create an html form -->
	<form action="To-DoDemo.jsp">
		Add new item: <input type="text" name="theItem" /> <input
			type="submit" value="Submit" />
	</form>

	<br />


	<!-- 2.Add new iten to todo list -->
	<%
	//get todo list from the session.
	List<String> items = (List<String>) session.getAttribute("myToDoList");

	//if todo items doesn't exist, then create new one.
	if (items == null) {
		items = new ArrayList<>();
		session.setAttribute("myToDoList", items);
	}
	//see if there is form data to add
	String theItem = request.getParameter("theItem");
 	boolean isItemNotEmpty = theItem != null && theItem.trim().length() > 0;
	boolean isItemNotDuplicate = theItem != null && !items.contains(theItem.trim());
	
	if (isItemNotEmpty && isItemNotDuplicate) {    		
		items.add(theItem.trim());    		
	}
	%>

	<!-- 3. Display all todo items from the session -->
	<br />
	<hr>
	<b>Your ToDo items:</b>
	<ol type="1">
		<%
		if (items != null) {
			for (String s : items) {
				out.println("<li>" + s + "</li>");
			}
		}
		%>

	</ol>
</body>
</html>