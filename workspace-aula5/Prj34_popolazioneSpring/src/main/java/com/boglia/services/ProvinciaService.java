package com.boglia.services;

import java.util.List;

import com.boglia.entities.Provincia;

public interface ProvinciaService {

	List<String> getRegioni();
	
	List<Provincia> getAll();
	List<Provincia> getProvinciaByRegione(String regione);
	Provincia getProvinciaByComune(String comune);
	
	
}
