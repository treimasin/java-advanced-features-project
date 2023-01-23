package collections.maps;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// TreeMap is a Map implementation in Java that maintains its entries order in ascending order
// sorted according to the key's natural ordering or according to a Comparator at the time of TreeMap's creation.
public class TreeMapIntro {
    public static void main(String[] args) {

        System.out.println("============================ TreeMap with default/no comparator ============================");
        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(2, 200);
        treeMap.put(4, 400);
        treeMap.put(1, 100);
        treeMap.put(3, 300);
        // null values are not allowed for TreeMap
//        treeMap.put(null, null);  can't be used

        for (Map.Entry<Integer, Integer> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey());
        }

        System.out.println("============================ TreeMap with built-in comparator ============================");
        treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(2, 200);
        treeMap.put(4, 400);
        treeMap.put(1, 100);
        treeMap.put(3, 300);

        for (Map.Entry<Integer, Integer> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey());

        }

        System.out.println("============================ TreeMap with custom comparator ============================");
        Map<String, Integer> mapForSorting = new HashMap<>();
        // Add some key-value pairs to the map
        mapForSorting.put("banana", 2);
        mapForSorting.put("apple", 1);
        mapForSorting.put("cherry", 3);

        System.out.println("Original map: " + mapForSorting);

        // Create a new TreeMap with the same elements as the HashMap above but sorted by value
        Map<String, Integer> sortedMap = new TreeMap<>(new CustomComparator(mapForSorting));

        // Copying elements from HashMap to TreeMap happens here:
        sortedMap.putAll(mapForSorting);
        System.out.println("Sorted map: " + sortedMap);

        // Because values are type of Integer, then we can use built-in comparator like below
//        Map<String, Integer> sortedMap = new TreeMap<>(Comparator.naturalOrder());  **********************

    }
}

// A comparator that compares the values of the map
class CustomComparator implements Comparator<String> {

    Map<String, Integer> map;

    public CustomComparator(Map<String, Integer>map) {
        this.map = map;
    }

    @Override
    public int compare(String key1, String key2) {
        // if returned integer is 0 then o1 = o2
        // if returned integer is positive then o1 > o2
        // if returned integer is negative then o1 < 02
        int value1 = map.get(key1);
        int value2 = map.get(key2);
        return value1 - value2;  // Ascending order. To make it descending -> return value value2 - value1;
    }
}