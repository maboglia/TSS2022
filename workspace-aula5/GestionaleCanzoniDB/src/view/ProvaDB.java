package view;

import controller.CanzoneCtrl;
import db.OperazioniDB;
import model.Canzone;

public class ProvaDB {

	public static void main(String[] args) {
		
		CanzoneCtrl ctrl = new CanzoneCtrl();
		
//		OperazioniDB.brasaTabella();
		OperazioniDB.ricreaTabella();
		
		OperazioniDB.riempiTabella("files/canzoni2019_.csv", 2019);
		OperazioniDB.riempiTabella("files/canzoni2020_.csv", 2020);
		OperazioniDB.riempiTabella("files/canzoni_2021.csv", 2021);
		
		
		
		//ctrl.addCanzone(new Canzone("brividissimi", "blanco, rosso ", "popppp", 2050));
		

	}

}
