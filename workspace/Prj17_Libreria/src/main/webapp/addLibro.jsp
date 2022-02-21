<%@page import="controller.LibreriaCtrl"%>
<%

	String titolo = null;
	double prezzo = 0;

	if (request.getParameter("titolo") != null){
		titolo = request.getParameter("titolo");
	}
		
	if (request.getParameter("prezzo") != null){
		prezzo = Double.parseDouble(request.getParameter("prezzo"));
	}
	
	if (titolo != null)
		LibreriaCtrl.addLibro(titolo, prezzo);
	
	response.sendRedirect("index.jsp?action=listLibri");


%> 