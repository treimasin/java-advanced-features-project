package abstraction.abstractclass;

public abstract class Human {
    private String name;

    public void walk() {
        System.out.println("walk method");
    }

    public abstract void eat();

    public abstract void breathe();
}
