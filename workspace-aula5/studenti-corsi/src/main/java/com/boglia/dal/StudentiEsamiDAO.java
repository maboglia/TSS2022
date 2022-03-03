package com.boglia.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Esame;
import com.boglia.entities.Studente;
import com.boglia.entities.StudentiEsami;

public interface StudentiEsamiDAO extends JpaRepository<StudentiEsami, Integer> {
	
	

}
