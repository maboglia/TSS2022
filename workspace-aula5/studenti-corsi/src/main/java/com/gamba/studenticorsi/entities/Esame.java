package com.gamba.studenticorsi.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "esami")
public class Esame {
	
	@Id //chiave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // se la smazza il DATABASE
	private Integer id;
	
	private String nome;
	private String sigla;
	private int crediti;
	
	@Transient
	@OneToMany(mappedBy = "esame", fetch = FetchType.LAZY) // LAZY = ritardato
	private Set<StudentiEsami> studenti;
	
	public Esame() {
		// TODO Auto-generated constructor stub
	}

	public Esame(String nome, String sigla, int crediti) {
		this.nome = nome;
		this.sigla = sigla;
		this.crediti = crediti;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getCrediti() {
		return crediti;
	}

	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}
	
	public Set<StudentiEsami> getStudenti() {
		return studenti;
	}

	public void setStudenti(Set<StudentiEsami> studenti) {
		this.studenti = studenti;
	}

	
	
	
	
}
