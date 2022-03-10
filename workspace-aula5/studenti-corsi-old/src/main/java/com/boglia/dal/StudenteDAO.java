package com.boglia.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Studente;

public interface StudenteDAO extends JpaRepository<Studente, Integer> {
	
	List<Studente> findByEta(int eta);

}
