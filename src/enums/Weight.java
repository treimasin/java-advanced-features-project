package enums;

public enum Weight {
    GRAM(1000, "metrics"),
    KILOGRAM(1, "imperial");

    double value;
    String type;

    Weight(double value, String type) {
        this.value = value;
        this.type = type;
    }
}

