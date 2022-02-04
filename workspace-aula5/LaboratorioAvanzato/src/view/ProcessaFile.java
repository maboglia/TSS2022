package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessaFile {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("files/secondipiatti.txt");
		
		Scanner sc = new Scanner(f);
		
		while (sc.hasNextLine()) {
			String nomePiatto =  sc.nextLine();
			
			System.out.println("new Ricetta(\"" + nomePiatto +"\"),");
			
		}
		

	}

}
