package collections.sets;

import java.util.*;

public class SetIntro {
    public static void main(String[] args) {
        // unlike List, we can't have duplicated items in a Set
        Set<String> travelRoute = new HashSet<>();
        travelRoute.add("Berlin");
        travelRoute.add("Tallinn");
        travelRoute.add("Paris");
        travelRoute.add("London");
        travelRoute.add("Tallinn");

        travelRoute.remove("London");

        for (String city : travelRoute) {
            System.out.print(city + " " + "\n");
        }

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(1,3,2,4,8,9,0));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(1,3,7,5,4,0,7,5));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);

        System.out.println("Union of the two sets: " + union);

        // Intersection: returns a new set containing all elements that are common to both sets
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);  // keep all elements that are in b

        System.out.println("Intersection of the two sets: " + intersection);

        // Difference: returns a new set containing all elements that are in the first set but not in the second set
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b); // this remove all elements of (b) from (a)

        System.out.println("Difference of the two sets: " + difference);

        // EnumSet is a set of elements of an enum type. High-performance and faster than HashSet.
        Set<Days> enumSet = EnumSet.of(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY);
        System.out.println(enumSet);

        // LinkedHashSet is a set that maintains the order of elements in which they are inserted
        // When iterating through a HashSet, the order is unpredictable, while a LinkedHashSet lets us
        // iterate through the elements in the order in which they were inserted
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("India");
        linkedHashSet.add("Australia");
        linkedHashSet.add("South Africa");

        // Add a duplicate element
        linkedHashSet.add("India");

        System.out.println(linkedHashSet);

        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // TreeSet behaves like a HashSet with the exception that it stores elements in a sorted format.
        // TreeSet is a good choice for storing elements that are ordered and sorted.

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("India");
        treeSet.add("Australia");
        treeSet.add("South Africa");
        treeSet.add("India");

        System.out.println(treeSet);
    }
}
