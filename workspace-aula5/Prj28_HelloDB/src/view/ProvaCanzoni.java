package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

import dal.CanzoneDAO;
import dal.CanzoneDAOImpl;
import model.Canzone;

public class ProvaCanzoni {

	public static void main(String[] args) {

		File f = new File("files/canzoni.CSV");
		CanzoneDAO cd = new CanzoneDAOImpl();
		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {

				String riga = sc.nextLine();

				String[] parole = riga.split(" ; ");

				String titolo = parole[0];
				String cantante = parole[1];

				Canzone c = new Canzone(0, titolo, "pop", cantante);

				try {
					cd.addCanzone(c);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		

	}

}
