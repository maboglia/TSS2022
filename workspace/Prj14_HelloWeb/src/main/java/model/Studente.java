package model;

public class Studente {

	private String nome;

	public Studente(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Studente [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
