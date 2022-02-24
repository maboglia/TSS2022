package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.dal.AlimentoDAO;
import com.boglia.entities.Alimento;

@Service
public class AlimentoServiceImpl implements AlimentiService {

	@Autowired
	private AlimentoDAO repo;
	
	@Override
	public void addAlimento(Alimento a) {
		this.repo.save(a);
	}

	@Override
	public void updateAlimento(Alimento a) {
		this.repo.save(a);
	}

	@Override
	public void deleteAlimento(int id) {
		this.repo.deleteById(id);
	}

	@Override
	public Alimento getAlimentoById(int id) {
		// TODO Auto-generated method stub
		if (this.repo.findById(id).isPresent())
			return this.repo.findById(id).get();
		else 
			return new Alimento();
	}

	@Override
	public List<Alimento> getAlimenti() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public List<Alimento> getAlimentiByCategoria(String categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alimento> getAlimentiByEnergia(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

}
