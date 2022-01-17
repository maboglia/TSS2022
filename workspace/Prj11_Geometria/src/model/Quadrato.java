package model;

public class Quadrato extends Rettangolo {

	Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
		this.nome = "Quadrato";
	}

	@Override
	public double perimetro() {
		System.out.println("stai usando il metodo del quadrato");
		return this.lato.lunghezza() * 4;
	}

	
	
}
