package com.garone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.garone.dal.RicettaDAO;
import com.garone.entities.Ricetta;

@Service
public class RicettaServiceImpl implements RicettaService{
	@Autowired
	private RicettaDAO repo;
	
	@Override
	public void addRicetta(Ricetta r) {
		repo.save(r);
		
	}

	@Override
	public void updateRicetta(Ricetta r) {
		repo.save(r);
		
	}

	@Override
	public Ricetta getRicettaById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Ricetta> getRicette() {
		return repo.findAll();
	}

	@Override
	public void deleteRicettaById(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<String> getIngredienti(String i) {
		String[] ingredienti = i.split(";");
		return null;
	}

	@Override
	public void addIngrediente(String a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getIngredientiByProdotto(String prodotto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getIngredientiByCategoria(String categoria) {
		// TODO Auto-generated method stub
		return null;
	}


}
