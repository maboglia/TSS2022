
<%@page import="model.Prodotto"%>
<%@page import="java.util.List"%>
<h1>Prodotti disponibili</h1>

<table>
	<tr>
		<th>Prodotto</th>
		<th>Prezzo</th>
		<th>Azione</th>
	</tr>

<% List<Prodotto> prodotti = (List<Prodotto>) request.getAttribute("prodotti"); %>

<% for (Prodotto p : prodotti){ %>
	<tr>
		<td><%= p.getNome() %></td>
		<td><%= p.getPrezzo() %></td>
		<td>
			<form method="post" action="carrello">
				<input type="hidden" name="codProdotto" value="<%= p.getCodProdotto() %>">
				<input type="submit" value="add">
			</form>
		</td>
	</tr>


<% } %>


</table>




