package com.gamba.studenticorsi.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamba.studenticorsi.entities.Studente;

public interface StudenteDAO extends JpaRepository<Studente, Integer> {

	List<Studente> findByEta(int eta);
	
}
