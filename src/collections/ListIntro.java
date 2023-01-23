package collections;

import java.util.*;

public class ListIntro {
    public static void main(String[] args) {

        // List is an interface
        // List allows you to add & duplicate elements
        // List allows you to have 'null' values
        // List is an ordered collection of items(NOT SORTED)

        // Declare a list of Strings
        List<String> list = new ArrayList<>();

        // How to add elements to list
        list.add("A");
        list.add("B");

        // Remove elements from a list
        list.remove("A");

        // To get size of a list
        System.out.println(list.size());

        // Check if a list is empty or not
        System.out.println(list.isEmpty());

        // Check if a list contains a specific element
        System.out.println(list.contains("B"));  // true
        System.out.println(list.contains("A"));  // false

        // remove all elements
        list.clear();

        // Add multiple elements to a list
        list.addAll(List.of("A", "B", "C", "D", "A"));

        // To get an element from a list
        System.out.println(list.get(1));

        // To replace an element in a list by index
        list.set(0,"A");

        // find the index of the first occurrence of an element in a list
        System.out.println(list.indexOf("C"));

        //  Find the index of the last occurrence of an element in a list
        System.out.println(list.lastIndexOf("A"));

        String[] vowels = {"a", "e", "i", "o", "u"};

        // We can use Arrays class to get the view of array as list
        List<String> vowelsList = Arrays.asList(vowels);
        System.out.println(vowelsList);

//        vowelsList.remove("e"); // wil throw UnsupportedOperationException

        // So the best way is to use for-loop for creating list by iterating over the array
        List<String> myList = new ArrayList<>();
        for (String s : vowels) {
            myList.add(s);
        }

        // Or use collections methods like below:
//        Collections.addAll(myList, vowels);

        myList.remove("e");

        System.out.println("myList: " + myList);

        List<String> letters = new ArrayList<>();
        letters.addAll(List.of("A", "B", "C"));

        // convert list to array
        String[] strArr = new String[letters.size()];
        strArr = letters.toArray(strArr);
        System.out.println(Arrays.toString(strArr));


        List<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));

        }
        Collections.sort(numbers);

        System.out.println(numbers);

        // TODO: What if we wanted to sort a list of Student objects?
        // How sort should work?
        // Google about Comparator and use it to sort custom objects
        // Can you make an example code of sort(List<T> list, Comparator<? super T>  c)


        List<Integer> integerList = new ArrayList<>();
         for (int i = 0; i < 5; i++) {
             integerList.add(i);
         }
        // below we are iterating over integerList
         for (Integer i : integerList) {
             System.out.println(i);
         }

         // iterator is a class that can be used to iterator over a collection
        // iterator has methods:
        // next() -> returns the next element in the collection
        // hasNext() -> returns true if there are more elements to be iterated over
        // remove() -> removes the current element from the collection during iteration

        Iterator<Integer> iterator = integerList.iterator();

         // simple iteration
        while (iterator.hasNext()) { // while iterator can see items ahead in the collection
            int i = iterator.next();
            System.out.print(i + ", ");
        }

        // modification of a list sing iterator
        iterator = integerList.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2 == 0) iterator.remove();
        }

        System.out.println("\n" + integerList);

        // TODO: There is another iterator called ListIterator
        // Discover what extra functionality it provides and test some of them here

        // LinkedList is a linear data structure, where the elements are not stored in contiguous locations
        // and every element is a node with a data part and address part
        // The elements are linked using pointers and addresses

        // Nodes in a LinkedList cannot be accessed directly, instead we need to start from the head and follow through
        // the link to reach node we wish to access(SLOWER access compared to ArrayList)
        // In terms of delete or insert operation, LinkedList is FASTER than ArrayList.
        LinkedList<String> linkedlist = new LinkedList<>(Arrays.asList("element1", "element2", "element3"));
        linkedlist.addFirst("first item");
        linkedlist.addLast("last item");



    }

}
