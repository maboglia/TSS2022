package model;

public class Dirigente extends Dipendente {

	private double emolumenti;
	
	public Dirigente(String nome, String cognome) {
		super(nome, cognome);
		this.emolumenti = 1800;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolaStipendio() {
		// TODO Auto-generated method stub
		return this.emolumenti;
	}

	
	
	
}
