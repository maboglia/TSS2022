package presentation;

import java.io.IOException;

import controller.CanzoniCtrl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Canzone;


@WebServlet("/canzoni")
public class CanzoniMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CanzoniCtrl ctrl;
	
	
    /**
     * Default constructor. 
     */
    public CanzoniMVC() {
    	this.ctrl = new CanzoniCtrl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("listaCanzoni", this.ctrl.getCantanti());
		request.getRequestDispatcher("elenco.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("titolo")!=null) {
			
			String titolo = request.getParameter("titolo");
			String cantante = request.getParameter("cantante");
			String genere = request.getParameter("genere");
			int anno =  Integer.parseInt( request.getParameter("anno") );
			
			Canzone c = new Canzone(titolo, cantante, genere, anno);
			ctrl.addCanzone(c);
			
		}
		
		
		
		doGet(request, response);
	}

}
