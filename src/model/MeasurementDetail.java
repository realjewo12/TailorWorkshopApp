package model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MeasurementDetail {
    private final Map<String, SubMeasurement> subMeasurements = new HashMap<>();

    public void add(String subType, double value) {
    	subMeasurements.put(subType, new SubMeasurement(value, "cm", null)); // default to cm
    }

    public SubMeasurement get(String subType) {
        return subMeasurements.get(subType);
    }

    public boolean contains(String subType) {
        return subMeasurements.containsKey(subType);
    }

    public Map<String, SubMeasurement> getAll() {
        return Collections.unmodifiableMap(subMeasurements);
    }

    @Override
    public String toString() {
        return subMeasurements.toString();
    }
}

