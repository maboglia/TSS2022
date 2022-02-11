package controller;

import java.sql.SQLException;
import java.util.List;

import db.CanzoneDAO;
import db.CanzoneDAOImpl;
import model.Canzone;

public class CanzoneCtrl implements CanzoneICtrl {

	private CanzoneDAO repo = new CanzoneDAOImpl();
	
	
	@Override
	public void addCanzone(Canzone c) {
		try {
			this.repo.addCanzone(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void addCanzone(String titolo, String cantante, String genere, int anno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updCanzone(Canzone c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delCanzone(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Canzone getCanzone(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoni() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoniByGenere(String genere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoniByCantante(String cantante) {
		// TODO Auto-generated method stub
		return null;
	}

}
