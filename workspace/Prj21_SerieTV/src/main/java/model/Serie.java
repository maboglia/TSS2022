package model;

public class Serie {

	private String titolo;

	public Serie() {}
	
	public Serie(String titolo) {
		this.titolo = titolo;
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
