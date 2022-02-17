package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Cantante;
import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {

	private Connessione connessione;
	private Connection conn;
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	public CanzoneDAOImpl() {
		
		this.connessione = new Connessione();
		this.conn = this.connessione.getConn();
		
		
	}
	
	
	@Override
	public void addCanzone(Canzone c) throws SQLException {

		this.ps = this.conn.prepareStatement(INSERT);
		this.ps.setString(1, c.getTitolo());
		this.ps.setString(2, c.getCantante().getNome());
		this.ps.setString(3, c.getGenere());
		this.ps.setInt(4, c.getAnno());
		
		if (this.ps.execute()) {
			System.out.println("canzone inserita: " + c);
			
		}
		
		
		
	}

	@Override
	public Canzone getCanzoneById(int id) throws SQLException {

		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ONE + id);
		this.rs.next();
		
		Canzone c = new Canzone();
		c.setId(rs.getInt("id"));
		c.setTitolo(rs.getString("titolo"));	
		c.setGenere(rs.getString("genere"));	
		c.setAnno(rs.getInt("anno"));
		c.setCantante(new Cantante(0, rs.getString("cantante")));
		
		
		return c;
	}

	@Override
	public List<Canzone> getCanzoni() throws SQLException {

		List<Canzone> canzoniTemp = new ArrayList<Canzone>();
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ALL);		
		
		while (this.rs.next()) {		
		
		Canzone c = new Canzone();
		c.setId(rs.getInt("id"));
		c.setTitolo(rs.getString("titolo"));	
		c.setGenere(rs.getString("genere"));	
		c.setAnno(rs.getInt("anno"));
		c.setCantante(new Cantante(0, rs.getString("cantante")));
		canzoniTemp.add(c);
		
		}	
				
		return canzoniTemp;
	}

	@Override
	public List<Canzone> getCanzoniByCantante(Cantante c) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
