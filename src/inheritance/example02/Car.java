package inheritance.example02;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    // NO-arg / default constructor
    public Car() {

    }

    public String getModel() {
        return this.model;
    }

    public void turnOnEngine() {
        System.out.println("invoked turnOnEngine() -> Car class");
    }
}
