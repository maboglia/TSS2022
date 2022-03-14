package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.dal.ProvinciaDAO;
import com.boglia.entities.Provincia;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

	@Autowired
	private ProvinciaDAO repo;
	
	@Override
	public List<String> getRegioni() {
		// TODO Auto-generated method stub
		return repo.findAll().stream()
				.map(p -> p.getRegione())
				.distinct()
				.sorted()
				.toList();
	}

	@Override
	public List<Provincia> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Provincia> getProvinciaByRegione(String regione) {
		// TODO Auto-generated method stub
		return repo.findProvinciaByRegione(regione);
	}

	@Override
	public Provincia getProvinciaByComune(String comune) {
		// TODO Auto-generated method stub
		return repo.findProvinciaByComune(comune);
	}

}
