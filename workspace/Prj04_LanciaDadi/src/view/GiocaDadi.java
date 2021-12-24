package view;

import model.Dado;

public class GiocaDadi {// inizio classe

	public static void main(String[] args) {// inizio metodo main

		Dado d1 = new Dado();
		Dado d2 = new Dado(6, "rosso");

		final int NUMERO_LANCI = 1_000_000;
		int contaVittorie = 0;

		long start = System.currentTimeMillis();
		for (int i = 0; i < NUMERO_LANCI; i++) {// inizio for
			int res1 = d1.lancia();
			int res2 = d2.lancia();
			if (res1 == res2) {// inizio if
				//System.out.println("hai vinto con una coppia di " + res1);
				contaVittorie++;
			} // fine if
			else {// inizio else
//				System.out.println("dado 1: " + res1);
//				System.out.println("dado 2: " + res2);
//				System.out.println("non hai vinto, ritenta!!!");
			} // fine else
		} // fine for
		long stop = System.currentTimeMillis();

		System.out.println("l'elaborazione è durata " + (stop - start) + "ms");
		
		System.out.println("hai giocato " + NUMERO_LANCI + " volte");
		System.out.println("hai vinto " + contaVittorie + " volte");
		double percentuale = (double) contaVittorie / NUMERO_LANCI * 100;
		System.out.println("la percentuale di successo è di: " + percentuale + "%");
		
		
	}// fine main

}// fine classe
