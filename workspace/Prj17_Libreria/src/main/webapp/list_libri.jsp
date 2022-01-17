<%@page import="controller.LibreriaCtrl"%>
<%@page import="model.Libro"%>
<h2>Elenco libri</h2>


<table>
<tr>
	<th>Titolo</th>
	<th>prezzo</th>
</tr>
<% for (Libro l : LibreriaCtrl.getLibri()){ %>
<tr>
	<td><%= l.getTitolo() %></td>
	<td><%= l.getPrezzo() %></td>
</tr>
<% } %>
</table>