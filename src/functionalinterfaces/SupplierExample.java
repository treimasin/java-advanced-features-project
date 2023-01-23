package functionalinterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> {
            return new Person("Reeda", 33);
        };

        Person person = supplier.get();

        System.out.println(person.getAge());
        System.out.println(person.getName());
    }


}
