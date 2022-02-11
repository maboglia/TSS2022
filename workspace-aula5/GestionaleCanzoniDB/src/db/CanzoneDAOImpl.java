package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {

	private Connessione miaConn;
	private Connection conn;
	private Statement stat;
	private ResultSet rs;
	
	
	public CanzoneDAOImpl() {
		this.miaConn = new Connessione();
		this.conn = this.miaConn.connetti();
	}

	@Override
	public void addCanzone(Canzone c) throws SQLException {
		String query = "INSERT INTO canzoni (titolo, cantante, genere, anno) VALUES(";
		query += "'" + c.getTitolo() + "', ";
		query += "'" + c.getCantante() + "', ";
		query += "'" + c.getGenere() + "', ";
		query += "" + c.getAnno() + ")";
		System.out.println(query);
		this.stat = this.conn.createStatement();
		this.stat.executeUpdate(query);
		System.out.println("Record inserito! \n" + c);
	}

	@Override
	public void addCanzone(String titolo, String cantante, String genere, int anno) throws SQLException {
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
	public Canzone getCanzone(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoni() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoniByGenere(String genere) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoniByCantante(String cantante) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
