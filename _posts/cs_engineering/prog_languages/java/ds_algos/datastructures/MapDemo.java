package _posts.cs_engineering.prog_languages.java.ds_algos.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        // Example: Map declaration and initialization
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        // // Visual representation of the map:
        // /*
        //  * 1 -> "One"
        //  * 2 -> "Two"
        //  * 3 -> "Three"
        //  * 4 -> "Four"
        //  * 5 -> "Five"
        //  */
        // // Example: Accessing map elements using get
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 3: " + map.get(3));
        // Example: Iterating through map using for-each loop
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // /* Sample Output:
        //     Value for key 1: One
        //     Value for key 3: Three
        //     Key: 1, Value: One
        //     Key: 2, Value: Two
        //     Key: 3, Value: Three
        //     Key: 4, Value: Four
        //     Key: 5, Value: Five
        //  */
        // Example: TreeMap declaration and initialization
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(5, "Five");
        treeMap.put(4, "Four");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(1, "One");
        // Visual representation of the treeMap:
        // /*
        //  * 1 -> "One"
        //  * 2 -> "Two"
        //  * 3 -> "Three"
        //  * 4 -> "Four"
        //  * 5 -> "Five"
        //  */
        // Example: Accessing treeMap elements using get
        System.out.println("Value for key 1: " + treeMap.get(1));
        System.out.println("Value for key 3: " + treeMap.get(3));
        // Example: Iterating through treeMap using for-each loop
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // /* Sample Output:
        //     Value for key 1: One
        //     Value for key 3: Three
        //     Key: 1, Value: One
        //     Key: 2, Value: Two
        //     Key: 3, Value: Three
        //     Key: 4, Value: Four
        //     Key: 5, Value: Five
        //  */
        // /*
        //  * Note: Difference b/w HashMap and TreeMap
        //  * 1. HashMap: Unordered collection, uses hashing to store elements
        //  * 2. TreeMap: Ordered collection, uses balanced tree to store elements
        //  * 3. HashMap is faster than TreeMap
        //  * 4. TreeMap is slower than HashMap
        //  * 5. HashMap allows null key and values
        //  * 6. TreeMap does not allow null key and values
        //  */

    }
}
