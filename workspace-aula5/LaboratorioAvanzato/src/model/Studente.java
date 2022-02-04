package model;

public class Studente {

	private static int counter = 1;
	
	private int nMatr;
	private String nome;
	private String cognome;
	public Studente(String nome, String cognome) {
		this.nMatr = counter++;
		this.nome = nome;
		this.cognome = cognome;
	}
	public int getnMatr() {
		return nMatr;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Studente [nMatr=");
		builder.append(nMatr);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
