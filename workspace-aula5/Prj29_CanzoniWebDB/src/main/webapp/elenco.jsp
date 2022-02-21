<%@page import="model.Canzone"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hit List Italia</title>
</head>
<body>

<h1>Le nostre canzoni</h1>

<table>

	<tr>
		<th>Titolo</th>
		<th>Cantante</th>
		<th>Anno</th>
	</tr>

<% List<Canzone> canzoni = (List<Canzone>) request.getAttribute("listaCanzoni"); %>
<% for (Canzone c : canzoni){ %>

	<tr>
		<td><a href="https://www.google.com/search?q=<%= c.getTitolo() %>"><%= c.getTitolo() %></a></td>
		<td><a href="https://www.google.com/search?q=<%= c.getCantante() %>"><%= c.getCantante() %></a></td>
		<td><%= c.getAnno() %></td>
	</tr>
<% } %>




</table>


</body>
</html>