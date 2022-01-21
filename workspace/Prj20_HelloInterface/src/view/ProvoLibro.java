package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Libro;

public class ProvoLibro {

	public static void main(String[] args) {

		Libro l1 = new Libro("I malavoglia", 12, 120);
		Libro l2 = new Libro("Io robot", 10, 150);
		Libro l3 = new Libro("Guerra e pace", 15, 120);
		Libro l4 = new Libro("Le metamorfosi", 6, 130);
		
		List<Libro> libri = new ArrayList<Libro>();
		
		libri.add(l1);
		libri.add(l2);
		libri.add(l3);
		libri.add(l4);
		
		Collections.sort(libri);
		
		for (Libro libro : libri) {
			System.out.println(libro);
			libro.vola();
		}
		
	}

}
