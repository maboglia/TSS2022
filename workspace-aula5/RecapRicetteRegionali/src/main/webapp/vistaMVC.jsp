<%@page import="java.util.List"%>
<%@page import="model.Ricetta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Ricette MVC</h1>

<ul>
	<% List<Ricetta> ricette = (List<Ricetta>) request.getAttribute("ricette"); %>

	<% for(Ricetta r: ricette){ %>
		<li><%= r.getNome() %></li>
	<% } %>

</ul>
	

</body>
</html>