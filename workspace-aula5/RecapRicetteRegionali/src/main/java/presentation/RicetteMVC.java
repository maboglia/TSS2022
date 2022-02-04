package presentation;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ricetta;
import service.RicetteService;
import service.RicetteServiceImpl;

/**
 * Servlet implementation class RicetteREST
 */
@WebServlet("/ricette")
public class RicetteMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RicetteService service = new RicetteServiceImpl();
    /**
     * Default constructor. 
     */
    public RicetteMVC() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		if (request.getParameter("ingrediente")!=null) {
			String ingr = request.getParameter("ingrediente");
			List<Ricetta> ricetteFiltrate = service.getAll()
							.stream()
							.filter(r -> r.getNome().contains(ingr))
							.collect(Collectors.toList());
			
			request.setAttribute("ricette", ricetteFiltrate);
			
		} else {
			request.setAttribute("ricette", service.getAll());
			
		}
		
		
		request.getRequestDispatcher("vistaMVC.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
