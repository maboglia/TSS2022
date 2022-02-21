package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Prodotto;

/**
 * Servlet implementation class PulisciCarrello
 */
@WebServlet("/delete")
public class PulisciCarrello extends HttpServlet {


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("carrello")!=null) {
			List<Prodotto> prodotti = (List<Prodotto>) request.getSession().getAttribute("carrello");
		
			if (request.getParameter("codProdotto")!=null) {
				int i = Integer.parseInt(request.getParameter("codProdotto"));
				int codice = -1;
				int pos = 0;
				for (Prodotto prodotto : prodotti) {
					if (prodotto.getCodProdotto() == i) {
						codice = pos;
					}
					pos++;
				}
				prodotti.remove(codice);
			}
			request.getSession().setAttribute("carrello", prodotti);
		}
		
		response.sendRedirect("carrello");
	}

}
