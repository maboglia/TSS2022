package com.boglia.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="viaggi")
public class Viaggio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String destinazione;
	private String genere;
	
	@OneToMany(mappedBy="viaggio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Cliente> cliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Set<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Set<Cliente> cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Viaggio [id=");
		builder.append(id);
		builder.append(", destinazione=");
		builder.append(destinazione);
		builder.append(", genere=");
		builder.append(genere);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
