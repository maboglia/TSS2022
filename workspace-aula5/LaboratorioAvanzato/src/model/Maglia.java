package model;

public class Maglia extends CapoAbbigliamento {
	
	public Maglia(String descrizione, Taglia taglia) {
		this.descrizione = descrizione;
		this.taglia = taglia;
		this.sigla = "M000-" + this.codArt; 
	}
	
	
	
}
