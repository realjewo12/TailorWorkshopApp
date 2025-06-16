package test;

import model.Measurement;
import model.MeasurementType;
import model.SubMeasurement;

import java.util.Scanner;

public class TestMeasurement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Measurement measurement = new Measurement();

        System.out.println("=== Enter Body Measurements ===");

        // Prompt user for key measurements
        System.out.print("Enter bust (cm): ");
        measurement.setMeasurement(MeasurementType.CHEST, "bust", scanner.nextDouble());

        System.out.print("Enter waist (cm): ");
        measurement.setMeasurement(MeasurementType.WAIST, "waist", scanner.nextDouble());

        System.out.print("Enter hips (cm): ");
        measurement.setMeasurement(MeasurementType.HIP, "hips", scanner.nextDouble());

        System.out.print("Enter inseam (cm): ");
        measurement.setMeasurement(MeasurementType.INLEG, "inleg", scanner.nextDouble());

        System.out.println("\n=== Stored Measurements ===");
        for (MeasurementType key : measurement.getAllMeasurements().keySet()) {
            System.out.println(key + ": " + measurement.getMeasurement(key, "leg") + " cm");
        }

        // Individual retrieval test
        System.out.print("\nEnter the name of a measurement to view (e.g., bust): ");
        scanner.nextLine(); // consume leftover newline
        String key = scanner.nextLine();
        SubMeasurement value = measurement.getMeasurement(MeasurementType.HIP, key);
        if (value != null) {
            System.out.println(key + ": " + value + " cm");
        } else {
            System.out.println("Measurement for \"" + key + "\" not found.");
        }

        scanner.close();
    }
}
