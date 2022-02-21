package controller;

import java.util.ArrayList;

import model.Dipendente;

public class Dipendenti {

	private ArrayList<Dipendente> libroMatricola;

	public Dipendenti() {
		this.libroMatricola = new ArrayList<>();
	}
	
	
	public void addDipendente(Dipendente d) {
		this.libroMatricola.add(d);
	}
	
	public ArrayList<Dipendente> getLibroMatricola() {
		return libroMatricola;
	}
	
	public Dipendente getDipendenteById(int mat) {
		for (Dipendente dipendente : libroMatricola) {
			if (dipendente.getMatricola() == mat) {
				return dipendente;
			}
		}
		
		return null;
	}
	
	
	
}
