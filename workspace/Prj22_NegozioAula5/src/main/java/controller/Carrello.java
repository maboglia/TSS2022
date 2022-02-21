package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Prodotto;

/**
 * Servlet implementation class Carrello
 */
@WebServlet("/carrello")
public class Carrello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Prodotto> prodotti;
	
	
    /**
     * Default constructor. 
     */
    public Carrello() {
    	
    	//this.prodotti = new ArrayList<>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getSession().getAttribute("carrello")!=null) {
			this.prodotti = (List<Prodotto>) request.getSession().getAttribute("carrello");
		} else {//se non c'è lo creo
			this.prodotti = new ArrayList<>();
		}
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		
		//request.setAttribute("prodotti", prodotti);
		request.getSession().setAttribute("prodotti", prodotti);
		request.getRequestDispatcher("carrello.jsp").include(request, response);
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//verifico se c'è nella session un oggetto che si chiama carrello
		if (request.getSession().getAttribute("carrello")!=null) {
			this.prodotti = (List<Prodotto>) request.getSession().getAttribute("carrello");
		}   else {//se non c'è lo creo
			this.prodotti = new ArrayList<>();
		}
		
		if (request.getParameter("codProdotto")!=null) {
			int i = Integer.parseInt(request.getParameter("codProdotto"));
			Prodotto p = DB.getProdotti().get(i);
			
			try {
				if (p!=null)
				this.prodotti.add((Prodotto)p.clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		request.getSession().setAttribute("carrello", this.prodotti);
		doGet(request, response);
	}

}
