package dal;

import java.sql.SQLException;
import java.util.List;

import model.Server;

public interface ServerDAO {

	String FIND_ALL = "select * from servers";
	
	String INSERT = "insert into servers (indirizzo, porta, nome, descrizione) values(?,?,?,?)";
	
	List<Server> getServers() throws SQLException;
	void addServer(Server s)throws SQLException;
	void addServer(String i, String p, String n, String d)throws SQLException;
}
