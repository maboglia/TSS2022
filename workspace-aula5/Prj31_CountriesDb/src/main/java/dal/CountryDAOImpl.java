package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import entities.Country;

public class CountryDAOImpl implements CountryDAO {

	private Connessione miaConn;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private Map<Integer, Country> paesiMap;
	
	public CountryDAOImpl() {
		
		this.miaConn = new Connessione();
		this.conn = this.miaConn.getConn();
		this.paesiMap = new TreeMap<>();
	}
	
	
	@Override
	public Country getById(int id) {
		try {
			this.ps = this.conn.prepareStatement(FIND_ONE);
			this.ps.setInt(1, id);
			this.rs = this.ps.executeQuery();
		
			while(this.rs.next()) {
				
				Country c = new Country();
				c.setId(rs.getInt("id"));
				c.setStato(rs.getString("stato"));
				c.setCapitale(rs.getString("capitale"));
				c.setBandiera(rs.getString("bandiera"));
				c.setPopolazione(rs.getInt("popolazione"));
				
				return c;
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Country> getAll() {
		List<Country> paesiList = new ArrayList<>();
		try {
			this.ps = this.conn.prepareStatement(FIND_ALL);
			this.rs = this.ps.executeQuery();
		
			while(this.rs.next()) {
				
				Country c = new Country();
				c.setId(rs.getInt("id"));
				c.setStato(rs.getString("stato"));
				c.setCapitale(rs.getString("capitale"));
				c.setBandiera(rs.getString("bandiera"));
				c.setPopolazione(rs.getInt("popolazione"));
				
				paesiList.add(c);
				this.paesiMap.clear();
				this.paesiMap.put(c.getId(), c);
				
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return paesiList;
	}

	@Override
	public void addCountry(Country c) {
		try {
			this.ps = this.conn.prepareStatement(INSERT);
			this.ps.setString(1, c.getStato());
			this.ps.setString(2, c.getCapitale());
			this.ps.setString(3, c.getBandiera());
			this.ps.setInt(4, c.getPopolazione());
			this.ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
