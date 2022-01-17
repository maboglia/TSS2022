package model;

public abstract class Figura {

	public String nome;
	
	public abstract double area();

	@Override
	public String toString() {
		return "Figura [nome=" + nome + ", area()=" + area() + "]";
	}
	
	
}
