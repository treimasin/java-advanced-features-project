package abstraction.abstractclass;

public abstract class MyAbstractClass {

    // An abstract class can have a field(s)
    private String name;

    // An abstract class can have a method(s)
    public void someMethod() {
        System.out.println(this.name);
    }

    public abstract void abstractMethod(); // this is a method without any body(implementation)


}
