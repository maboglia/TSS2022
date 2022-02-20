package view;

import java.util.ArrayList;

import controller.StudenteCtrl;
import model.Studente;

public class ProvaStudenti {

	public static void main(String[] args) {
		 
		StudenteCtrl controller = new StudenteCtrl();
		
		controller.addStudente(new Studente("Aurora", "Esposito"));
		controller.addStudente(new Studente("Dora", "Koncz"));
		
		Studente s = controller.getStudenteByMat(2); //ottengo uno studente che inserisco in un contenitore Studente
		
		System.out.println(s);

		ArrayList<Studente> studenti = controller.getStudenti();
		
		for (Studente studente : studenti) {
			System.out.println(studente);
		}
	}

}
