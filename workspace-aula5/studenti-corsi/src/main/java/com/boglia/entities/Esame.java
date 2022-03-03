package com.boglia.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "esami")
public class Esame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	private String nome;
	private String sigla;
	private int crediti;
	
	@ManyToMany(mappedBy = "esami", fetch = FetchType.LAZY)
	private Set<Studente> studenti = new HashSet<>();
	
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



	public Set<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(Set<Studente> studenti) {
		this.studenti = studenti;
	}
	
	
	
	
	
	
	
	
	
	
	
}
