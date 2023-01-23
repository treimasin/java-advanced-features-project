package functionalinterfaces.methodreferences;

public class Example01 {
    public static void main(String[] args) {
//        Displayable displayable = () -> {
//            System.out.println("Hello World");
//        };

        Printer printer = new Printer();

//        Displayable displayable = () -> printer.print();

        // here we are referencing to a method print() of an object printer
        Displayable displayable = printer::print;  //Notice: the line is not calling printer.print() method, we are just REFERENCING it

        displayable.display();  // this is where the print() method is actually called

        // Four types of method references:
        // 1. Method reference to an instance method of an object >>>>> object::instanceMethod
        // 2. Method reference to a static method of a class >>>>> Class::staticMethod
        // 3. Method reference to an instance method of an arbitrary object of a particular type >>>>> Class::instanceMethod
        // 4. Method reference to  a constructor >>>>> Class::new

    }
}


@FunctionalInterface
interface Displayable {
    void display();
}

class Printer {
    public void print () {
        System.out.println("Instance Method");
    }

    public static boolean charge(int amount) {
        System.out.println("Inside static method");
        return true;
    }

}