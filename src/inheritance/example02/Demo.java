package inheritance.example02;

public class Demo {
    public static void main(String[] args) {

        // Instantiating a car object (instantiation)
        Car aCar = new Car("Ford");
        System.out.println(aCar.getModel());

        aCar.turnOnEngine();

        System.out.println("========================");

        SportCar aSportCar = new SportCar("Toyota");
        System.out.println(aSportCar.getModel());

        aSportCar.turnOnEngine();
        aSportCar.boostSpeed();

        System.out.println("========================");

        UltraSportCar anUltraSportCar = new UltraSportCar("Subaru", "Nitro-123");
        System.out.println(anUltraSportCar.getModel());
        System.out.println(anUltraSportCar.getNitrogenType());

        anUltraSportCar.turnOnEngine();

        // Both SportCar and UltraSportCar are Car as well.
        // This means we can do something like below:
        Car bSportCar = new SportCar("Alfa-Romeo"); // bSportCar takes the shape(morph) of both SportCar and Car
        Car bUltraSportCar = new UltraSportCar("Peugeot", "Nitro-123");

        // Polymorphism (taking more than two shapes at the same time)
        System.out.println("============== POLYMORPHISM ==============");
        igniteEngine(bSportCar);
        igniteEngine(bUltraSportCar);
        // Using POLYMORPHISM we managed to create one single method(igniteEngine) that should handle any type of car object

        System.out.println("============== NO-POLYMORPHISM ==============");
        igniteEngineForSportCar(aSportCar);
        igniteEngineForUltraSportCar(anUltraSportCar);
    }

    public static void igniteEngine(Car car) {
        car.turnOnEngine();
    }

    public static void igniteEngineForSportCar(SportCar car) {
        car.turnOnEngine();
    }

    public static void igniteEngineForUltraSportCar(UltraSportCar car) {
        car.turnOnEngine();
    }

}
