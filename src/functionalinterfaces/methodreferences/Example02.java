package functionalinterfaces.methodreferences;

public class Example02 {
    public static void main(String[] args) {

        // Calculator calculator = (numA, numB) -> numA * numB;

        Calculator calculator = Multiplication::multiply; // using a method reference

        int result = calculator.calculate(11,5);

        System.out.println("Product of given numbers is: " + result);
    }
}

class Multiplication {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}