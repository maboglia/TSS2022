package model;

public class Server {

	private String indirizzo;
	private String porta;
	private String nome;
	private String descrizione;

	public Server(String indirizzo, String porta, String nome, String descrizione) {
		this.indirizzo = indirizzo;
		this.porta = porta;
		this.nome = nome;
		this.descrizione = descrizione;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Server [indirizzo=");
		builder.append(indirizzo);
		builder.append(", porta=");
		builder.append(porta);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
