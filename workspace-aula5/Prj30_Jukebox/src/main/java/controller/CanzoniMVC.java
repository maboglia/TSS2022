package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Canzone;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Servlet implementation class Canzoni
 */



@WebServlet("/canzoniMVC")
public class CanzoniMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Jukebox jukebox;
    
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CanzoniMVC() {
    	this.jukebox = new Jukebox();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		for(Canzone c : this.jukebox.tutteLeCanzoni()) {
			sb.append(c);
			
		}
		
		InputStream resource = getServletContext().getResourceAsStream("/WEB-INF/files/prova.txt");
		Scanner sc = new Scanner(resource);
		System.out.println(sc.nextLine());
		
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
