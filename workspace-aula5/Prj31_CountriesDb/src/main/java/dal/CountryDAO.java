package dal;

import java.util.List;

import entities.Country;

public interface CountryDAO {

	String INSERT = "INSERT INTO countries (stato, capitale, bandiera, popolazione) "
			+ "VALUES(?,?,?,?)";
	
	String FIND_ALL = "SELECT * FROM countries";
	String FIND_ONE = "SELECT * FROM countries WHERE id = ?";
	
	Country getById(int id);
	List<Country> getAll();
	
	void addCountry(Country c);
	
	
}
