package functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, String> function = (input) -> {
            return input.substring(5);
        };

        String output = function.apply("This is a test Function interface in Java 8+");

        System.out.println(output);
    }
}
