package model;

public class Serie {

	private String titolo;
	private String genere;

	public Serie() {}
	
	public Serie(String titolo) {
		this.titolo = titolo;
		this.genere = "drama";
	}
	
	public Serie(String titolo, String genere) {
		this.titolo = titolo;
		this.genere = genere;
	}

	public String getGenere() {
		return genere;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [titolo=");
		builder.append(titolo);
		builder.append("]");
		return builder.toString();
	}
	
}
