package controller;

import java.util.ArrayList;

import model.Libro;

public class LibreriaCtrl {

	private static ArrayList<Libro> libri = new ArrayList<>();
	
	public static void addLibro(String titolo, double prezzo) {
		Libro l = new Libro(titolo, prezzo);
		
		libri.add(l);
	}
	
	public static ArrayList<Libro> getLibri() {
		return libri;
	}
	
	
	
	
}
