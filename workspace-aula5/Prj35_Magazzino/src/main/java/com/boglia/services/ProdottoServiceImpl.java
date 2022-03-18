package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.dal.ProdottoDAO;
import com.boglia.entities.Prodotto;

@Service
public class ProdottoServiceImpl implements ProdottoService {

	@Autowired
	private ProdottoDAO repo;
	
	@Override
	public void addProdotto(Prodotto p) {
		repo.save(p);
		System.out.println(p);
	}

	@Override
	public void updProdotto(Prodotto p) {
		repo.save(p);
	}

	@Override
	public void delProdottoById(int id) {
		repo.deleteById(id);
	}

	@Override
	public Prodotto getProdottoById(int id) {
		return repo.getById(id);
	}

	@Override
	public List<Prodotto> getProdotti() {
		return repo.findAll();
	}

	@Override
	public List<Prodotto> getProdottiByMinMax(int min, int max) {
		return repo.findByQuantitaBetween(min, max);
	}

}
