package com.gamba.studenticorsi.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamba.studenticorsi.entities.Esame;
import com.gamba.studenticorsi.entities.Studente;
import com.gamba.studenticorsi.entities.StudentiEsami;

public interface StudentiEsamiDAO extends JpaRepository<StudentiEsami, Integer>{

	List<StudentiEsami> findStudenteByEsame(Esame e);
	List<StudentiEsami> findEsameByStudente(Studente s);
	
}
