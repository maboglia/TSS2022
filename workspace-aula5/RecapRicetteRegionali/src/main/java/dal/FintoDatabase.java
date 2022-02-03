package dal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Ricetta;

public class FintoDatabase {

	public static List<Ricetta> ricetteBase = new ArrayList<>(
			
			Arrays.asList(
					new Ricetta("RISOTTO AL BAROLO", "Piemonte"),
					new Ricetta("BRASATO AL BAROLO", "Piemonte"),
					new Ricetta("FRICIÒ PIEMONTESI", "Piemonte"),
					new Ricetta("CROSTINI AI TARTUFI", "Piemonte")
					
					)
			
			);
	
	
	
	
}
