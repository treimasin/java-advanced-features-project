package enums;

import static enums.SimpleUnit.*;

public class Main {
    public static void main(String[] args) {
        String name = "Kristo";

        SimpleUnit unit = CENTIMETER;
        System.out.println(unit);
        System.out.println(INCH);
        System.out.println(FOOT);

       ComplexUnit complexUnit = ComplexUnit.INCH;
        System.out.println(complexUnit.convertToMeters());

        System.out.println(Weight.GRAM.type);
        System.out.println(Weight.KILOGRAM.value);

        System.out.println("Printing out KILOGRAM: " + Weight.KILOGRAM);

        // Goal of Enum
        // let's say you have an application that only accepts a predefined(default) set of colors
        // like red, blue, green
        // Developers and users are not allowed to have any other colors

        paint(Color.GREEN);

        System.out.println(Weekday.FRIDAY.order);

        // TODO: Homework
        // Write an application for a traffic light that has RED, GREEN, YELLOW
        // with some message to tell the drivers what to do
        // Simulate a scenario of red light is turned on.
        // Show the driver the message

    }

    public static void paint(Color color) {

        System.out.println("Painting with color: " + color);
    }
}
