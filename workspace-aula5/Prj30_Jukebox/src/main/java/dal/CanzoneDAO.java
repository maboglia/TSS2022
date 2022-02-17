package dal;

import java.sql.SQLException;
import java.util.List;

import model.Cantante;
import model.Canzone;

public interface CanzoneDAO {
		
	String TAB = "canzoni";
	String ALL = "select * from " + TAB + " ";
	String ONE = "select * from " + TAB + " WHERE id = ";
	String INSERT = "insert into " + TAB + " (titolo, cantante, genere, anno) values(?, ?, ?, ?)";
	
	void addCanzone(Canzone c) throws SQLException;
	
	Canzone getCanzoneById(int id) throws SQLException;
	List<Canzone>  getCanzoni() throws SQLException;
	List<Canzone>  getCanzoniByCantante(Cantante c) throws SQLException;
	
	
	
}
