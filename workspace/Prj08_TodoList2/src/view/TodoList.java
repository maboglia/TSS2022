package view;

import java.util.Scanner;

import controller.TodoCtrl;

public class TodoList {

	private Scanner scanner;
	private TodoCtrl controller;

	public TodoList() {
		this.scanner = new Scanner(System.in);
		this.controller = new TodoCtrl();
	}

	public static void main(String[] args) {

		TodoList tl = new TodoList();

		boolean continua = true;

		while (continua) {

			tl.stampaMenu();

			int scelta = tl.leggiSceltaUtente();

			switch (scelta) {
			case 1:
				// aggiungere todo
				System.out.println("Per aggiungere un nuovo todo, inserisci una stringa descrizione");
				String desc = tl.scanner.next();
				tl.controller.addTodo(desc, 0);
				break;

			case 2:
				// completare todo
				System.out.println("Per completare un todo, scrivi il nuomero intero del todo");
				int pos2 = tl.scanner.nextInt();
				tl.controller.completa(pos2);
				break;
			case 3:
				// stampare lista todo
				System.out.println("Elenco dei todo disponibili");
				tl.controller.stampaLista();
				break;
			case 0:
				System.out.println("scelta 0");
				continua = false;
				break;
			}

		}

//		
//		tl.controller.addTodo("pane", 0);
//		tl.controller.addTodo("vino", 1);
//		tl.controller.addTodo("acqua", 2);
//		tl.controller.addTodo("biscotti", 3);
//		
//		tl.controller.completa(1);
//		
//		tl.controller.stampaLista();

		System.out.println("Grazie per aver usato il ns software");

	}

	private int leggiSceltaUtente() {
		System.out.println("Inserisci un numero intero");
		return this.scanner.nextInt();
	}

	private void stampaMenu() {
		System.out.println("1) Aggiungi todo");
		System.out.println("2) Completa todo");
		System.out.println("3) Stampa elenco todo");
		System.out.println("0) Esci");

	}

}
