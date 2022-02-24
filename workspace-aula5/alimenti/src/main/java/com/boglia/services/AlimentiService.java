package com.boglia.services;

import java.util.List;

import com.boglia.entities.Alimento;

public interface AlimentiService {

	void addAlimento(Alimento a);
	void updateAlimento(Alimento a);
	void deleteAlimento(int id);
	
	Alimento getAlimentoById(int id);
	List<Alimento> getAlimenti();
	List<Alimento> getAlimentiByCategoria(String categoria);
	List<Alimento> getAlimentiByEnergia(int min, int max);
	
	
}
