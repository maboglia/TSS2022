package model;

import java.util.ArrayList;

public class Zaino {

	private ArrayList<Oggetto> oggetti;

	public Zaino() {
		this.oggetti = new ArrayList<Oggetto>();
	}
	
	public double getPesoZaino() {
		
		double peso = 0;
		
		for (Oggetto oggetto : oggetti) {
			peso += oggetto.getPeso();
		}
		
		return peso;
		
	}
	
	public ArrayList<Oggetto> getOggetti() {
		return oggetti;
	}

	@Override
	public String toString() {
		return "Zaino [oggetti=" + oggetti + "]";
	}
	
	
}
