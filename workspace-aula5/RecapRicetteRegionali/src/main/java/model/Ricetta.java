package model;

public class Ricetta {

	private static int counter= 1;
	
	private int id;
	private String nome;
	private String regione;
	
	public Ricetta(String nome, String regione) {
		this.id = counter++;
		this.nome = nome;
		this.regione = regione;
	}

	public Ricetta(String nome) {
		this.id = counter++;
		this.nome = nome;
		this.regione = "imprecisata";
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"id\":");
		builder.append(id);
		builder.append(", \"nome\":");
		builder.append("\"" + nome +"\"");
		builder.append(", \"regione\":");
		builder.append("\"" +regione+"\"");
		builder.append("}");
		return builder.toString();
	}
	
	
	
	
}
