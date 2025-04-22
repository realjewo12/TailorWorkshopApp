package model;

import utils.IdGenerator;

public class Client {
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private Measurement measurement;

    // Constructor: ID is now generated automatically
    public Client(String name, String phoneNumber, String address) {
        this.id = IdGenerator.generateId();  // Automatically generate a unique ID
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.measurement = null;  // Initialize with no measurement
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Measurement related methods
    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + phoneNumber + ", Address: " + address;
    }
}
