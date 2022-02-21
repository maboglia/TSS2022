package service;

import java.util.List;

import entities.Country;

public interface CountryService {

	Country getById(int id);
	List<Country> getAll();
	void addCountry(Country c);
	
	
}
