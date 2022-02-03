package service;

import java.util.List;

import model.Ricetta;

public interface RicetteService {
	void addRicetta(Ricetta r);
	void addRicetta(String nome, String regione);

	Ricetta getRicettaById(int id);
	List<Ricetta> getAll();
	List<Ricetta> getRicetteByRegione(String regione);
	
	void updRicetta(Ricetta r);
	
	void delRicetta(int id);
}
