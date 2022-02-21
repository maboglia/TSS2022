package lab05;

public class Prodotto implements Comparable<Prodotto>{

	String nome;
	double prezzo;
	int colpodifulmine;
	
	public Prodotto(String nome, double prezzo, int colpodifulmine) {
		
		this.nome = nome;
		this.prezzo = prezzo;
		this.colpodifulmine = colpodifulmine;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prodotto [nome=");
		builder.append(nome);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", colpodifulmine=");
		builder.append(colpodifulmine);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Prodotto o) {
		// TODO Auto-generated method stub
		return this.colpodifulmine - o.colpodifulmine  ;
	}
	
	
	
	
}
