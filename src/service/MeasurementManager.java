package service;

import model.Measurement;
import model.MeasurementDetail;
import model.MeasurementType;
import model.SubMeasurement;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class MeasurementManager {
    private final HashMap<String, Measurement> clientMeasurements = new HashMap<>();

    // Add or update a client's measurement record
    public void addMeasurement(String clientId, Measurement measurement) {
        clientMeasurements.put(clientId, measurement);
    }

    // Get the full measurement object for a client
    public Measurement getMeasurement(String clientId) {
        return clientMeasurements.get(clientId);
    }

    // View measurements for a given client (formatted output)
    public void viewMeasurement(String clientId) {
        Measurement m = clientMeasurements.get(clientId);
        if (m != null) {
            System.out.println("📏 Measurements for client [" + clientId + "]:");
            EnumMap<MeasurementType, MeasurementDetail> all = new EnumMap<>(m.getAllMeasurements());
            for (Map.Entry<MeasurementType, MeasurementDetail> entry : all.entrySet()) {
                System.out.println("▶ " + entry.getKey());
                Map<String, SubMeasurement> sub = entry.getValue().getAll();
                for (Map.Entry<String, SubMeasurement> s : sub.entrySet()) {
                    System.out.println("   • " + s.getKey() + ": " + s.getValue());
                }
            }
        } else {
            System.out.println("⚠ No measurements found for client [" + clientId + "].");
        }
    }

    // Expose all measurement data
    public Map<String, Measurement> getAllMeasurements() {
        return new HashMap<>(clientMeasurements); // Return a copy for safety
    }
}
