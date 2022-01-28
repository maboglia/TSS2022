package controller;

import java.util.ArrayList;
import java.util.List;

import model.Articolo;
import model.Movimento;

public class MovimentiCtrl {

	private List<Movimento> movimentiList;

	public MovimentiCtrl(List<Movimento> movimentiList) {
		
		this.movimentiList = movimentiList;
	}
	
	public void addMovimento(Movimento m) {
		this.movimentiList.add(m);
	}
	
	public List<Movimento> getMovimentiList() {
		return movimentiList;
	}
	
	public List<Movimento> getMovimentiListByArt(Articolo a) {
		List<Movimento> lista = new ArrayList<>();
		
		for (Movimento movimento : this.movimentiList) {
			if(movimento.getArticolo().getId() == a.getId()   ) {
				lista.add(movimento);
			}
		}
		
		return lista;
	}
	
	
}
