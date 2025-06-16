package model;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

public class Measurement {
    private final EnumMap<MeasurementType, MeasurementDetail> measurements;

    public Measurement() {
        this.measurements = new EnumMap<>(MeasurementType.class);
    }

    public void addMeasurement(MeasurementType type, String subType, double value, String unit) {
        measurements
            .computeIfAbsent(type, k -> new MeasurementDetail())
            .add(subType, value);
    }

    public SubMeasurement getMeasurement(MeasurementType type, String subType) {
        MeasurementDetail detail = measurements.get(type);
        return detail != null ? detail.get(subType) : null;
    }

    public MeasurementDetail getDetail(MeasurementType type) {
        return measurements.get(type);
    }

    public boolean hasMeasurement(MeasurementType type, String subType) {
        MeasurementDetail detail = measurements.get(type);
        return detail != null && detail.contains(subType);
    }

    public Map<MeasurementType, MeasurementDetail> getAllMeasurements() {
        return Collections.unmodifiableMap(measurements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Measurements:\n");
        for (var entry : measurements.entrySet()) {
            sb.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public void setMeasurement(MeasurementType type, String subType, double value) {
        measurements.putIfAbsent(type, new MeasurementDetail()); // create the category if absent
        measurements.get(type).add(subType, value); // add or update sub-measurement
    }
}
