package _posts.cs_engineering.prog_languages.java.ds_algos.datastructures;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Example: Stack declaration and initialization
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        // Visual representation of the stack:
        /*
         * 50 <- top
         * 40
         * 30
         * 20
         * 10
         */
        // Example: Accessing stack elements using peek
        System.out.println("Top element: " + stack.peek());

        // Example: Accessing stack elements using pop
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Example: Iterating through stack using for loop
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
        /* Sample Output:
            Top element: 50
            Popped element: 50
            Popped element: 40
            Popped element: 30
            Popped element: 20
            Popped element: 10
         */
    }
}
