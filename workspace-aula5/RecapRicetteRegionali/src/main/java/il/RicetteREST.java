package il;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

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
@WebServlet("/api/ricette")
public class RicetteREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RicetteService service = new RicetteServiceImpl();
    /**
     * Default constructor. 
     */
    public RicetteREST() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("application/json");
		
		JSONArray array = new JSONArray();

		if (request.getParameter("ingrediente")!=null) {
			String ingr = request.getParameter("ingrediente");
			List<Ricetta> ricetteFiltrate = service.getAll()
							.stream()
							.filter(r -> r.getNome().contains(ingr))
							.sorted()
							.collect(Collectors.toList());
			
			for (Ricetta r : ricetteFiltrate) {
				JSONObject obj = new JSONObject();
				obj.put("piatto",r.getNome());
				array.put(obj);
			}
			
		} else {
			for (Ricetta r : service.getAll()) {
				JSONObject obj = new JSONObject();
				obj.put("piatto",r.getNome());
				array.put(obj);
			}
			
			
		}		
		
		
		
		response.getWriter().append(array.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
