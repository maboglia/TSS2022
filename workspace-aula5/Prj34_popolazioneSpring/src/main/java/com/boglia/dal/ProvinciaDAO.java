package com.boglia.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boglia.entities.Provincia;

@Repository
public interface ProvinciaDAO extends JpaRepository<Provincia, Integer> {

	List<Provincia> findProvinciaByRegione(String regione);
	Provincia findProvinciaByComune(String comune);
	
}
