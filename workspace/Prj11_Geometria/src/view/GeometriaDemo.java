package view;

import java.util.Random;

import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class GeometriaDemo {

	public static void main(String[] args) {
		
		Punto a = new Punto(2, 3);
		Punto b = new Punto(6, 3);
		Punto c = new Punto(6, 6);
		
		Segmento ab = new Segmento(a, b);
		Segmento bc = new Segmento(b, c);
		Segmento ac = new Segmento(a, c);
		
		System.out.println(ab.lunghezza());
		System.out.println(bc.lunghezza());
		System.out.println(ac.lunghezza());
		
		Triangolo t = new Triangolo(a, b, c);
		
		System.out.println(t.perimetro());
		System.out.println(t.area());
		
		Rettangolo r = new Rettangolo(ab, bc);
		
		System.out.println(r.perimetro());
		System.out.println(r.area());
		
		Quadrato q = new Quadrato(ac);
		
		System.out.println(q.perimetro());
		System.out.println(q.area());

	}

}
