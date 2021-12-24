package controller;

import model.Esame;

public class Libretto {

	String nomeStudente = "";
	Esame[] esamiSostenuti = new Esame[10];//Array base - non ridimensionabile
	
	public void aggiungiEsame(int pos, int voto, String nomeEsame) {
		
		Esame e = new Esame();
		e.materia = nomeEsame;
		e.voto = voto;
		
		esamiSostenuti[pos] = e;
		
	}
	
	public double calcolaMedia() {
		double totale = 0;
		int contaEsami = 0;
		
		for (int i = 0; i < esamiSostenuti.length; i++) {
			if (esamiSostenuti[i] != null) {
				contaEsami += 1;
				totale += esamiSostenuti[i].voto;
			}
		}
		return totale / contaEsami;
		
	}
	
	
	
}
