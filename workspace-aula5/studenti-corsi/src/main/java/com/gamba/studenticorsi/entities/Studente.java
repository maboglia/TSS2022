package com.gamba.studenticorsi.entities;

import java.util.HashSet;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "studenti")
public class Studente {
	
	@Id //chiave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // se la smazza il DATABASE
	private Integer id;
	
	private String nome;
	private int eta;
	private double media;
	
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//	@JoinTable(name = "studenti_esami",
//			joinColumns = {
//					@JoinColumn(name = "studente_id", referencedColumnName = "id", nullable = false, updatable = false)
//			}, 
//			inverseJoinColumns = {
//					@JoinColumn(name = "esame_id", referencedColumnName = "id", nullable = false, updatable = false)
//			}
//			)
	@Transient
	@OneToMany(mappedBy = "studente", fetch = FetchType.LAZY)
	private Set<StudentiEsami> esami;

	public Studente() {

	}
	
	
	
	public Studente(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
		this.media = 0;
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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public Set<StudentiEsami> getEsami() {
		return esami;
	}
	
	public void setEsami(Set<StudentiEsami> esami) {
		this.esami = esami;
	}



	public void aggiornaMedia(List<StudentiEsami> list) {
		double tot = 0;
		//1. scorro la lista 
		for (StudentiEsami se : list) {
			
			//2. incremento il totale 
			tot += se.getVoto();
		}
		
		//3.calcolo media
		double media= tot/list.size();
		//4. aggiorno la media dello studente
		setMedia(media);
	}
	
	
	
	
	
}
