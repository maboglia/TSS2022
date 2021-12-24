package view;

import controller.Libretto;

public class GestioneUnito {

	public static void main(String[] args) {

		Libretto libretto52 = new Libretto();
		
		libretto52.aggiungiEsame(0, 28, "Matematica");
		libretto52.aggiungiEsame(1, 26, "Italiano");
		libretto52.aggiungiEsame(2, 24, "Francese");
		
		System.out.println(libretto52.calcolaMedia());
		
		libretto52.aggiungiEsame(3, 29, "Informatica");
		System.out.println(libretto52.calcolaMedia());
		

	}

}
