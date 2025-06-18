package service;

import java.util.List;

import model.Client;

public interface ClientService {
	
	void addClient(Client client);
	Client getClientById(String id);
	List<Client> getAllClients();
	
}
