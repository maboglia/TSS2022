package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Articolo;

import java.io.IOException;

/**
 * Servlet implementation class ArticoliMVC
 */
@WebServlet("/articoli")
public class ArticoliMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private MagazzinoCtrl ctrl;
       
    public ArticoliMVC() {
        this.ctrl= new MagazzinoCtrl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setAttribute("articoli", ctrl.getCtrlArticoli().getArticoliList());
		request.getRequestDispatcher("elenco.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
