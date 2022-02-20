package controller;

import java.util.ArrayList;

import model.Todo;

public class TodoCtrl {

	//private Todo[] spesa;
	
	private ArrayList<Todo> lista;
	
	
	public TodoCtrl() {
		System.out.println("hai costruito un controller");
		//this.spesa = new Todo[10];
		this.lista = new ArrayList<>();
	}
	
	public void addTodo(String desc, int pos) {
		
		Todo temp = new Todo(desc);
		//this.spesa[pos] = temp;
		this.lista.add(temp);//aggiunge il todo alla fine della lista
	}
	
	public void stampaLista() {
		
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i) != null) {
				
				if (lista.get(i).isCompleto())
					System.out.print("[*]");
				else 
					System.out.print("[ ]");
				
				System.out.println(lista.get(i).getDescrizione());
			}
			
			
		}
		
		
	}
	
	public void completa(int pos) {
		
		if (this.lista.get(pos) != null) {
			this.lista.get(pos).setCompleto(true);
		}
		
		
	}
	
	
}
