package com.garone.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ricette")
public class Ricetta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String ingredienti;
	private double lipidi;
	private double proteine;
	private double carboidrati;
	private int energia;
	
	public Ricetta() {
	}


	public Ricetta(int id, String nome, String ingredienti, double lipidi, double proteine, double carboidrati,
			int energia) {
		super();
		this.id = id;
		this.nome = nome;
		this.ingredienti = ingredienti;
		this.lipidi = lipidi;
		this.proteine = proteine;
		this.carboidrati = carboidrati;
		this.energia = energia;
	}


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

	public String getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}

	public double getLipidi() {
		return lipidi;
	}

	public void setLipidi(double lipidi) {
		this.lipidi = lipidi;
	}

	public double getProteine() {
		return proteine;
	}

	public void setProteine(double proteine) {
		this.proteine = proteine;
	}

	public double getCarboidrati() {
		return carboidrati;
	}

	public void setCarboidrati(double carboidrati) {
		this.carboidrati = carboidrati;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "Ricetta [id=" + id + ", nome=" + nome + ", alimenti=" + ingredienti + ", lipidi=" + lipidi + ", proteine="
				+ proteine + ", carboidrati=" + carboidrati + ", energia=" + energia + "]";
	}
}
