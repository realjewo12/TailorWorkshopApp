package test;

import model.Measurement;

import java.util.Scanner;

public class TestMeasurement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Measurement measurement = new Measurement();

        System.out.println("=== Enter Body Measurements ===");

        // Prompt user for key measurements
        System.out.print("Enter bust (cm): ");
        measurement.setMeasurement("bust", scanner.nextDouble());

        System.out.print("Enter waist (cm): ");
        measurement.setMeasurement("waist", scanner.nextDouble());

        System.out.print("Enter hips (cm): ");
        measurement.setMeasurement("hips", scanner.nextDouble());

        System.out.print("Enter inseam (cm): ");
        measurement.setMeasurement("inseam", scanner.nextDouble());

        System.out.println("\n=== Stored Measurements ===");
        for (String key : measurement.getAllMeasurements().keySet()) {
            System.out.println(key + ": " + measurement.getMeasurement(key) + " cm");
        }

        // Individual retrieval test
        System.out.print("\nEnter the name of a measurement to view (e.g., bust): ");
        scanner.nextLine(); // consume leftover newline
        String key = scanner.nextLine();
        Double value = measurement.getMeasurement(key);
        if (value != null) {
            System.out.println(key + ": " + value + " cm");
        } else {
            System.out.println("Measurement for \"" + key + "\" not found.");
        }

        scanner.close();
    }
}
