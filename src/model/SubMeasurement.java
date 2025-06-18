package model;

import java.time.LocalDate;

public class SubMeasurement {
    private final double value;
    private final String unit;
    private final LocalDate date;

    public SubMeasurement(double value, String unit, LocalDate date) {
        if (value < 0) throw new IllegalArgumentException("Measurement value cannot be negative");
        this.value = value;
        this.unit = unit;
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return value + unit + " (on " + date + ")";
    }
}
