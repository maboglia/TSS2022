package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class LeggiDivina {

	public static void main(String[] args) {

		File f = new File("files/divina.txt");
		List<String> tutteLeParole = new ArrayList<String>();
		TreeSet<String> singoleParole = new TreeSet<String>();
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
			
				String riga = sc.nextLine();

				String[] parole = riga.split(" ");
				
				for (String parola : parole) {
					if (parola.length() > 3) {
						parola = parola.replace(';', ' ');
						parola = parola.replace(',', ' ');
						parola = parola.replace(':', ' ');
						parola = parola.replace('.', ' ');
						parola = parola.replace('“', ' ');
						parola = parola.replace('”', ' ');
						parola = parola.replace('’', ' ');
						parola = parola.replace('‘', ' ');
						parola = parola.replace('«', ' ');
						parola = parola.replace('»', ' ');
						parola = parola.replace('?', ' ');
						parola = parola.replace('!', ' ');
						parola = parola.trim();
						tutteLeParole.add(parola);//stringhe che si ripetono
						singoleParole.add(parola);//stringhe che non si ripetono
					}
				}
			
			}
			
			System.out.println("la divina commedià contiene " + tutteLeParole.size());
			System.out.println("la divina commedià contiene " + singoleParole.size());
			
			
			File output = new File("files/divina-pulita.txt");
			PrintWriter pw = new PrintWriter(output);
			
			for (String string : singoleParole) {
				pw.println(string);
			}
			pw.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("mi dispiace non trovo il file, forse hai scritto male il nome");
		} catch (ArithmeticException e) {
			System.err.println("c'è qualche problema aritmetico");
		}

		System.out.println("istruzioni successive ....");
		
		
	}

}
