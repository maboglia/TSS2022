package controller;

import java.util.ArrayList;
import java.util.List;

import model.Serie;

public class SerieCtrl {

	private List<Serie> elenco;

	{//blocco di inizializzazione
		this.elenco = new ArrayList<>();
		this.elenco.add(new Serie("Cobra Kai", "azione"));
		this.elenco.add(new Serie("Breaking Bad", "thriller"));
		this.elenco.add(new Serie("Il trono di spade", "fantasy"));
		this.elenco.add(new Serie("WeCrashed"));
		this.elenco.add(new Serie("Our Flag Means Death"));
		this.elenco.add(new Serie("Trigger Point"));
		this.elenco.add(new Serie("The Endgame"));
		this.elenco.add(new Serie("The Marvelous Mrs. Maisel"));
		this.elenco.add(new Serie("Pam and Tommy"));
		this.elenco.add(new Serie("The Responder"));
		this.elenco.add(new Serie("Chosen"));
		this.elenco.add(new Serie("Promised Land"));
		this.elenco.add(new Serie("As We See It"));
		this.elenco.add(new Serie("After Life"));
		this.elenco.add(new Serie("Screw"));
		this.elenco.add(new Serie("Transplant"));
		this.elenco.add(new Serie("All American: Homecoming"));
		this.elenco.add(new Serie("The Woman In The House Across The Street From The Girl In The Window"));
		this.elenco.add(new Serie("Wolf Like Me"));
		this.elenco.add(new Serie("1883"));
		this.elenco.add(new Serie("Suspicion"));
		this.elenco.add(new Serie("The Dropout"));
		this.elenco.add(new Serie("Severance"));
		this.elenco.add(new Serie("Bel-Air"));
		this.elenco.add(new Serie("Somebody Somewhere"));
		this.elenco.add(new Serie("Stay Close"));
		this.elenco.add(new Serie("Landscapers"));
		this.elenco.add(new Serie("Shining Vale"));
		this.elenco.add(new Serie("Super Pumped"));
		this.elenco.add(new Serie("From"));
		this.elenco.add(new Serie("Reacher"));
		this.elenco.add(new Serie("The Gilded Age"));
		this.elenco.add(new Serie("Naomi"));
		this.elenco.add(new Serie("Pivoting"));
		this.elenco.add(new Serie("The Cleaning Lady"));
		this.elenco.add(new Serie("The Book of Boba Fett"));
		this.elenco.add(new Serie("Vikings: Valhalla"));
		this.elenco.add(new Serie("Raising Dion"));
	}
	
	
	public SerieCtrl() {
		
	}
	
	public List<Serie> getElenco() {
		return elenco;
	}
	
	public List<Serie> getElencoByGenere(String genere) {
		List<Serie> serie = new ArrayList<Serie>();
		for (Serie s : elenco) {
			if (s.getGenere().equals(genere)) {
				serie.add(s);
			}
		}
		
		return serie;
	}
	
	
}
