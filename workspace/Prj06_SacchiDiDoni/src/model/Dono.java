package model;

public class Dono {

	private String descrizione;
	private double peso;

	public Dono(String descrizione, double peso) {
		this.descrizione = descrizione;
		this.peso = peso;
	}
	
	public String etichetta() {
		return this.descrizione + " " + this.peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
}
