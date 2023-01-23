package abstraction.interfaces;

public class Dog extends Animal implements Lovable{

    private String collarShape;

    public Dog(int age, String collarShape) {
        super(age);
        this.collarShape = collarShape;
    }

    public String getCollarShape() {
        return collarShape;

    }

    @Override
    public void love() {
        System.out.println("Showing love to a dog");

    }
}
