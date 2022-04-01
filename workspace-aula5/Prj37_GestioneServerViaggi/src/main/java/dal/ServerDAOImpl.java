package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.Conn;
import model.Server;

public class ServerDAOImpl implements ServerDAO {

	private Connection miaConn;
	
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public List<Server> getServers() throws SQLException {
		miaConn = Conn.getConn();
		ps = miaConn.prepareStatement(FIND_ALL);
		rs = ps.executeQuery();
		
		List<Server> servers = new ArrayList<>();
		
		while (rs.next()) {
			servers.add(new Server(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}
		
		return servers;
	}

	@Override
	public void addServer(Server s) throws SQLException {
		miaConn = Conn.getConn();
		ps = miaConn.prepareStatement(INSERT);
		ps.setString(1, s.getIndirizzo());
		ps.setString(2, s.getPorta());
		ps.setString(3, s.getNome());
		ps.setString(4, s.getDescrizione());
		ps.execute();
	}

	@Override
	public void addServer(String i, String p, String n, String d) throws SQLException {
		miaConn = Conn.getConn();
		ps = miaConn.prepareStatement(INSERT);
		ps.setString(1, i);
		ps.setString(2, p);
		ps.setString(3, n);
		ps.setString(4, d);
		ps.execute();
		
	}



}
