package test;

import model.InventoryItem;

public class TestInventoryItem {
    public static void main(String[] args) {
        // Create an InventoryItem
        InventoryItem thread = new InventoryItem("White Thread", 10, "Thread", 15);

        // Display and verify details
        System.out.println("=== Testing Inventory Item ===");
        System.out.println("Item Name: " + thread.getItemName());
        System.out.println("Quantity: " + thread.getQuantity());
        System.out.println("Category: " + thread.getCategory());
        System.out.println("Threshold: " + thread.getThreshold());

        // Check stock level
        System.out.println("Is Low Stock? " + thread.isLowStock()); // true expected

        // Update quantity
        thread.setQuantity(20);
        System.out.println("\nNew Quantity: " + thread.getQuantity());
        System.out.println("Is Low Stock Now? " + thread.isLowStock()); // false expected

        // Assertions (basic simulation)
        assert thread.getQuantity() == 20;
        assert !thread.isLowStock();

        System.out.println("\n✅ InventoryItem test passed!");
    }
}
