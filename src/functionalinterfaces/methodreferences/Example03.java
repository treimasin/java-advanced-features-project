package functionalinterfaces.methodreferences;

import java.util.Arrays;

public class Example03 {
    public static void main(String[] args) {
        String[] array = {"Steve", "Rick", "Negan", "Lucy", "Sam", "Jon"};

//        Arrays.sort(array, (strA, strB) -> strA.compareToIgnoreCase(strB));

        Arrays.sort(array, String::compareToIgnoreCase); // using a method reference

        for (String item: array) {
            System.out.println(item);
        }
    }
}
