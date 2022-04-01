package controller;

import java.util.ArrayList;
import java.util.List;

import model.Server;

public class ServerCtrl {

	List<Server> servers = new ArrayList<>();
	
	public void addServer(Server s) {
		servers.add(s);
	}
	
	public List<Server> getServers() {
		return servers;
	}
	
}
