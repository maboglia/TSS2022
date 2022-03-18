package com.boglia.services;

import java.util.List;

import com.boglia.entities.Prodotto;

public interface ProdottoService {

	void addProdotto(Prodotto p);
	void updProdotto(Prodotto p);
	void delProdottoById(int id);
	
	Prodotto getProdottoById(int id);
	List<Prodotto> getProdotti();
	List<Prodotto> getProdottiByMinMax(int min, int max);
	
	
	
}
