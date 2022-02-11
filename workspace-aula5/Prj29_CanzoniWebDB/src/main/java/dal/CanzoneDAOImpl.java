package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {

	private ConnessioneOld myc = new ConnessioneOld();
	
	private Connection conn;
	private Statement stat;
	private ResultSet rs;
	
	
	
	@Override
	public void addCanzone(Canzone c) throws SQLException {

		this.conn = this.myc.connetti();
		this.stat = this.conn.createStatement();
		
		this.stat.executeUpdate("insert into canzoni (titolo, cantante, genere, anno) values ("
				+ "'" + c.getTitolo() + "',"
				+ "'" + c.getCantante() + "',"
				+ "'" + c.getGenere() + "',"
				+ "'" + c.getAnno() + "'"
				+ ")");
		System.out.println("canzone aggiunta: " + c);

	}

	@Override
	public void addCanzone(String titolo, String cantante, String genere, int anno) throws SQLException {
		this.conn = this.myc.connetti();
		this.stat = this.conn.createStatement();
		
		this.stat.executeUpdate("insert into canzoni (titolo, cantante, genere, anno) values ("
				+ "'" + titolo + "',"
				+ "'" + cantante + "',"
				+ "'" + genere + "',"
				+ "'" + anno + "'"
				+ ")");
		System.out.println("canzone aggiunta: ");

	}

	@Override
	public void updCanzone(Canzone c) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delCanzone(int id) throws SQLException {
		this.conn = this.myc.connetti();
		this.stat = this.conn.createStatement();
		
		this.stat.executeUpdate("delete from canzoni where id = " + id);
		System.out.println();

	}

	@Override
	public Canzone getCanzoneById(int id) throws SQLException {
		this.conn = this.myc.connetti();
		this.stat = this.conn.createStatement();
		
		String query = "select * from canzoni where id = " + id;
		Canzone c = null;
		this.rs = this.stat.executeQuery(query);
		
		while (this.rs.next()) {
			int idCanzone = this.rs.getInt("id");
			String titolo = this.rs.getString("titolo");
			String cantante = this.rs.getString("cantante");
			String genere = this.rs.getString("genere");
			int anno = this.rs.getInt("anno");
			
			c = new Canzone(idCanzone, titolo, genere, cantante, anno);
		}
		
		return c;
	}

	@Override
	public Canzone getCanzoneByTitolo(String titolo) throws SQLException {
		this.conn = this.myc.connetti();
		this.stat = this.conn.createStatement();
		
		String query = "select * from canzoni where titolo = '" + titolo + "'";
		Canzone c = null;
		this.rs = this.stat.executeQuery(query);
		
		while (this.rs.next()) {
			int idCanzone = this.rs.getInt("id");
			String titoloCanzone = this.rs.getString("titolo");
			String cantante = this.rs.getString("cantante");
			String genere = this.rs.getString("genere");
			int anno = this.rs.getInt("anno");
			
			c = new Canzone(idCanzone, titoloCanzone, genere, cantante, anno);
		}
		
		return c;
	}

	@Override
	public List<Canzone> getCanzoni() throws SQLException {
		List<Canzone> canzoni = new ArrayList<Canzone>();
		
		this.conn = this.myc.connetti();
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(GET_ALL);
		
		while (this.rs.next()) {
			int idCanzone = this.rs.getInt("id");
			String titolo = this.rs.getString("titolo");
			String cantante = this.rs.getString("cantante");
			String genere = this.rs.getString("genere");
			int anno = this.rs.getInt("anno");
			
			Canzone c = null;
			c = new Canzone(idCanzone, titolo, genere, cantante, anno);
			
			canzoni.add(c);
		}
		return canzoni;
	}

}
