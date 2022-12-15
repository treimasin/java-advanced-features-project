package inheritance.example02;

public class UltraSportCar extends Car {

    private String nitrogenType;

    public UltraSportCar(String model, String nitrogenType) {
        super(model); // call to super constructor should always be the first
        this.nitrogenType = nitrogenType;
    }

    public String getNitrogenType() {
        return this.nitrogenType;

    }
    @Override
    public void turnOnEngine() {
        System.out.println("invoked turnOnEngine() -> UltraSportCar class");
    }
}
