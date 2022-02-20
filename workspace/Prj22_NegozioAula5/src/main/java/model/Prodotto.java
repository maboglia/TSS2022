package model;

public class Prodotto implements Cloneable {

	private static int counter  = 0;
	
	private int codProdotto;
	private String nome;
	private double prezzo;
	public Prodotto(String nome, double prezzo) {
		this.codProdotto = ++counter;
		this.nome = nome;
		this.prezzo = prezzo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getCodProdotto() {
		return codProdotto;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
