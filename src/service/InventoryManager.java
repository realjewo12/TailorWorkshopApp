package service;

import model.InventoryItem;
import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<InventoryItem> inventory = new ArrayList<>();

    public void addItem(InventoryItem item) {
        inventory.add(item);
    }

    public void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (InventoryItem item : inventory) {
                System.out.println(item);
            }
        }
    }

    public void checkLowStock(int threshold) {
        for (InventoryItem item : inventory) {
            if (item.getQuantity() <= threshold) {
                System.out.println("Low stock: " + item.getItemName() + " (" + item.getQuantity() + ")");
            }
        }
    }

    public ArrayList<InventoryItem> getInventory() {
        return inventory;
    }
}
