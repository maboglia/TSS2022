package com.boglia.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentiEsami implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@ManyToOne
	@JoinColumn(name = "studente_id")
	private Studente studente;
	
	@ManyToOne
	@JoinColumn(name = "esame_id")
	private Esame esame;
	
	private LocalDateTime dataEsame;
	
	private int voto;

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	public Esame getEsame() {
		return esame;
	}

	public void setEsame(Esame esame) {
		this.esame = esame;
	}

	public LocalDateTime getDataEsame() {
		return dataEsame;
	}

	public void setDataEsame(LocalDateTime dataEsame) {
		this.dataEsame = dataEsame;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	
	
	
	
	
	
}
