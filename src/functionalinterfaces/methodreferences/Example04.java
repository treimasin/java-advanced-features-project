package functionalinterfaces.methodreferences;

public class Example04 {
    public static void main(String[] args) {
//        ManufactureFunctionalInterface fi = (number) -> {  // lambda expression
//            return new Battery(number);
//        };

        ManufactureFunctionalInterface fi = Battery::new;  // using constructor method

        fi.manufacture(100);

    }
}

@FunctionalInterface
interface ManufactureFunctionalInterface {
    Battery manufacture(int value);


}

class Battery {
    public Battery (int capacity) {
        System.out.println("Battery is created with capacity: " + capacity);
    }
}

