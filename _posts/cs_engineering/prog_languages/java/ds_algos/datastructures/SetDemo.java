package _posts.cs_engineering.prog_languages.java.ds_algos.datastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // Example: HashSet declaration and initialization
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        // Visual representation of the set:
        /*
         * 10
         * 20
         * 30
         * 40
         * 50
         */
        // Example: Accessing set elements using contains
        System.out.println("Contains 10: " + set.contains(10));
        System.out.println("Contains 60: " + set.contains(60));

        // Example: Iterating through set using for loop
        for (Integer element : set) {
            System.out.println("Element: " + element);
        }
        /* Sample Output:
            Contains 10: true
            Contains 60: false
            Element: 10
            Element: 20
            Element: 30
            Element: 40
            Element: 50
         */
        // Example: TreeSet declaration and initialization
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);
        // Visual representation of the treeSet:
        /*
         * 10
         * 20
         * 30
         * 40
         * 50
         */
        // Example: Accessing treeSet elements using contains
        System.out.println("Contains 10: " + treeSet.contains(10));
        System.out.println("Contains 60: " + treeSet.contains(60));
        // Example: Iterating through treeSet using for loop
        for (Integer element : treeSet) {
            System.out.println("Element: " + element);
        }
        /* Sample Output:
            Contains 10: true
            Contains 60: false
            Element: 10
            Element: 20
            Element: 30
            Element: 40
            Element: 50
         */
        /*
         * Note: Difference b/w HashSet and TreeSet
         * 1. HashSet: Unordered collection, uses hashing to store elements
         * 2. TreeSet: Ordered collection, uses balanced tree to store elements
         * 3. HashSet is faster than TreeSet
         * 4. TreeSet is slower than HashSet
         * 5. HashSet allows null elements
         * 6. TreeSet does not allow null elements
         * 7. HashSet is non-synchronized
         * 8. TreeSet is synchronized
         * 9. HashSet is not thread-safe
         * 10. TreeSet is thread-safe
         */
    }
}
