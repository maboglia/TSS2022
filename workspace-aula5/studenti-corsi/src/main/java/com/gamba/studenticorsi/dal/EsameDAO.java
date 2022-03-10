package com.gamba.studenticorsi.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamba.studenticorsi.entities.Esame;

public interface EsameDAO extends JpaRepository<Esame, Integer> {

	List<Esame> findByCrediti(int crediti);
	List<Esame> findByNomeContaining(String nome);
	
}
