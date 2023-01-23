package generics;

public class SuperGarage <T extends Car> {
    private T item;

    public SuperGarage(T item) {
        this.item = item;
    }

}
