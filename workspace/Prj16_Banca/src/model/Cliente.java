package model;

import java.time.LocalDate;
import java.time.ZoneId;

public class Cliente {

	private String nome;
	private String cognome;
	private int eta;
	private LocalDate dataNascita;

	public Cliente(String nome, String cognome, String data) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita=LocalDate.parse(data);
		
		
		LocalDate stop = LocalDate.now( ZoneId.of( "Europe/Rome" ) );
		long years = java.time.temporal.ChronoUnit.YEARS.between( dataNascita , stop );
		
		this.eta = (int) years;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", eta=");
		builder.append(eta);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
