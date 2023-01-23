package functionalinterfaces.lambdaexpression;

public class LambdaWithMultipleParameter {
    public static void main(String[] args) {
        // lambda expression with multiple arguments
        StringConcatFunctionalInterface s = (str1, str2) -> str1 + str2;

        System.out.println("Result: " + s.concat("Hello ", "World"));
    }
}


@FunctionalInterface
interface StringConcatFunctionalInterface {
    String concat(String a, String b);
}