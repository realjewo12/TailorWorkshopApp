package service;

import model.Measurement;
import java.util.HashMap;

public class MeasurementManager {
    private HashMap<String, Measurement> clientMeasurements = new HashMap<>();

    public void addMeasurement(String clientId, Measurement measurement) {
        clientMeasurements.put(clientId, measurement);
    }

    public Measurement getMeasurement(String clientId) {
        return clientMeasurements.get(clientId);
    }

    public void viewMeasurement(String clientId) {
        Measurement m = clientMeasurements.get(clientId);
        if (m != null) {
            System.out.println("Measurements for client " + clientId + ":");
            for (String key : m.getAllMeasurements().keySet()) {
                System.out.println(key + ": " + m.getMeasurement(key));
            }
        } else {
            System.out.println("No measurements found for this client.");
        }
    }

    public HashMap<String, Measurement> getAllMeasurements() {
        return clientMeasurements;
    }
}
