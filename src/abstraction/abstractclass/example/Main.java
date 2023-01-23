package abstraction.abstractclass.example;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Girlfriend gf = new Girlfriend();

        Kristo kristo = new Kristo();

        kristo.showLove(dog);
        kristo.showLove(gf);

    }
}
