package dal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Ricetta;

public class RicettaDAOImpl implements RicettaDAO {

	//qui avrò l'oggetto Connection
	private List<Ricetta> ricette = FintoDatabase.ricetteBase;
	private Map<Integer, Ricetta> ricetteMap = riempiMappa();
	
	@Override
	public void addRicetta(Ricetta r) {
		this.ricette.add(r);

	}

	private Map<Integer, Ricetta> riempiMappa() {
		Map<Integer, Ricetta> mappa = new HashMap<>();
		for (Ricetta ricetta : ricette) {
			mappa.put(ricetta.getId(), ricetta);
		}
		return mappa;
	}

	@Override
	public void addRicetta(String nome, String regione) {
		this.ricette.add(new Ricetta(nome, regione));
		
	}

	@Override
	public Ricetta getRicettaById(int id) {
		
		return ricetteMap.get(id);
	}

	@Override
	public List<Ricetta> getAll() {
		// TODO Auto-generated method stub
		return ricette;
	}

	@Override
	public List<Ricetta> getRicetteByRegione(String regione) {
		List<Ricetta> ricetteFiltrate = new ArrayList<>();
		for (Ricetta ricetta : ricette) {
			if (ricetta.getRegione().equals(regione))
					ricetteFiltrate.add(ricetta);
		}
		return ricetteFiltrate;
	}

	@Override
	public void updRicetta(Ricetta r) {
		Ricetta ricetta = ricetteMap.get(r.getId()); 
		ricetta = r;
		
	}

	@Override
	public void delRicetta(int id) {
		ricetteMap.remove(id);

	}

	


}
