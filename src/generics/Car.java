package generics;

public class Car extends Vehicle{
    @Override
    public void repair() {
        System.out.println("Car is repaired");

        Car car = null;
        CarBox boxWithACarInIt = new CarBox(car);
    }
}
