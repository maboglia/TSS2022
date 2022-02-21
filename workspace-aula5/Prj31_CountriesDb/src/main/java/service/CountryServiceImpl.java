package service;

import java.util.List;
import java.util.Map;

import dal.CountryDAO;
import dal.CountryDAOImpl;
import entities.Country;

public class CountryServiceImpl implements CountryService {

	private CountryDAO repo = new CountryDAOImpl();
	private List<Country> paesiList;
	private Map<Integer, Country> paesiMap;
	
	@Override
	public Country getById(int id) {
		// TODO Auto-generated method stub
		return this.repo.getById(id);
	}

	@Override
	public List<Country> getAll() {
		// TODO Auto-generated method stub
		return this.repo.getAll();
	}

	@Override
	public void addCountry(Country c) {
		// TODO Auto-generated method stub
		this.repo.addCountry(c);
	}

}
