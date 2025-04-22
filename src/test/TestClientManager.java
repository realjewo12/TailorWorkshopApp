package test;

import model.Client;
import service.ClientManager;

public class TestClientManager {
    public static void main(String[] args) {
        ClientManager manager = new ClientManager();

        // 1. Add clients
        Client client1 = new Client("Alice", "123-456-789", "123 Fashion Street");
        Client client2 = new Client("Bob", "987-654-321", "456 Style Avenue");
        manager.addClient(client1);
        manager.addClient(client2);

        // 2. View all clients
        System.out.println("=== All Clients ===");
        manager.viewAllClients();

        // 3. Get a specific client
        int idToFind = client1.getId();
        System.out.println("\n=== Retrieve Client by ID ===");
        Client found = manager.getClient(idToFind);
        if (found != null) {
            System.out.println("Found Client: " + found);
        } else {
            System.out.println("Client with ID " + idToFind + " not found.");
        }

        // 4. Delete a client
        int idToDelete = client2.getId();
        System.out.println("\n=== Deleting Client ID " + idToDelete + " ===");
        manager.deleteClient(idToDelete);

        // 5. View all clients after deletion
        System.out.println("\n=== Clients After Deletion ===");
        manager.viewAllClients();

        // 6. Attempt to delete non-existing client
        System.out.println("\n=== Attempt to Delete Non-Existing Client ===");
        manager.deleteClient(999999);  // Should print not found
    }
}
