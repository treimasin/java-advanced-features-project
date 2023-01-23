package abstraction.abstractclass;

public class Girl extends Human{
    @Override
    public void eat() {
        System.out.println("Girl is eating...");
    }

    @Override
    public void breathe() {
        System.out.println("Girl is breathing...");
    }
}
