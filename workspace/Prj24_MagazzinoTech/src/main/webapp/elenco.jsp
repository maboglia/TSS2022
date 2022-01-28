<%@page import="model.Articolo"%>
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
<%@ include file="menu.jsp" %>

<h1>Articoli</h1>
<table>

	<tr>
		<td>Articolo</td>
		<td>Quantità</td>
	</tr>

<%   List<Articolo> articoli = (List<Articolo>)request.getAttribute("articoli"); %>
<% for (Articolo a : articoli){ %>
	<tr>
		<td><%=a.getDescrizione() %> </td>
		<td><%=a.getQuantita() %> </td>
		
	</tr>




<%} %>

</table>

</body>
</html>