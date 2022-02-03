package service;

import java.util.List;

import dal.RicettaDAO;
import dal.RicettaDAOImpl;
import model.Ricetta;

public class RicetteServiceImpl implements RicetteService {

	RicettaDAO repo = new RicettaDAOImpl();
	
	@Override
	public void addRicetta(Ricetta r) {
		repo.addRicetta(r);

	}

	@Override
	public void addRicetta(String nome, String regione) {
		repo.addRicetta(nome, regione);

	}

	@Override
	public Ricetta getRicettaById(int id) {
		
		return repo.getRicettaById(id);
	}

	@Override
	public List<Ricetta> getAll() {
		// TODO Auto-generated method stub
		return repo.getAll();
	}

	@Override
	public List<Ricetta> getRicetteByRegione(String regione) {
		// TODO Auto-generated method stub
		return repo.getRicetteByRegione(regione);
	}

	@Override
	public void updRicetta(Ricetta r) {
		// TODO Auto-generated method stub
		repo.updRicetta(r);
	}

	@Override
	public void delRicetta(int id) {
		// TODO Auto-generated method stub
		repo.delRicetta(id);
	}

}
