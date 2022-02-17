package model;

public class Canzone {
	
	private int id;
	private String titolo;
	private Cantante cantante;
	private String genere;
	private int anno;
	
	public Canzone() {
		
	}
	
	public Canzone(int id, String titolo, Cantante cantante, String genere, int anno) {
		this.id = id;
		this.titolo = titolo;
		this.cantante = cantante;
		this.genere = genere;
		this.anno = anno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Cantante getCantante() {
		return cantante;
	}

	public void setCantante(Cantante cantante) {
		this.cantante = cantante;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Canzone [id=");
		builder.append(id);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", cantante=");
		builder.append(cantante);
		builder.append(", genere=");
		builder.append(genere);
		builder.append(", anno=");
		builder.append(anno);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
