package test;

import model.Measurement;
import service.MeasurementManager;

public class TestMeasurementManager {
    public static void main(String[] args) {
        MeasurementManager manager = new MeasurementManager();

        // Create first measurement
        Measurement m1 = new Measurement();
        m1.setMeasurement("bust", 90.0);
        m1.setMeasurement("waist", 70.0);
        m1.setMeasurement("hips", 95.0);

        // Create second measurement
        Measurement m2 = new Measurement();
        m2.setMeasurement("shoulder", 40.0);
        m2.setMeasurement("sleeve", 60.0);
        m2.setMeasurement("length", 100.0);

        // Add measurements to manager
        manager.addMeasurement("C001", m1);
        manager.addMeasurement("C002", m2);

        // Test getMeasurement
        System.out.println("Get Measurement for C001:");
        Measurement retrieved = manager.getMeasurement("C001");
        if (retrieved != null) {
            for (String key : retrieved.getAllMeasurements().keySet()) {
                System.out.println(key + ": " + retrieved.getMeasurement(key));
            }
        } else {
            System.out.println("No measurements found.");
        }

        // Test viewMeasurement method
        System.out.println("\nView Measurement for C002:");
        manager.viewMeasurement("C002");

        // Test viewing non-existent client
        System.out.println("\nTrying to view Measurement for C999 (non-existent):");
        manager.viewMeasurement("C999");
    }
}
