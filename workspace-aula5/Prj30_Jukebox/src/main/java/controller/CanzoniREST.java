package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Canzone;

import java.io.BufferedReader;
import java.io.IOException;

import org.json.JSONArray;

import com.google.gson.Gson;

/**
 * Servlet implementation class Canzoni
 */



@WebServlet("/api/canzoni")
public class CanzoniREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Jukebox jukebox;
    
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CanzoniREST() {
    	this.jukebox = new Jukebox();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONArray collezioneCanzoni = 
				new JSONArray(this.jukebox.tutteLeCanzoni());
		
		response.setContentType("application/json");
		response.getWriter().append(collezioneCanzoni.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1 mi faccio ritornare un buffer con la string 
		BufferedReader reader = request.getReader();
		
		//2 creo un GSON
		Gson gson = new Gson();
		
		//3 riverso la il buffer nel gson
		Canzone c = gson.fromJson(reader, Canzone.class);
		
		//4 aggiungo la canzone al mio db attraverso il ctrl
		this.jukebox.addCanzone(c);
		
		//5 chiama il metodo doGet per mostrare l'elenco di canzoni
		doGet(request, response);
	}

}
