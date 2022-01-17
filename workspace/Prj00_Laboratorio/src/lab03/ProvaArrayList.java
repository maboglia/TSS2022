package lab03;

import java.util.ArrayList;

public class ProvaArrayList {

	public static void main(String[] args) {
		
		ArrayList<Studente> studenti = new ArrayList<Studente>();
		
		
		
			studenti.add(	new Studente("Daniele Sudosi"));
			studenti.add(	new Studente("Simone Sudosi"));
			studenti.add(	new Studente("Matteo Gamba"));
			studenti.add(	new Studente("Dora Koncz"));
			studenti.add(	new Studente("Aurora Esposito"));
			studenti.add( new Studente("giovanni"));
			
		
		
			for (Studente studente : studenti) {
				System.out.println(studente);
			}
		

	}

}
