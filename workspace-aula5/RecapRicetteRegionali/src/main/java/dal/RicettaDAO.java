package dal;

import java.util.List;

import model.Ricetta;

public interface RicettaDAO {

	//proprietà implicitamente pubbliche e costanti
	String MESSAGGIO = "Le ricette di pippo";
	
	//metodi solo dichiarati: non c'è implementazione
	//implicitamente public e abstract
	
	//crud su db
	
	void addRicetta(Ricetta r);
	void addRicetta(String nome, String regione);

	Ricetta getRicettaById(int id);
	List<Ricetta> getAll();
	List<Ricetta> getRicetteByRegione(String regione);
	
	void updRicetta(Ricetta r);
	
	void delRicetta(int id);
	
	
}
