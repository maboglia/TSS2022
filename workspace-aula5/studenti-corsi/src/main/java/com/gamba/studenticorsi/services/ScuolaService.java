package com.gamba.studenticorsi.services;

import java.util.List;

import com.gamba.studenticorsi.entities.Esame;
import com.gamba.studenticorsi.entities.Studente;
import com.gamba.studenticorsi.entities.StudentiEsami;

public interface ScuolaService {

	void addStudente(Studente s);
	void addEsame(Esame e);
	void addStudenteEsame(StudentiEsami se);
	
	List<Studente> getStudenti();
	List<Esame> getEsami();
	List<StudentiEsami> getStudentiEsami();
	
	List<Esame> getEsameByStudente(Studente s);
	List<Studente> getStudenteByEsame(Esame e);
	
	Studente getStudenteById(int id);
	Esame getEsameById(int id);
	List<StudentiEsami> getEsameByStudenteSuper(Studente s);
	
}
