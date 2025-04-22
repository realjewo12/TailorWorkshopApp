package test;

import model.Client;
import model.Measurement;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Collect user input for Client details (no need for ID, it will be auto-generated)
        System.out.println("Enter Client Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Client Phone Number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter Client Address:");
        String address = scanner.nextLine();

        // Create a new Client with user input (ID will be auto-generated)
        Client client = new Client(name, phoneNumber, address);

        // Display the Client details
        System.out.println("\nClient Details:");
        System.out.println("ID: " + client.getId());  // This will show the auto-generated ID
        System.out.println("Name: " + client.getName());
        System.out.println("Phone: " + client.getPhoneNumber());
        System.out.println("Address: " + client.getAddress());

        // Test the toString() method
        System.out.println("\nClient toString(): " + client);

        // Ask for updated details and modify using setters
        System.out.println("\nEnter updated Client Phone Number:");
        client.setPhoneNumber(scanner.nextLine());

        System.out.println("Enter updated Client Address:");
        client.setAddress(scanner.nextLine());

        // Display the updated details
        System.out.println("\nUpdated Client Details:");
        System.out.println("Updated Phone: " + client.getPhoneNumber());
        System.out.println("Updated Address: " + client.getAddress());

        // Test setting a measurement
        System.out.println("\nSetting Measurement for Client...");
        Measurement measurement = new Measurement();  // Assume the Measurement class has a constructor or method for setting values
        client.setMeasurement(measurement);
        System.out.println("Measurement for Client: " + client.getMeasurement());  // Output the measurement object

        // Close the scanner
        scanner.close();
    }
}
