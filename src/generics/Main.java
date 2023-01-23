package generics;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        GenericBox<Car> boxWithACarInIt = new GenericBox<Car>(car);

        Garage<Vehicle> garage = new Garage<>(car);
        garage.repairVehicle();


//        SuperGarage<LuxuryCar> superGarage = new SuperGarage<>(new LuxuryCar());

        MacBook macBook1 = new MacBook(5);
        MacBook macBook2 = new MacBook(12);

        if (macBook1.compareTo(macBook2) > 0) {
            System.out.println("Macbook1 is faster");
        } else {
            System.out.println("Macbook2 is faster");
        }

        // We can use super/extends keyword during instantiation as well
        GenericBox<? extends Car> genericBoxExtendsCar = new GenericBox<>(car); // we can pass this constructor here any Car or subclass of it like LuxuryCar
        GenericBox<? extends Car> genericBoxExtendsCar2 = new GenericBox<>(new LuxuryCar());
        GenericBox<? super LuxuryCar> genericBoxSuperLuxuryCar = new GenericBox<>(new LuxuryCar()); // we can pass this constructor any LuxuryCar or superclasses of it like Car
        GenericBox<? super LuxuryCar> genericBoxSuperLuxuryCar2 = new GenericBox<>(car);

        Garage<? super LuxuryCar> superGarage = new Garage<>(new LuxuryCar()); // we can pass this constructor any LuxuryCar or superclasses of it like Car
        Garage<? super LuxuryCar> superGarage2 = new Garage<>(new Car());
        Garage<? extends LuxuryCar> superGarage3 = new Garage<>(new LuxuryCar()); // we can pass this constructor any LuxuryCar or subclasses of it
        // SuperGarage<? extends LuxuryCar> superGarage4 = new SuperGarage<>(new Car());  // we CANNOT pass Car to constructor since Car does not extend LuxuryCar

    }

}
