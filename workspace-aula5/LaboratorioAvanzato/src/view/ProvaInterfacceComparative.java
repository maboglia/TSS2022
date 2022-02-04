package view;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import controller.Registro;
import model.Studente;

public class ProvaInterfacceComparative {

	
	
	public static void main(String[] args) {
		
		Registro r = new Registro();
		
		List<Studente> tuttiGliStudenti = r.tuttiGliStudenti();
		
		Collections.sort(tuttiGliStudenti, (o1, o2) -> o1.getCognome().compareTo(o2.getCognome()));
		
		tuttiGliStudenti.forEach(s -> System.out.println(s.getCognome()));
		
		System.out.println("------------------------------------------");
		
		Collections.sort(tuttiGliStudenti, (o1, o2) -> o2.getCognome().compareTo(o1.getCognome()));
		
		tuttiGliStudenti.forEach(s -> System.out.println(s.getCognome()));
		

	}

}
