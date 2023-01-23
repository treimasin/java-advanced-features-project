package enums;

public enum Weekday {
    SATURDAY(6),
    SUNDAY(7),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5);

    int order;

    Weekday(int order) {
        this.order = order;
    }
}
