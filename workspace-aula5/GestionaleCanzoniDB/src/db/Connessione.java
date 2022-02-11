package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	//parametri
	private final String URL = "jdbc:mysql://localhost:3306/tss_2022";
	private final String USER = "root";
	private final String PASS = "V3cch10n3_!";
	
	//oggetto di tipo java.sql.Connection
	Connection conn = null;
	
	public Connection connetti() {
		
		if (conn == null) {
			
			try {
				this.conn = DriverManager.getConnection(URL, USER, PASS);
			} catch (SQLException e) {
				System.err.println("Non connesso: ");
				System.err.println("Il messaggio del server mysql è " + e.getMessage());
			}
		}
		return conn;
	}

	public void disconnetti() {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				System.err.println("Il messaggio del server mysql è " + e.getMessage());
			}
		}
	}
	

}
