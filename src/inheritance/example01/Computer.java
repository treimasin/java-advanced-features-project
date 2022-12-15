package inheritance.example01;

public class Computer {
    private String cpu;
    private String ram;
    private String gpu;

    // Constructor
    public Computer(String aCpu, String aRam, String aGpu) {
        this.cpu = aCpu;
        this.ram = aRam;
        this.gpu = aGpu;
    }

    // Methods
    public String getCpu() {
        return this.cpu;
    }

    public String getRam() {
        return this.ram;
    }

    public void configure() {
        System.out.println("Booting...");
        System.out.println("Configure cpu: " + this.cpu);
        System.out.println("Configure ram: " + this.ram);
        System.out.println("Configure gpu: " + this.gpu);
    }

}
