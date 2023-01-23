package nestedclass;

public class Main {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();

        // How to create an instance of an inner class
        OuterClass.InnerClass inner = outerObj.new InnerClass();
        inner.innerMethod();

        // How to create an instance of a nested (static) class
        OuterClass.NestedClass nested = new OuterClass.NestedClass();
        nested.nestedMethod();

        Bicycle myBike = new Bicycle();
        Bicycle.Wheel wheel = myBike.new Wheel(); // there is no point at instantiating an inner class
        wheel.slowDown();

        Bicycle.StaticInnerClass myNestedClass = new Bicycle.StaticInnerClass();
        myNestedClass.doNothing();
    }
}
