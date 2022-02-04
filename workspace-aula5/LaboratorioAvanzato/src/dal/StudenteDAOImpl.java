package dal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.Studente;

public class StudenteDAOImpl implements StudenteDAO {

	
	private Map<Integer, Studente> studenti;
	
	
	
	public StudenteDAOImpl() {
		
		File f;
		Scanner sc;
		
		f = new File("files/studenti.txt");
		studenti = new TreeMap<>();
		try {
			sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				String riga = sc.nextLine();
				String[] parole = riga.split(",");
				String nome = parole[0];
				String cognome = parole[1];
				
				addStudente(nome, cognome);

				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addStudente(String nome, String cognome) {
		Studente s = new Studente(nome, cognome);
		studenti.put(s.getnMatr(), s);
	}

	@Override
	public List<Studente> getAll() {
		// TODO Auto-generated method stub
		Collection<Studente> values = studenti.values();
		List<Studente> all = new ArrayList<Studente>(values);
		return all;
	}

	@Override
	public Studente getStudenteByMat(int nMatr) {
		// TODO Auto-generated method stub
		return studenti.get(nMatr);
	}

	@Override
	public void updStudente(Studente s) {
		Studente studente = studenti.get(s.getnMatr());
		studente = s;

	}

	@Override
	public void delStudente(int nMatr) {
		studenti.remove(nMatr);

	}

}
