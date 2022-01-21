package controller;

import java.util.ArrayList;
import java.util.List;

import model.Serie;

public class SerieCtrl {

	private List<Serie> elenco;

	{//blocco di inizializzazione
		this.elenco = new ArrayList<>();
		this.elenco.add(new Serie("Cobra Kai"));
		this.elenco.add(new Serie("Breaking Bad"));
		this.elenco.add(new Serie("Il trono di spade"));
	}
	
	
	public SerieCtrl() {
		
	}
	
	public List<Serie> getElenco() {
		return elenco;
	}
	
	
	
}
