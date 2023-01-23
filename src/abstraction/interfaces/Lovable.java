package abstraction.interfaces;

public interface Lovable {

    // Abstract methods in an interface are 'public' and 'abstract' by default
    void love(); // eq. public abstract void love();

    // If you want a concrete method in an interface, you have to make it 'default'
    // Better to avoid having concrete(default) methods in an interface
    default void concreteMethod() {

    }

    static int age() {
        return 0;
    }
}
