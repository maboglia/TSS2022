<%@page import="entities.Country"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

	table img {width:140px;height: 100px;}

</style>
</head>
<body>

<h1>Elenco</h1>

<table>
  <tr>
    <th>stato</th>
    <th>capitale</th>
    <th>bandiera</th>
    <th>popolazione</th>
  </tr>

<% List<Country> paesi = (List<Country>) request.getAttribute("paesi"); %>

<% for(Country c : paesi){ %>

  <tr>
    <td><%= c.getStato() %></td>
    <td><%= c.getCapitale() %></td>
    <td><img src="<%= c.getBandiera() %>" alt="Bandiera <%= c.getStato() %>"></td>
    <td><%= c.getPopolazione() %></td>
  </tr>


<% } %>





</table>



</body>
</html>