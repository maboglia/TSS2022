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
@Table(name = "documenti")
public class Documento {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String path;
	private String nome;
	private String tipo;
	
	@ManyToMany(mappedBy = "documenti", fetch = FetchType.LAZY)
	private Set<Viaggio> viaggi = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Set<Viaggio> getViaggi() {
		return viaggi;
	}

	public void setViaggi(Set<Viaggio> viaggi) {
		this.viaggi = viaggi;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [id=");
		builder.append(id);
		builder.append(", path=");
		builder.append(path);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", viaggi=");
		builder.append(viaggi);
		builder.append("]");
		return builder.toString();
	}
	
	
}
