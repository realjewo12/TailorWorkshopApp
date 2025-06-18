package test;

import model.Order;
import service.OrderManager;

import java.time.LocalDate;

public class TestOrderManager {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        // Create and add orders
        Order order1 = new Order("Alice", "Uniform", "Cotton", LocalDate.of(2025, 5, 30), 15000.0, "Pending");
        Order order2 = new Order("Bob", "Dress", "Silk", LocalDate.of(2025, 6, 10), 25000.0, "In Progress");

        manager.addOrder(order1);
        manager.addOrder(order2);

        System.out.println("=== Viewing Orders ===");
        manager.viewOrders();

        // Check order list size
        assert manager.getOrders().size() == 2;
        System.out.println("\n✅ OrderManager test passed!");
    }
}
