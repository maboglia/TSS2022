package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import model.Articolo;
import model.Movimento;

public class MagazzinoCtrl {

	private Articoli ctrlArticoli;
	private MovimentiCtrl ctrlMovimenti;
	
	public MagazzinoCtrl() {
		this.ctrlArticoli = new Articoli();
		this.ctrlMovimenti = new MovimentiCtrl(new ArrayList<>());
		this.init();
	}
	
	private void init() {
		
		for (   Articolo a : db.Articoli.getAsList()   ) {
			this.ctrlArticoli.addArticolo(a);
		}
		
	}
	
	public Articoli getCtrlArticoli() {
		return ctrlArticoli;
	}
	
	public MovimentiCtrl getCtrlMovimenti() {
		return ctrlMovimenti;
	}
	
	public void caricaMagazzino(Articolo a, int q, String desc) {
		//creo un oggetto di tipo movimento
		Movimento m = new Movimento("carico magazzino " + desc, q, a);
		//aggiungo il movimento alla list di movimenti del ctrl movimenti
		this.ctrlMovimenti.addMovimento(m);
		//modifico la quantita disponibile per l'articolo a
		this.ctrlArticoli.caricaArticolo(a, q);
		
	}
	
	public void scaricaMagazzino(Articolo a, int q, String desc) {
		//creo un oggetto di tipo movimento
		Movimento m = new Movimento("scarico magazzino " + desc, q, a);
		
		//modifico la quantita disponibile per l'articolo a
		if (this.ctrlArticoli.scaricaArticolo(a, q)) {
			//aggiungo il movimento alla list di movimenti del ctrl movimenti
			this.ctrlMovimenti.addMovimento(m);
			
		}
		
	}
	
	
}
