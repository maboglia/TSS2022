<%@page import="controller.TodoCtrl"%>
<% 

if (request.getParameter("idTodo")!=null){
	TodoCtrl ctrl;
	
	//verifico se nella session (spazio di memoria sul server) c'� un oggetto che si chiama controller
	if (session.getAttribute("controller")!=null){
		//se c'� il controller lo assegno alla mia var ctrl
		ctrl = (TodoCtrl) session.getAttribute("controller");
	} else {
		//se non c'� in sessione, lo creo e lo assegno alla mia var ctrl
		ctrl = new TodoCtrl();
	}
	
	//usando il ctrl aggiungo il todo 
	int id = Integer.parseInt(request.getParameter("idTodo"));
	ctrl.completeTodoById(id);


	//salvo in sessione il controller modificato	
	session.setAttribute("controller", ctrl);
}

response.sendRedirect("index.jsp");



%>