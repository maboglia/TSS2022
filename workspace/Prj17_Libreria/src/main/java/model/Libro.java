package model;

public class Libro {

	private static int counter = 1;
	
	private int id;
	private String titolo;
	private double prezzo;
	
	
	public Libro(String titolo, double prezzo) {
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.id = counter++;
	}


	public String getTitolo() {
		return titolo;
	}


	public double getPrezzo() {
		return prezzo;
	}
	
	
	
	
}
