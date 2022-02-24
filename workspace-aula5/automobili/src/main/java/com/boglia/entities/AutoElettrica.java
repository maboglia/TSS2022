package com.boglia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "macchine")
public class AutoElettrica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String modello;
	private double prezzo;
	
	public AutoElettrica() {
		// TODO Auto-generated constructor stub
	}

	public AutoElettrica(int id, String modello, double prezzo) {
		this.id = id;
		this.modello = modello;
		this.prezzo = prezzo;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AutoElettrica [id=");
		builder.append(id);
		builder.append(", modello=");
		builder.append(modello);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
