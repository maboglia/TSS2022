package interfaccia;

import java.util.Scanner;

import logica.Calcolatrice;

public class ProvaCalcolatrici {

	public static void main(String[] args) {

		//dichiarazione assegnazione  inizializzazione  
		Calcolatrice calc1 = new Calcolatrice();//metodo costruttore
		
		double res = calc1.addizione(12.5, 13.7);
		
		System.out.println(res);
		
		
		Calcolatrice calc2 = new Calcolatrice();
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("benvenuto nella calcolatrice super!");

		
		System.out.println("inserisci il primo addendo");
		double add1 = scan1.nextDouble();
		scan1.nextLine();//consuma il fine linea
		
		System.out.println("inserisci il secondo addendo");
		double add2 = scan1.nextDouble();
		scan1.nextLine();//consuma il fine linea
		
		System.out.println("Il risultato è: ");
		System.out.println(        calc2.addizione(add1, add2)       );
		System.out.println(        calc2.sottrazione(add1, add2)       );
		System.out.println(        calc2.moltiplicazione(add1, add2)       );
		System.out.println(        calc2.divisione(add1, add2)       );
		
	}

}
