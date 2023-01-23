package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Person a = new Person("Thomas", "Peterson", 30);
        Person b = new Person("Thomas", "Blau", 45);
        Person c = new Person("Henry", "Smith", 23);
        Person d = new Person("Mike", "Doe", 25);
        Person e = new Person("Mary", "Williams", 58);

        List<Person> applicants = Arrays.asList(a, b, c, d, e);

        // Scenario: get the average age of people with firstname "Thomas"
        // Steps:
        // 1. iterate over applicants list
        // 2. find items with firstname =="Thomas"
        // 3. calculate the average age of them using (avg = sum/count)
        int avg = 0;
        int count = 0;
        int sum = 0;

        for (Person p : applicants) {
            if (p.getFirstname().equals("Thomas")) {
                count++;
                sum = sum + p.getAge();
            }
        }

        avg = sum / count;

        // Second solution: using Streams API in JAVA 8+
        Stream<Person> applicantStream = applicants.stream(); // this will create a stream out of our list

        // an example of how functional programming looks like
        List<Integer> ages = applicantStream
                .filter((p) -> p.getFirstname().equals("Thomas"))
                .map(p -> p.getAge())
                .collect(Collectors.toList());


        applicants.stream()
                .sorted( (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()))
                .forEach( (p) -> System.out.println(p.getLastname()) );


    }
}
