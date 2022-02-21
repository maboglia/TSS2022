package com.boglia.canzoni.service;

import java.util.List;
import java.util.Optional;

import com.boglia.canzoni.entities.Canzone;

public interface CanzoneService {

	
	void addCanzone(Canzone c);
	void updCanzone(Canzone c);
	void delCanzone(int id);
	
	List<Canzone> getCanzoni();
	List<Canzone> getCanzoniByGenere(String genere);
	List<Canzone> getCanzoniByCantante(String cantante);
	List<Canzone> getCanzoniByTitolo(String titolo);
	
	Optional<Canzone> getCanzoneById(int id);
}
