package controller;

import java.sql.SQLException;
import java.util.List;

import model.Canzone;

public interface CanzoneICtrl {

	void addCanzone(Canzone c); 
	void addCanzone(String titolo, String cantante, String genere, int anno); 
	void updCanzone(Canzone c); 
	void delCanzone(int id); 
	
	Canzone getCanzone(int id); 
	List<Canzone> getCanzoni(); 
	List<Canzone> getCanzoniByGenere(String genere); 
	List<Canzone> getCanzoniByCantante(String cantante); 
	
	
}
