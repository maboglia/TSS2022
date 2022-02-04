package controller;

import java.util.List;

import dal.StudenteDAO;
import dal.StudenteDAOImpl;
import model.Studente;

public class Registro {

	private StudenteDAO repo = new StudenteDAOImpl();
	
	public List<Studente> tuttiGliStudenti(){
		return repo.getAll();
	}
	
	
}
