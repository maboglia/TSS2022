package model;

public class Babbo {

	private String nome;
	private Sacco sacco;
	
	public Babbo(String nome) {
		this.nome = nome;
	}
	
	public Sacco getSacco() {
		return sacco;
	}

	public void setSacco(Sacco sacco) {
		this.sacco = sacco;
	}

	public String getNome() {
		return nome;
	}

	
}
