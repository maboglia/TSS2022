<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>



<form method="post" action="serie">
	
	<div>
		<label for="titolo">Titolo</label>
		<input type="text" id="titolo" name="titolo">
	</div>

	<div>
		<label for="genere">Genere</label>
		<input type="text" id="genere" name="genere">
	</div>
	<div>
		<input type="submit" value="add serie">
	</div>

</form>





<%@ include file="footer.jsp" %>


