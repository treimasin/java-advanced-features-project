package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        // Predicate is a func. interface that takes an input argument and returns a boolean value
        // Predicates test things and this is used to perform logical operations
        // Predicate's have a functional method test() that always returns true/false

        Predicate<Person> predicate = (person) -> person.getAge() > 30;

        boolean result = predicate.test(new Person("John", 24));
        System.out.println(result);

        Predicate<String> stringPredicate = (str) -> {
            return str.contains("Java");
        };

        boolean isJavaDeveloper = stringPredicate.test("John is a Java Developer");
        System.out.println(isJavaDeveloper);

    }
}


