package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.IdGenerator;

public class Client {
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private List<Measurement> measurements = new ArrayList<>();

    // Constructor: ID is now generated automatically
    public Client(String name, String phoneNumber, String address) {
        this.id = IdGenerator.generateId();  // Automatically generate a unique ID
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.measurements = new ArrayList<>();  // Initialize with no measurement
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
    public void addMeasurement(Measurement m) {
        this.measurements.add(m);
    }
    
    public List<Measurement> getMeasurements() {
        return Collections.unmodifiableList(measurements);
    }
    
    public boolean hasMeasurements() {
        return !measurements.isEmpty();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + phoneNumber + ", Address: " + address;
    }

}
