package lab01;

public class ProvaInteri {

	public static void main(String[] args) {

		int a;//dichiarazione
		int b = 3;//dichiarazione e inizializzazione
		
		a = 4;//inizializzazione
		b = 4;//è una var posso cambiare valore
		
		final int RIGHE = 10;
		final int COLONNE = 10;

		
		for (int i = 1; i <= RIGHE; i++) {
			//innestare un secondo ciclo for
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//manda a capo dopo ogni
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
//		
//		if (a == b) {//tra tipi primitivi con == confronto il valore
//			System.out.println("a e b sono uguali");
//		} else {
//			System.out.println("a e b sono diversi");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
