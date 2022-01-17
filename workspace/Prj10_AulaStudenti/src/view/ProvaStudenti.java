package view;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import database.DB;
import model.Studente;

public class ProvaStudenti {

	public static void main(String[] args) throws FileNotFoundException {

		DB.inizializza();
		
		ArrayList<Studente> studenti =  DB.getStudenti();
		
		int presenti = 0;
		int assenti = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (Studente studente : studenti) {
			System.out.println("E' presente lo studente");
			System.out.println(studente);
			
			if (sc.nextLine().equalsIgnoreCase("s")) {
				presenti++;
			} else {
				assenti++;
			}
		}
		
		System.out.println("sono presenti " + presenti);
		System.out.println("sono assenti " + assenti);
		

	}

}
