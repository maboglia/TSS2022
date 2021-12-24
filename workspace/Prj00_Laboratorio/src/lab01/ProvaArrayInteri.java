package lab01;

public class ProvaArrayInteri {

	public static void main(String[] args) {


		int[] voti = {25,24,26,28,27,29};
		
		double totale = 0;
		
		for (int i = 0; i < voti.length; i++) {
			totale += voti[i];
		}
		
		double media = totale / voti.length;
		
		System.out.println("la media voti è " + media);
		
		

	}

}
