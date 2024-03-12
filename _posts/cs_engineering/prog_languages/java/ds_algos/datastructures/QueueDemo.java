package _posts.cs_engineering.prog_languages.java.ds_algos.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Example: Queue declaration and initialization
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        // Visual representation of the queue:
        /*
         * 10 <- front
         * 20
         * 30
         * 40
         * 50 <- rear
         */
        // Example: Accessing queue elements using peek
        System.out.println("Front element: " + queue.peek());

        // Example: Accessing queue elements using remove
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Removed element: " + queue.remove());

        // Example: Iterating through queue using for loop
        while (!queue.isEmpty()) {
            System.out.println("Removed element: " + queue.remove());
        }
        /* Sample Output:
            Front element: 10
            Removed element: 10
            Removed element: 20
            Removed element: 30
            Removed element: 40
            Removed element: 50
         */
    }
}
