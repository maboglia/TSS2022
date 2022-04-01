package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Server;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import dal.ServerDAO;
import dal.ServerDAOImpl;

/**
 * Servlet implementation class ServerMVC
 */
@WebServlet("/servers")
public class ServerMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ServerCtrl ctrl;
	private ServerDAO dao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerMVC() {
    	dao = new ServerDAOImpl();
    	ctrl = new ServerCtrl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Server> servers  = null;
		try {
			servers = dao.getServers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("servers", servers);
		request.getRequestDispatcher("index.jsp").forward(request, response);
//		response.getWriter().append(servers.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("nome")!=null) {
			
			Server s = new Server(
					request.getParameter("indirizzo"), 
					request.getParameter("porta"), 
					request.getParameter("nome"), 
					request.getParameter("descrizione") 
					);
			try {
				dao.addServer(s);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		doGet(request, response);
	}

}
