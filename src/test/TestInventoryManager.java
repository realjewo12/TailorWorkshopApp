package test;

import model.InventoryItem;
import service.InventoryManager;

public class TestInventoryManager {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add inventory items
        InventoryItem fabric = new InventoryItem("Ankara", 5, "Fabric", 10);
        InventoryItem thread = new InventoryItem("Black Thread", 30, "Thread", 15);
        InventoryItem zip = new InventoryItem("Zipper", 3, "Accessory", 5);

        manager.addItem(fabric);
        manager.addItem(thread);
        manager.addItem(zip);

        System.out.println("=== Viewing Inventory ===");
        manager.viewInventory();

        System.out.println("\n=== Checking Low Stock (threshold = 10) ===");
        manager.checkLowStock(10);  // Should trigger fabric and zip

        // Assertion for number of items
        assert manager.getInventory().size() == 3;

        System.out.println("\n✅ InventoryManager test passed!");
    }
}
