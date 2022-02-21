package controller;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.Prodotto;

public class DB {

	private static Map<Integer, Prodotto> prodotti = new TreeMap<>();
	
	static {
		
		String[] pizze = {
				"margherita",
				"prosciutto",
				"salsiccia",
				"melanzane",
				"4 formaggi",
				"capricciosa",
		}; 
		
		String[] bevande = {
				"birra piccola",
				"birra media",
				"birra grande",
				"bibite",
				"acqua",
		};
		
		for (String pizza : pizze) {
			double prezzo = 0;
			if (pizza.endsWith("a"))
				prezzo = 5;
			
			if (pizza.endsWith("o"))
				prezzo = 7;
			
			if (pizza.endsWith("i"))
				prezzo = 8;

			if (pizza.endsWith("e"))
				prezzo = 9;

			Prodotto p = new Prodotto("Pizza " + pizza, prezzo);
			
			prodotti.put(p.getCodProdotto(), p);
			
			
			
			
		}
		
		
		for (String bevanda : bevande) {
			Prodotto p = new Prodotto("Bevanda " + bevanda, bevanda.length());
			prodotti.put(p.getCodProdotto(), p);
		}
		
	}
	
	public static Map<Integer, Prodotto> getProdotti() {
		return prodotti;
	}
	
	
	
}
