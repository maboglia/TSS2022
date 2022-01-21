package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Serie;

import java.io.IOException;
import java.util.List;

@WebServlet({"/Serie", "/serie"})
public class SerieMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SerieCtrl ctrl;
	

	public SerieMVC() {
		this.ctrl = new SerieCtrl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Serie> elenco = null;
		
		if (request.getParameter("genere")!=null) {
			elenco = this.ctrl.getElencoByGenere(request.getParameter("genere"));
		} else {
			elenco = this.ctrl.getElenco();//elenco completo
		}
		

		
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);

			request.setAttribute("elenco", elenco);
			request.getRequestDispatcher("elenco.jsp").include(request, response);
		
			//response.getWriter().append(sb.toString());
			

		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("titolo") != null) {
			
			if (request.getParameter("genere") != null) {
				Serie s = new Serie(request.getParameter("titolo"), request.getParameter("genere"));
				ctrl.getElenco().add(s);
			} else {
				Serie s = new Serie(request.getParameter("titolo"));
				ctrl.getElenco().add(s);
			}
			
		}
		
		response.sendRedirect("addSerie.jsp");
		
		
	}

}
