<%@page import="db.Articoli"%>
<%@page import="model.Movimento"%>
<%@page import="model.Articolo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

	td.numero {text-align: right;}

</style>
</head>
<body>
<%@ include file="menu.jsp" %>
<h1>Movimenti</h1>

<form method="post" action="movimenti">
<input type=text name="descrizione" placeholder="descrizione"> 
<input type="number" name="quantita" placeholder="quantita">
<select name="articolo">
	<option>Scegli articolo</option>
<% for (Articolo a: Articoli.getALL().values()) {%>
	<option value=<%=a.getId() %>><%=a.getDescrizione() %></option>
	


<%} %>
</select> 

<input type="submit" value="Aggiungi">




</form>
<table>

	<tr>
		<td>DataMovimento</td>
		<td>Articolo</td>
		<td>Descrizione</td>
		<td class="numero">Quantità</td>
	</tr>

<%   List<Movimento> movimenti = (List<Movimento>)request.getAttribute("Movimenti"); %>
<% for (Movimento m : movimenti){ %>
	<tr>
		<td><%=m.getDataMovimento() %> </td>
		<td><%=m.getArticolo().getDescrizione() %> </td>
		<td><%=m.getDescrizione() %> </td>
		<td class="numero"><%=m.getQuantita() %> </td>
		
	</tr>




<%} %>

</table>

</body>
</html>