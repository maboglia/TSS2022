<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Aggiungi todo</h2>
<form action="doAggiungi.jsp" method="post">
	
	<input type="text" name="cosa" placeholder="cosa da fare">
	<input type="submit" value="aggiungi">

</form>
<h2>Elenco todo</h2>

<%@ include file="lista.jsp" %>


</body>
</html>