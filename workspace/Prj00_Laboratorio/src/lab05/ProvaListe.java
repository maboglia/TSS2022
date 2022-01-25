package lab05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ProvaListe {

	public static void main(String[] args) {


		List<Integer> voti = new ArrayList<>();
		List<Integer> voti2 = new Vector<>();
		List<Integer> voti3 = new LinkedList<>();
		
		voti3.add(2);
		voti3.add(4);
		voti3.add(6);
		voti3.add(8);
		
		voti3.forEach(voto -> System.out.println(voto) );
		
		for (Integer voto : voti3) {System.out.println(voto);}
		
		for (int i = 0; i < voti3.size(); i++) {System.out.println(voti3.get(i));}
		
	}

}
