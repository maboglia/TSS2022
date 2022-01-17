<%@ page import="model.Studente" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello, world</h1>

<% 
	String s = "hello world";
	Studente st = new Studente("pippo");
	

for (int i = 1; i <=6; i++){
	out.print("<h"+i+">" +  s  + "</h"+i+">");
	out.print(st);
}
%>


</body>
</html>