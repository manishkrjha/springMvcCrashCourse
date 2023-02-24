<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h3>Hello</h3>
	
	<%
		String name = (String)request.getAttribute("name");	
		Integer id = (Integer)request.getAttribute("id");
		List<String> li =  (List<String>)request.getAttribute("subjects");
	%>
	
	<h4>My name is <%= name %></h4>
	<p>My id: <%= id %> </p>
	<p>Subjects that I've picked: <%= li %></p>
</body>
</html>