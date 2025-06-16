package service;

import java.util.ArrayList;
import java.util.List;

import model.Client;

public class ClientManager implements ClientService{
    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public Client getClient(int clientId) {
        for (Client client : clients) {
            if (client.getId() == clientId) {
                return client;
            }
        }
        return null;  // If client not found
    }

    public void deleteClient(int clientId) {
        Client toRemove = null;
        for (Client client : clients) {
            if (client.getId() == clientId) {
                toRemove = client;
                break;
            }
        }
        if (toRemove != null) {
            clients.remove(toRemove);
            System.out.println("Client with ID " + clientId + " has been deleted.");
        } else {
            System.out.println("No client found with ID: " + clientId);
        }
    }

    public void viewAllClients() {
        if (clients.isEmpty()) {
            System.out.println("No clients found.");
            return;
        }
        for (Client client : clients) {
            System.out.println(client);  // toString() method will display client details
        }
    }

    public ArrayList<Client> getAllClients() {
        return (ArrayList<Client>) clients;
    }

	@Override
	public Client getClientById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
