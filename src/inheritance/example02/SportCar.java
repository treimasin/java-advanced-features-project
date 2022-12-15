package inheritance.example02;

// Below statement is valid for any inheritance relationship:

// Any child class is also a parent class, but not any parent class is the child class
public class SportCar extends Car{

    public SportCar(String model) {
        super(model);
    }

    public void boostSpeed() {
        System.out.println("invoked boostSpeed() -> SportCar");
    }

    @Override
    public void turnOnEngine() {
        System.out.println("invoked turnOnEngine() -> SportCar class");
    }
}
