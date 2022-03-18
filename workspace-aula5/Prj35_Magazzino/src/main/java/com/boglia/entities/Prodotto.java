package com.boglia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "products")
public class Prodotto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private int quantita;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prodotto [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", quantita=");
		builder.append(quantita);
		builder.append("]");
		return builder.toString();
	}
	
	

}
