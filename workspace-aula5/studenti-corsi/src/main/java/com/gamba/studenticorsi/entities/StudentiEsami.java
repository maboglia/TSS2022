package com.gamba.studenticorsi.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class StudentiEsami implements Serializable{
	
	@Id //chiave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // se la smazza il DATABASE
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "studente_id")
	 private Studente studente;
	
	@ManyToOne
	@JoinColumn(name = "esame_id")
	private Esame esame;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime dataEsame;
	
	private int voto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentiEsami [id=");
		builder.append(id);
		builder.append(", studente=");
		builder.append(studente);
		builder.append(", esame=");
		builder.append(esame);
		builder.append(", dataEsame=");
		builder.append(dataEsame);
		builder.append(", voto=");
		builder.append(voto);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
