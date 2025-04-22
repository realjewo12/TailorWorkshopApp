package model;

import java.time.LocalDate;

public class Order {
	
	private String clientName;
    private String orderType; // e.g., dress, uniform
    private String fabric;
    private LocalDate deadline;
    private double price;
    private String status; // e.g., "Pending", "In Progress", "Done"

    // Constructor
    public Order(String clientName, String orderType, String fabric, LocalDate deadline, double price, String status) {
        this.clientName = clientName;
        this.orderType = orderType;
        this.fabric = fabric;
        this.deadline = deadline;
        this.price = price;
        this.status = status;
    }

    // Getters and Setters
    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }

    public String getOrderType() { return orderType; }
    public void setOrderType(String orderType) { this.orderType = orderType; }

    public String getFabric() { return fabric; }
    public void setFabric(String fabric) { this.fabric = fabric; }

    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Order{" +
                "Client='" + clientName + '\'' +
                ", Type='" + orderType + '\'' +
                ", Fabric='" + fabric + '\'' +
                ", Deadline=" + deadline +
                ", Price=" + price +
                ", Status='" + status + '\'' +
                '}';
    }

}
