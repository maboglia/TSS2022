package com.boglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boglia.entities.Documento;
import com.boglia.entities.Viaggio;

@Repository
public interface DocRepo extends JpaRepository<Documento, Integer> {

	//derived query
	List<Documento> findByTipo(String tipo);
	
}
