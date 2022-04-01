package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

	private final String USER = "tss_2022";
	private final String PASS = "tss_2022!";
	private final String DB_NAME = "tss_2022";
	private final String HOST = "jdbc:mysql://localhost:3306/" + DB_NAME;

	private static Connection connessione = null;
	
	
	private Conn() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			connessione = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("Connesso!");
		} catch (SQLException e) {
			System.err.println("Errore nella connessione " + e.getMessage());
		}
		
	}
	
	public static Connection getConn() {
		if (connessione != null) {
			return connessione;
		} else 
		{
			Conn conn = new Conn();
			return conn.connessione;
		}
		
		
		
	}
	
	
}
