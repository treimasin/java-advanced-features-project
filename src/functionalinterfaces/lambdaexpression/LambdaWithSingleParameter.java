package functionalinterfaces.lambdaexpression;

public class LambdaWithSingleParameter {
    public static void main(String[] args) {
        // lambda expression with single parameter
        IncrementByFiveFunctionalInterface f = (num) -> num + 5;

        System.out.println(f.incrementByFive(22));
    }
}

@FunctionalInterface
interface IncrementByFiveFunctionalInterface {
    int incrementByFive(int a);
}