package view;

import controller.GestioneConti;
import model.Cliente;
import model.ContoCorrente;

public class DemoBanca {

	public static void main(String[] args) {

		GestioneConti gc = new GestioneConti();
		
		gc.addCliente("Christian", "De La Fuente", "1999-05-31");
		
		Cliente c = gc.getCliente("Christian", "De La Fuente");
		
		gc.apriConto(c);
		
		ContoCorrente conto = gc.getConto(1);
		
		gc.faiVersamento(100, conto);
		gc.faiVersamento(200, conto);
		gc.faiVersamento(200, conto);
		gc.faiPrelievo(250, conto);
		System.out.println(conto);
		
		

	}

}
