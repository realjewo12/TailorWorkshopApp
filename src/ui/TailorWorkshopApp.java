package ui;

import java.time.LocalDate;
import java.util.Scanner;

import model.Client;
import model.InventoryItem;
import model.Measurement;
import model.MeasurementType;
import model.Order;
import service.ClientManager;
import service.InventoryManager;
import service.MeasurementManager;
import service.OrderManager;

public class TailorWorkshopApp {
    private static Scanner scanner = new Scanner(System.in);
    private static ClientManager clientManager = new ClientManager();
    private static MeasurementManager measurementManager = new MeasurementManager();
    private static OrderManager orderManager = new OrderManager();
    private static InventoryManager inventoryManager = new InventoryManager();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n=== Tailor Workshop Management ===");
            System.out.println("1. Manage Clients");
            System.out.println("2. Manage Measurements");
            System.out.println("3. Manage Orders");
            System.out.println("4. Manage Inventory");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: manageClients(); break;
                case 2: manageMeasurements(); break;
                case 3: manageOrders(); break;
                case 4: manageInventory(); break;
                case 5: running = false; System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void manageClients() {
        System.out.println("\n--- Client Management ---");
        System.out.println("1. Add New Client");
        System.out.println("2. View All Clients");
        System.out.println("3. Delete Client");
        System.out.print("Choose an option: ");
        int option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1:
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Phone: ");
                String phone = scanner.nextLine();
                System.out.print("Address: ");
                String address = scanner.nextLine();
                Client client = new Client(name, phone, address);
                clientManager.addClient(client);
                System.out.println("Client added with ID: " + client.getId());
                break;
            case 2:
                clientManager.viewAllClients();
                break;
            case 3:
                System.out.print("Enter Client ID to delete: ");
                int idToDelete = Integer.parseInt(scanner.nextLine());
                clientManager.deleteClient(idToDelete);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
    
    private static void manageMeasurements() {
        System.out.println("\n--- Measurement Management ---");
        System.out.print("Enter Client ID: ");
        int clientId = Integer.parseInt(scanner.nextLine());
        Client client = clientManager.getClient(clientId);

        if (client == null) {
            System.out.println("Client not found.");
            return;
        }

        System.out.println("1. Add/Update Measurement");
        System.out.println("2. View Measurement");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            Measurement m = new Measurement();
            System.out.print("Enter number of measurement types (e.g. CHEST, WAIST): ");
            int types = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < types; i++) {
                System.out.print("Measurement Type (e.g. CHEST): ");
                String typeStr = scanner.nextLine().toUpperCase();
                MeasurementType type;
                try {
                    type = MeasurementType.valueOf(typeStr);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid Measurement Type.");
                    continue;
                }

                System.out.print("Number of sub-measurements under " + type + ": ");
                int subCount = Integer.parseInt(scanner.nextLine());

                for (int j = 0; j < subCount; j++) {
                    System.out.print("Sub-measurement name (e.g. ChestFront): ");
                    String subName = scanner.nextLine();
                    System.out.print("Value: ");
                    double value = Double.parseDouble(scanner.nextLine());
                    ((Measurement) m).setMeasurement(type, subName, value);
                }
            }

            client.addMeasurement(m);
            measurementManager.addMeasurement(String.valueOf(client.getId()), m);
            System.out.println("Measurements added for client: " + client.getName());
        } else if (choice == 2) {
            measurementManager.viewMeasurement(String.valueOf(client.getId()));
        } else {
            System.out.println("Invalid option.");
        }
    }


    private static void manageOrders() {
        System.out.println("\n--- Order Management ---");
        System.out.print("Client Name: ");
        String clientName = scanner.nextLine();
        System.out.print("Order Type: ");
        String orderType = scanner.nextLine();
        System.out.print("Fabric: ");
        String fabric = scanner.nextLine();
        System.out.print("Deadline (YYYY-MM-DD): ");
        LocalDate deadline = LocalDate.parse(scanner.nextLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Status (Pending/In Progress/Done): ");
        String status = scanner.nextLine();

        Order order = new Order(clientName, orderType, fabric, deadline, price, status);
        orderManager.addOrder(order);
        System.out.println("Order added.");
    }
    
    private static void manageInventory() {
        System.out.println("\n--- Inventory Management ---");
        System.out.println("1. Add Item");
        System.out.println("2. View Inventory");
        System.out.println("3. Check Low Stock");
        int option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1:
                System.out.print("Item Name: ");
                String name = scanner.nextLine();
                System.out.print("Quantity: ");
                int qty = Integer.parseInt(scanner.nextLine());
                System.out.print("Category: ");
                String category = scanner.nextLine();
                System.out.print("Threshold: ");
                int threshold = Integer.parseInt(scanner.nextLine());
                InventoryItem item = new InventoryItem(name, qty, category, threshold);
                inventoryManager.addItem(item);
                break;
            case 2:
                inventoryManager.viewInventory();
                break;
            case 3:
                System.out.print("Enter threshold value: ");
                int t = Integer.parseInt(scanner.nextLine());
                inventoryManager.checkLowStock(t);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    
}
