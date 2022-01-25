package lab05;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ProvaMappe {

	public static void main(String[] args) {

		//   Set     List
		Map<String, String[]> capoluoghi = new TreeMap<>();
		
		capoluoghi.put("piemonte", new String[]{"torino", "asti", "cuneo"});
		capoluoghi.put("lombardia", new String[]{"milano", "brescia", "como"});
		capoluoghi.put("lazio", new String[]{"roma", "frosinone", "ostia"});
		
		Set<String> keySet = capoluoghi.keySet();
		Collection<String[]> tuttiICominu = capoluoghi.values();
		
		for (String[] strings : tuttiICominu) {
			System.out.println(strings);
		}
		
		
		
		
		for (String regione : keySet) {
			System.out.println(regione);
			
			List<String> comuni = Arrays.asList(capoluoghi.get(regione));
			Collections.sort(comuni);
			for (String comune : comuni) {
				System.out.println("\t" + comune);
				
			}
			
		}

	}

}
