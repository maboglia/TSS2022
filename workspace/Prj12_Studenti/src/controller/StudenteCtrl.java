package controller;

import java.util.ArrayList;

import model.Studente;

public class StudenteCtrl {

	private ArrayList<Studente> studenti;
	
	public StudenteCtrl() {
		this.studenti = new ArrayList<>();
	}
	
	/**
	 * metodo per aggiungere uno studente all'elenco di studenti
	 * @param s passare uno studente come parametro
	 */
	public void addStudente(Studente s) {
		this.studenti.add(s);
	}
	
	public ArrayList<Studente> getStudenti () {
		return this.studenti;
	}
	
	public Studente getStudenteByMat (int nMat) {
		for (Studente studente : studenti) {
			if (studente.getnMat() == nMat) {
				return studente;
			}
		}
		return null; 
	}
	
	public void updateStudente (Studente s) {
		//da implementare 
	}
	
	public void deleteStudenteByMat (int nMat) {
		Studente s = getStudenteByMat(nMat); //richiamo un metodo già creato per non ripetere
		if (s != null) {
			System.out.println("vuoi eliminare lo studente " + s);
		}
	}
	
}
