package com.boglia.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "viaggi")
public class Viaggio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String destinazione;
	private String genere;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "rel_viaggi_documenti", joinColumns = {
			@JoinColumn(name = "viaggi_id", referencedColumnName = "id", nullable = false, updatable = false)
	}, inverseJoinColumns = {
			@JoinColumn(name = "doc_id", referencedColumnName = "id", nullable = false, updatable = false)
	})
	private Set<Documento> documenti = new HashSet<>();

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

	public Set<Documento> getDocumenti() {
		return documenti;
	}

	public void setDocumenti(Set<Documento> documenti) {
		this.documenti = documenti;
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
		builder.append(", documenti=");
		builder.append(documenti);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
