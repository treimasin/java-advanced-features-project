package generics;

public class Garage<T extends Vehicle> {

    // T can be Vehicle or any subclasses of it
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public void repairVehicle() {
        vehicle.repair();
    }

}
