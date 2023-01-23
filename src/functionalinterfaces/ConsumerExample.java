package functionalinterfaces;

import generics.Comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        // Consumer is a func interface that consumes values

        Consumer<Person> consumer = (person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        };

        consumer.accept(new Person("Mary", 22));

        Consumer<String> stringConsumer = (str) -> {
            System.out.println(str.toUpperCase());
        };

        stringConsumer.accept("Hello world");

        List<Person> list = new ArrayList<>();
        list.add(new Person("Kristofer", 35));
        list.add(new Person("Rasmus", 20));
        list.add(new Person("Leida", 31));

        // Google: PECS (Producer Extends, Consumer Super)
        list.forEach(consumer); // it will execute the consumer accept() method for every single Person class in the list
    }
}
