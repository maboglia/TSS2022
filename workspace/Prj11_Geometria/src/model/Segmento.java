package model;

public class Segmento {

	private Punto a;
	private Punto b;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
	public double lunghezza() {
		
		double lunghezza = 0;
		
		lunghezza = Math.sqrt(    Math.pow(a.y - b.y, 2) + Math.pow(a.x - b.x, 2)    );
		
		return lunghezza;
		
	}
	
	
	
}
