package com.boglia.canzoni.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.canzoni.dal.CanzoneDAO;
import com.boglia.canzoni.entities.Canzone;

@Service
public class CanzoneServiceImpl implements CanzoneService {

	@Autowired
	private CanzoneDAO repo;
	
	
	@Override
	public void addCanzone(Canzone c) {
		this.repo.save(c);

	}

	@Override
	public void updCanzone(Canzone c) {
		this.repo.save(c);

	}

	@Override
	public void delCanzone(int id) {
		this.repo.deleteById(id);

	}

	@Override
	public List<Canzone> getCanzoni() {
		return this.repo.findAll();
	}

	@Override
	public List<Canzone> getCanzoniByGenere(String genere) {
		return this.repo.findByGenere(genere);
	}

	@Override
	public List<Canzone> getCanzoniByCantante(String cantante) {
		return this.repo.findByCantante(cantante);
	}

	@Override
	public List<Canzone> getCanzoniByTitolo(String titolo) {
		return this.repo.findByTitoloContaining(titolo);
	}

	@Override
	public Optional<Canzone> getCanzoneById(int id) {
		return this.repo.findById(id);
	}

}
