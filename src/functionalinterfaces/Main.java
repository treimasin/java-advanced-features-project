package functionalinterfaces;

public class Main {
    public static void main(String[] args) {

        // Functional interface is a regular interface but with EXACTLY ONE abstract method
        // @FunctionalInterface is added so that we can mark an interface as functional
        // putting this annotation is optional but suggested to prevent adding accidental extra abstract methods
        // It can contain any number of default or static methods

/*        Printable printable = new Printable() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        }; */

        Printable printable2 = message -> {
            System.out.println(message);
        };

        // if method body is only one line, you can remove curly braces
        // if your func. interface method accepts only ONE input argument, you can remove its parenthesis
        Printable printable = (message) -> System.out.println(message);

        printable.print("Hello World");
    }


}
