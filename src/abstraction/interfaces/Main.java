package abstraction.interfaces;

public class Main {
    public static void main(String[] args) {

        Girl anna = new Girl("Brown", "Anna");

        // Because of polymorphism:
        // 1. a Girl is also a Human
        // 2. a Girl is also a Loveable
        // 3. a Girl is also a Playable
        Human mary = new Girl("White", "Mary");

        Lovable susan = new Girl("Black", "Susie");

        // Let's see what methods are available for each object
        anna.love();   // comes from Lovable
        anna.play();   // comes from Playable
        anna.getSkinColor();    // comes from Human

        mary.getSkinColor();    // comes from Human

        susan.love();   // comes from Lovable

        System.out.println("======================");

        showLove(anna);

        Lovable rex = new Dog(15, "Round");
        showLove(rex);

        // We abstracted a way the love implementation from its definition
        // In other words, we separated(decoupled) HOW from WHAT
        // WHAT: love();
        // HOW: the implementation of the love();
    }

    public static void showLove(Lovable o) {
        o.love();

    }
}
