package dal;

import java.util.List;

import model.Studente;

public interface StudenteDAO {

	String CORSO = "TSS2022";
	String TAB = "studenti";
	//CRUD su Database
	//CREATE
	void addStudente(String nome, String cognome);
	//READ-RETRIEVE
	List<Studente> getAll();
	Studente getStudenteByMat(int nMatr);
	//UPDATE
	void updStudente(Studente s);
	//DELETE
	void delStudente(int nMatr);
	
	
	
	
}
