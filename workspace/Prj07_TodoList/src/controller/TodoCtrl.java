package controller;

import model.Todo;

public class TodoCtrl {

	private Todo[] spesa;
	
	public TodoCtrl() {
		System.out.println("hai costruito un controller");
		this.spesa = new Todo[10];
	}
	
	public void addTodo(String desc, int pos) {
		
		Todo temp = new Todo(desc);
		this.spesa[pos] = temp;
		
	}
	
	public void stampaLista() {
		
		for (int i = 0; i < spesa.length; i++) {
			
			if (spesa[i] != null) {
				
				if (spesa[i].isCompleto())
					System.out.print("[*]");
				else 
					System.out.print("[ ]");
				
				System.out.println(spesa[i].getDescrizione());
			}
			
			
		}
		
		
	}
	
	public void completa(int pos) {
		
		if (this.spesa[pos] != null) {
			this.spesa[pos].setCompleto(true);
		}
		
		
	}
	
	
}
