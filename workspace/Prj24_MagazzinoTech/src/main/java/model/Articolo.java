package model;

public class Articolo implements Comparable<Articolo> {
	
	private static int counter = 0;
	private int id;
	private String descrizione;
	private int quantita;
	
	public Articolo(String descrizione, int quantita) {
		this.id =counter++;
		this.descrizione = descrizione;
		this.quantita = quantita;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public void incrementa(int q) {
		q = Math.abs(q);
		this.quantita += q;
	}
	
	public boolean decrementa(int q) {
		q = Math.abs(q);
		if (this.quantita >= q) {
			this.quantita -= q;
			return true;
		}
		else 
			System.out.println("operazione non disponibile per insufficienza di pezzi");
		return false;
	}
	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Articolo [descrizione=");
		builder.append(descrizione);
		builder.append(", quantita=");
		builder.append(quantita);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Articolo o) {
		return this.id - o.id;
	}
	
	
	
	
	

}
