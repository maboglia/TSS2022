package view;

import controller.ZainoCtrl;
import model.Oggetto;

public class ZainoDemo {

	public static void main(String[] args) {

		ZainoCtrl ctrl = new ZainoCtrl();
		
		Oggetto o1 = new Oggetto("Libro", 1);
		Oggetto o2 = new Oggetto("Portapenne", 2);
		Oggetto o3 = new Oggetto("Righello", 3);
		Oggetto o4 = new Oggetto("Vocabolario", 4);
		Oggetto o5 = new Oggetto("Mappamondo", 5);
		
		ctrl.addObject(o1);
		ctrl.addObject(o2);
		ctrl.addObject(o2);
		ctrl.addObject(o2);
		ctrl.addObject(o2);
		ctrl.addObject(o2);
		ctrl.addObject(o2);
		ctrl.addObject(o3);
		ctrl.addObject(o4);
		ctrl.addObject(o5);
		
		ctrl.stampaZaino();
		System.out.println("Lo zaino pesa " + ctrl.getPeso());
		

	}

}
