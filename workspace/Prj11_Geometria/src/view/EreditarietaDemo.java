package view;

import java.util.ArrayList;

import model.Figura;
import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class EreditarietaDemo {

	public static void main(String[] args) {

		ArrayList<Figura> figure = new ArrayList<Figura>();
		
		Punto a = new Punto(2, 3);
		Punto b = new Punto(6, 3);
		Punto c = new Punto(6, 6);
		
		Segmento ab = new Segmento(a, b);
		Segmento bc = new Segmento(b, c);
		Segmento ac = new Segmento(a, c);
		
		figure.add(new Triangolo(a, b, c));
		figure.add(new Triangolo(b, a, c));
		figure.add(new Rettangolo(bc, ac));
		figure.add(new Rettangolo(ab, ac));
		figure.add(new Quadrato(ac));
		figure.add(new Quadrato(ab));

		double superficieComplessiva = 0;
		
		for (Figura figura : figure) {
			superficieComplessiva += figura.area();
			System.out.println(figura);
		}
		
		System.out.println(superficieComplessiva);
		
		
		
		

	}

}
