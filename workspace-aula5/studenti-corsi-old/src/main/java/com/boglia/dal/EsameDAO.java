package com.boglia.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Esame;
import com.boglia.entities.Studente;

public interface EsameDAO extends JpaRepository<Esame, Integer> {
	
	List<Esame> findByCrediti(int crediti);
	List<Esame> findByNomeContaining(String nome);

}
