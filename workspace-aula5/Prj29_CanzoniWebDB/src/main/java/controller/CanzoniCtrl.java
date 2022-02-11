package controller;

import java.sql.SQLException;
import java.util.List;

import dal.CanzoneDAO;
import dal.CanzoneDAOImpl;
import model.Canzone;

public class CanzoniCtrl {

	private CanzoneDAO repo = new CanzoneDAOImpl();
	
	
	public void addCanzone(Canzone c) {
		try {
			this.repo.addCanzone(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Canzone> getCantanti(){
		
		try {
			return this.repo.getCanzoni();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	
}
