package test;

import model.Order;

import java.time.LocalDate;

public class TestOrder {
    public static void main(String[] args) {
        // Create an Order
        Order order = new Order("Alice", "Dress", "Cotton", LocalDate.of(2025, 5, 30), 15000.0, "Pending");

        // Display and verify values
        System.out.println("=== Testing Order ===");
        System.out.println("Client Name: " + order.getClientName());
        System.out.println("Order Type: " + order.getOrderType());
        System.out.println("Fabric: " + order.getFabric());
        System.out.println("Deadline: " + order.getDeadline());
        System.out.println("Price: " + order.getPrice());
        System.out.println("Status: " + order.getStatus());

        // Update and re-check values
        order.setStatus("In Progress");
        order.setPrice(15500.0);
        System.out.println("\nUpdated Status: " + order.getStatus());
        System.out.println("Updated Price: " + order.getPrice());

        // Assertions (basic simulation)
        assert "Alice".equals(order.getClientName());
        assert order.getPrice() == 15500.0;
        assert "In Progress".equals(order.getStatus());

        System.out.println("\n✅ Order test passed!");
    }
}
