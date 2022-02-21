package lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Scrivere {

	public static void main(String[] args) {

		String[] note = {
				"do",
				"re",
				"mi",
				"fa",
				"sol",
				"la",
				"si",
		};
		
		File f = new File("C:\\Users\\teacher\\Desktop\\note.txt");
		
		try {
			PrintStream ps = new PrintStream(f);
			
			for (String nota : note) {
				ps.println(nota);
			}
			
			ps.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
