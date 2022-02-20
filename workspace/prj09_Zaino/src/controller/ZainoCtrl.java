package controller;

import model.Oggetto;
import model.Zaino;

public class ZainoCtrl {

	private Zaino zaino;
	
	public ZainoCtrl() {
		this.zaino = new Zaino();
	}
	
	public void addObject(Oggetto o) {
		
		this.zaino.getOggetti().add(o);
		
	}
	
	public double getPeso() {
		return this.zaino.getPesoZaino();
	}
	
	public void stampaZaino() {
		System.out.println(this.zaino);
	}
	
	
}
