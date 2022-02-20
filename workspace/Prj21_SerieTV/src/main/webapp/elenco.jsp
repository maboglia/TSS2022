
<%@page import="model.Serie"%>
<%@page import="java.util.List"%>
<h1>Le nostre serie tv</h1>

<table>

	<tr>
		<th>titolo</th>
		<th>genere</th>
	</tr>

<%  List<Serie> elenco = (List<Serie>) request.getAttribute("elenco");     %>

<% for (Serie s : elenco) { %>

	<tr>
		<td><%= s.getTitolo() %></td>
		<td><a href="?genere=<%= s.getGenere() %>"><%= s.getGenere() %></a></td>
		
	</tr>

<% } %>

</table>