package model;

public class InventoryItem {

	private String itemName;
    private int quantity;
    private String category; // e.g., fabric, thread, button
    private int threshold;   // minimum quantity before alert

    // Constructor
    public InventoryItem(String itemName, int quantity, String category, int threshold) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = category;
        this.threshold = threshold;
    }

    // Getters and Setters
    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getThreshold() { return threshold; }
    public void setThreshold(int threshold) { this.threshold = threshold; }

    // Optional method
    public boolean isLowStock() {
        return quantity < threshold;
    }
    
    @Override
    public String toString() {
        return "InventoryItem{" +
                "Item Name='" + itemName + '\'' +
                ", Quantity=" + quantity +
                ", Category='" + category + '\'' +
                ", Threshold=" + threshold +
                ", Low Stock=" + (isLowStock() ? "Yes" : "No") +
                '}';
    }

}
