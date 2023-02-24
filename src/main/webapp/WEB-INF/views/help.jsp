<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
	<%
		String name = (String)request.getAttribute("name");
		Integer roll = (Integer)request.getAttribute("rollNo");
	%>
	
	<p>Hello my name is: <%= name %></p>
	<p>My roll no is: <%= roll %></p>
</body>
</html>