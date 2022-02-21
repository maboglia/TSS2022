
<%@page import="model.Prodotto"%>
<%@page import="java.util.List"%>
<h1>Prodotti nel carrello</h1>

<table>
	<tr>
		<th>Cod.</th>
		<th>Prodotto</th>
		<th>Prezzo</th>
		<th>Azione</th>
	</tr>

<% List<Prodotto> prodotti = (List<Prodotto>) session.getAttribute("prodotti"); %>
<h2><%= session.getId() %></h2>
<% for (Prodotto p : prodotti){ %>
	<tr>
		<td><%= p.getCodProdotto() %></td>
		<td><%= p.getNome() %></td>
		<td><%= p.getPrezzo() %></td>
		<td>
			<form method="post" action="delete">
				<input type="hidden" name="codProdotto" value="<%= p.getCodProdotto() %>">
				<input type="submit" value="elimina">
			</form>
		</td>
	</tr>


<% } %>


</table>




