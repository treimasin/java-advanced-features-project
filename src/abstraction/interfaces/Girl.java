package abstraction.interfaces;

// You have to implement an interface. You can't extend an interface
// You can only extend classes or abstract classes
// Always extends keyword in class definition comes prior to implements

// Multiple inheritance is prohibited in Java, while we can implement more than one interface

public class Girl extends Human implements Lovable, Playable {

    private String name;

    public Girl(String skinColor, String name) {
        super(skinColor);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void love() {
        System.out.println("Showing love to a girl");

    }

    @Override
    public void play() {
        System.out.println("A girl is playing...");

    }
}
