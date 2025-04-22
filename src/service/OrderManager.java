package service;

import model.Order;
import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
