package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CountryService;
import service.CountryServiceImpl;

import java.io.IOException;
import java.util.List;

import entities.Country;

/**
 * Servlet implementation class CountryMVC
 */
@WebServlet("/countries")
public class CountryMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CountryService service;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountryMVC() {
    	this.service = new CountryServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Country> all = this.service.getAll();
		
		request.setAttribute("paesi", all);
		request.getRequestDispatcher("elenco.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("stato")!=null) {
			
			String stato = request.getParameter("stato");
			String capitale = request.getParameter("capitale");
			String bandiera = request.getParameter("bandiera");
			int popolazione = Integer.parseInt(request.getParameter("popolazione"));
			
			Country c = new Country(0, stato, capitale, bandiera, popolazione);
			this.service.addCountry(c);
			
		}
		
		
		doGet(request, response);
	}

}
