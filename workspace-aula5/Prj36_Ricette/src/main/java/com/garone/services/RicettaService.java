package com.garone.services;

import java.util.List;

import com.garone.entities.Ricetta;

public interface RicettaService {
	void addRicetta(Ricetta r);
	void updateRicetta(Ricetta r);
	void deleteRicettaById(int id);
	Ricetta getRicettaById(int id);
	List<Ricetta> getRicette();
		
	void addIngrediente(String a);
	List<String> getIngredienti(String ingredienti);
	List<String> getIngredientiByProdotto(String prodotto);
	List<String> getIngredientiByCategoria(String categoria);
}
