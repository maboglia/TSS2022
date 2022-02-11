package db;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import model.Canzone;

public class OperazioniDB {

	private static Connection conn;
	private static Connessione miaConn;
	private static Statement stat;
	private static Scanner sc;
	
	private static void esegui(String query) {
		miaConn = new Connessione();
		conn = miaConn.connetti();
		try {
			stat = conn.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void brasaTabella() {
		esegui("DROP TABLE canzoni");
		System.out.println("Tabella eliminata!");
	}
	
	public static void ricreaTabella() {
		File f;
		f = new File("files/create_table_canzoni.txt");
		try {
			sc = new Scanner(f);
			String query = "";
			while (sc.hasNextLine()) {
				query += sc.nextLine();
			}
			esegui(query);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void riempiTabella(String nomeFile, int anno) {
		
		File f;
		f = new File(nomeFile);
		try {
			sc = new Scanner(f);
						
			while (sc.hasNextLine()) {
				String rigaGrezza = sc.nextLine();
				//System.out.println(rigaGrezza);
				if (rigaGrezza.contains(";")) {
					String[] riga = rigaGrezza.split(";");
					//System.out.println(riga);
					
					String titolo = riga[0];
					//System.out.println(titolo);
					String cantante = riga[1];
					//System.out.println(cantante);
					
					Canzone c = new Canzone(titolo, cantante, "pop", anno);
					
					CanzoneDAO cd = new CanzoneDAOImpl();
					cd.addCanzone(c);
					
				}
				
						
			}
		
			System.out.println("importazione terminata");
		
		
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} /**/catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}
