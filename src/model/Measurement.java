package model;

import java.util.HashMap;

public class Measurement {
    private HashMap<String, Double> measurements;

    public Measurement() {
        this.measurements = new HashMap<>();
    }

    public void setMeasurement(String key, double value) {
        measurements.put(key, value);
    }

    public Double getMeasurement(String key) {
        return measurements.getOrDefault(key, null);
    }

    public HashMap<String, Double> getAllMeasurements() {
        return measurements;
    }
    
    @Override
    public String toString() {
        return measurements.toString();
    }
}
