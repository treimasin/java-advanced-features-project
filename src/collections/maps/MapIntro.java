package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap();

        // You can add elements to the map using following methods:
        // 1. put(key, value)
        // 2. putAll(Map)

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value3");

        map.put("key1", "value5"); // This will replace the value of key1 with value 5

        // Only Java objects are allowed as keys and values. Primitive types are automatically boxed.

        // TODO: PLEASE take a look at package: 'castingautoboxing'

        // You can use null as a key/value or even both in a Map.
        map.put(null, "value6");

        // Here is an example of copying all entries from one map to another using putAll() method
        Map<String, String> map2 = new HashMap<>();
        map2.putAll(map);

        // You can access and iterate over keys and values using following methods:
        // - get(key)
        // - getOrDefault(key, defaultValue)
        // - keySet()
        // - values()
        // - entrySet()

        String result = map.get("key1"); // return value5
        System.out.println(result + " is the value mapped to key1");

        String value = map.getOrDefault("key8", "default");  // returns defaultValue
        System.out.println("value = " + value);

        System.out.println("Printing keys:");
        for (String k: map.keySet()) {
            System.out.println(k);
        }
        System.out.println("Printing values:");
        for (String v: map.values()) {
            System.out.println(v);
        }
        System.out.println("Printing entries:");
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // You can access the value of a null key using get(null)
        value = map.get(null);
        System.out.println("Value linked to null key is: " + value);

        // You can use containsKey() method to check if a key is present in map or not
        boolean containsKey = map.containsKey("key1");
        System.out.println("containsKey = " + containsKey);

        boolean containsValue = map.containsValue("value1");
        System.out.println("containsValue = " + containsValue);

        String removedValue = map.remove("key1"); // removes the entry with key1 and returns the value
        System.out.println("removedValue = " + removedValue);

        // You can use clear() method to remove all entries from a map in one go
        // map.clear();

        map = new HashMap<>();
        map.replace("key", "val2");  // no "key" entry, no replace happens

        map.put("key", "val1"); // now contains "key" key

        map.replace("key", "new value");

        System.out.println(map.get("key"));


    }
}
