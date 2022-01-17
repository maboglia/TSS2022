package view;

import java.util.Random;

import model.Punto;

public class GeometriaDemo {

	public static void main(String[] args) {
		
		Punto random;
		
		Punto a = new Punto();
		Punto b = new Punto(5, 4);
		
		Random r = new Random();
		
		final int RIPETIZIONI = 100;
		
		int counter = 0;
		
//		for (int i = 0; i < RIPETIZIONI; i++) {
			while(  true  ) {
			counter++;
			int casX = r.nextInt(101);
			int casY = r.nextInt(101);
			
			random = new Punto(casX, casY);
			
			if (casX == 0 && casY == 0) {
				System.out.println("hai vinto");
				break;
			}
			
			//System.out.println(random.stampaPunto());
		}
		
		System.out.println(counter);
		
		
//		System.out.println(   a.stampaPunto()      );
//		System.out.println(   b.stampaPunto()      );
		
		

	}

}
