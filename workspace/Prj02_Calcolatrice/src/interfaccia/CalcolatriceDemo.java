package interfaccia;

import java.util.Scanner;

import logica.Calcolatrice;

public class CalcolatriceDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calcolatrice calc = new Calcolatrice();

		System.out.println("inserisci due numeri interi o reali");
		
		System.out.println("inserisci il primo numero");
		double num1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("inserisci il secondo numero");
		double num2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("quale operazione vuoi fare?");
		System.out.println("1) addizione");
		System.out.println("2) sottrazione");
		System.out.println("3) moltiplicazione");
		System.out.println("4) divisione");
		
		String scelta = sc.nextLine();
		
		if (scelta.equals("1")) {
			System.out.println("il risultato è: " );
			System.out.println(calc.addizione(num1, num2));
		}
		else if (scelta.equals("2")) {
			System.out.println("il risultato è: " );
			System.out.println(calc.sottrazione(num1, num2));
		} 
		else if (scelta.equals("3")) {
			System.out.println("il risultato è: " );
			System.out.println(calc.moltiplicazione(num1, num2));
		}
		else if (scelta.equals("4")) {
			System.out.println("il risultato è: " );
			System.out.println(calc.divisione(num1, num2));
		} 
		else {
			System.out.println("Operazione non dispnibile");
		}
			

	}

}
