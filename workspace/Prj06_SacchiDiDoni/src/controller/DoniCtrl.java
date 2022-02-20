package controller;

import model.Babbo;
import model.Dono;
import model.Sacco;

public class DoniCtrl {

	
	Babbo babbo;
	Dono dono;
	Sacco sacco; 
	
	public void aggiungiBabbo(String nome) {
		babbo = new Babbo(nome);
	}
	
	public Babbo getBabbo() {
		return babbo;
	}
	
	public void aggiungiDono(String descrizione, double peso) {
		dono = new Dono(descrizione, peso);
		aggiungiDonoAlSacco();
	}
	
	public Dono getDono() {
		return dono;
	}
	
	public void aggiungiSacco(int id) {
		sacco = new Sacco(id);
	}
	
	public void aggiungiDonoAlSacco(int pos) {
		this.sacco.getDoni()[pos] = this.dono;
	}
	
	public void aggiungiDonoAlSacco() {//overload del metodo
		int pos = primaPosizioneLibera();
		if (pos > -1)
			this.sacco.getDoni()[pos] = this.dono;
		else
			System.out.println("Non c'è posto nel sacco!!!!!!!");
	}
	
	public void assegnaSacco() {
		this.babbo.setSacco(sacco);
	}
	
	public double getPesoSacco() {
		double peso = 0;
		
		for (int i = 0; i < sacco.getDoni().length; i++) {
			if (sacco.getDoni()[i] != null)//NON rischio nullpointerexception
				peso += sacco.getDoni()[i].getPeso();//rischio nullpointerexception
		}//fine for
		return peso;
	}
	
	private int primaPosizioneLibera() {
		
		for (int i = 0; i < sacco.getDoni().length; i++) {
			if (sacco.getDoni()[i] == null)
				return i;
		}
		
		return -1;
	}
	
}
