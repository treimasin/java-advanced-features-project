package inheritance.example01;

public class Demo {
    public static void main(String[] args) {
        Computer aComputer = new Computer("8-core", "16GB", "64GB");
        aComputer.getCpu();

        Laptop aLaptop = new Laptop(100, "10-core", "32GB", "128GB");
        System.out.println(aLaptop.getCpu());

        aLaptop.configure();  // configure is inherited from Computer

    }
}
