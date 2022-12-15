package inheritance.example01;


// Laptop is child/subclass to Computer parent/superclass
// Multiple inheritance is not possible in Java
public class Laptop extends Computer {

    private int battery;

    public Laptop(int battery, String cpu, String ram, String gpu) {
        super(cpu, ram, gpu); // call to superclass (Computer) constructor
        this.battery = battery;
    }

    public void sleep () {
        System.out.println("Laptop is put into sleep...");
    }

    @Override  // This signals to compiler that this configure() is overriding configure() inherited from Computer
    public void configure() {
        System.out.println("Charging laptop...");
        System.out.println("RAM: " + this.getRam());
    }

}
