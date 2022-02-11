package db;

import java.sql.SQLException;
import java.util.List;

import model.Canzone;

public interface CanzoneDAO {

	String ADD = "INSERT INTO canzoni (titolo, cantante, genere, anno) values (?, ?, ?, ?)";

	String GET_ALL = "SELECT * FROM canzoni";
	String GET_ONE = "SELECT * FROM canzoni WHERE id = ";

	String UPDATE_ONE = "UPDATE canzoni SET titolo = ?, cantante = ?, genere = ?, anno = ? WHERE id = ?";
	
	String DELETE_ONE = "DELETE FROM canzoni WHERE id = ";
	
	void addCanzone(Canzone c) throws SQLException; 
	void addCanzone(String titolo, String cantante, String genere, int anno) throws SQLException; 
	void updCanzone(Canzone c) throws SQLException; 
	void delCanzone(int id) throws SQLException; 
	
	Canzone getCanzone(int id) throws SQLException; 
	List<Canzone> getCanzoni() throws SQLException; 
	List<Canzone> getCanzoniByGenere(String genere) throws SQLException; 
	List<Canzone> getCanzoniByCantante(String cantante) throws SQLException; 
	
	
	
	
	
	
}
