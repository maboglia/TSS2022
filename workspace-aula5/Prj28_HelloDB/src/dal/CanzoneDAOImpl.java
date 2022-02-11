package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {

	private Connessione myc = new Connessione();
	
	private Connection conn;
	private Statement stat;
	private ResultSet rs;
	
	
	
	@Override
	public void addCanzone(Canzone c) throws SQLException {

		this.conn = this.myc.connetti();
		this.stat = this.conn.createStatement();
		
		this.stat.executeUpdate("insert into canzoni (titolo, cantante, genere) values ("
				+ "'" + c.getTitolo() + "',"
				+ "'" + c.getCantante() + "',"
				+ "'" + c.getGenere() + "'"
				+ ")");
		System.out.println("canzone aggiunta: " + c);

	}

	@Override
	public void addCanzone(String titolo, String cantante, String genere) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updCanzone(Canzone c) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delCanzone(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Canzone getCanzoneById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Canzone getCanzoneByTitolo(String titolo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoni() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
