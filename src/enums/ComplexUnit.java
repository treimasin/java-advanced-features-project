package enums;

public enum ComplexUnit {
    CENTIMETER(10),
    INCH(2.3),
    FOOT(2.3),
    METER(1);

    private double value;
    ComplexUnit(double value) {
        this.value = value;
    }

    double convertToMeters() {
        return value;
    }
}
