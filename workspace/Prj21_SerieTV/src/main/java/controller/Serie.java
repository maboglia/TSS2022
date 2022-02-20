package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/Serie", "/serie"})
public class Serie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SerieCtrl ctrl;
	

	public Serie() {
		this.ctrl = new SerieCtrl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		StringBuilder sb = new StringBuilder("Elenco serie disponibili");
		List<model.Serie> elenco = this.ctrl.getElenco();
		
		for (model.Serie serie : elenco) {
			sb.append(serie);
			sb.append("\n");
		}
		
		
		
		response.getWriter().append(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
