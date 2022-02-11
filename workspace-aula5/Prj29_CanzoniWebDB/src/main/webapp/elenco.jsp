<%@page import="model.Canzone"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Le nostre canzoni</h1>

<table>

	<tr>
		<th>Titolo</th>
		<th>Cantante</th>
	</tr>

<% List<Canzone> canzoni = (List<Canzone>) request.getAttribute("listaCanzoni"); %>
<% for (Canzone c : canzoni){ %>

	<tr>
		<td><a href="https://www.google.com/search?q=<%= c.getTitolo() %>"><%= c.getTitolo() %></a></td>
		<td><a href="https://www.google.com/search?q=<%= c.getCantante() %>"><%= c.getCantante() %></a></td>
	</tr>
<% } %>




</table>


</body>
</html>