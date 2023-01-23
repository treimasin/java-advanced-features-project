package functionalinterfaces.lambdaexpression;

public class LambdaWithNoParameter {
    public static void main(String[] args) {

        // lambda expression with no parameter
        SayHelloFunctionalInterface msg = () -> "Hello";

        System.out.println(msg.sayHello());
    }

}

@FunctionalInterface
interface SayHelloFunctionalInterface {

    // A method with no parameter
    String sayHello();
}
