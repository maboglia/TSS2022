package controller;

import java.util.ArrayList;

import model.Libro;

public class LibriCtrl {
	
	private ArrayList<Libro> libri;

	public LibriCtrl() {
		
		this.libri = new ArrayList<Libro>();
		
		init();
		
	}
	
	
	public void init() {
		
		this.libri.add(new Libro("Vita", 10));
		this.libri.add(new Libro("Bici", 15));
		this.libri.add(new Libro("Computer", 20));
		this.libri.add(new Libro("Albero", 10));
		this.libri.add(new Libro("Bella", 30));
		
	}
	
	public void addLibro(  String titolo , double prezzo) {
		
		Libro l = new Libro(titolo, prezzo);
		
		libri.add(l);
	}
	

	
	public ArrayList<Libro> getLibri() {
		return libri;
	}
	
	
	
}
