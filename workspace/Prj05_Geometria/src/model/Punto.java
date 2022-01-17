package model;

public class Punto {

	
	int x;//0
	int y;//0
	
	//costruttore senza argomenti
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	
	//costruttore con argomenti
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Metodo stampa punto per stampare un punto
	 * @return Ritorna la stringa che rappresenta Questo punto p.es (5, 4)
	 */
	public String stampaPunto() {
		return "(" + x + ", " + y +")";// (4, 5) 
	}
}
