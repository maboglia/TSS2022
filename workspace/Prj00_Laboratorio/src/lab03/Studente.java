package lab03;

public class Studente {

	private static int contatore = 1;
	private int matricola;
	private String nome;
	
	
//	public Studente() {}
	
	public Studente(String nome) {
		this.matricola = contatore++;
		this.nome = nome;
	}
	
	
	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "" + matricola + ") " + nome + "";
	}

	
	
	
	
}
