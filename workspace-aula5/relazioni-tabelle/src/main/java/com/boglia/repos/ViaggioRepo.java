package com.boglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Viaggio;

public interface ViaggioRepo extends JpaRepository<Viaggio, Integer> {

	//derived query
	List<Viaggio> findByDestinazione(String destinazione);
	
}
