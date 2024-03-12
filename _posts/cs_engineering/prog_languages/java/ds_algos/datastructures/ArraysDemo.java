package _posts.cs_engineering.prog_languages.java.ds_algos.datastructures;

public class ArraysDemo {
    public static void main(String[] args) {
        // Example: Array declaration and initialization
        int[] studentAges = {20, 21, 22, 23, 24};
        String[] studentNames = {"John Doe", "Jane Doe", "Alice", "Bob", "Charlie"};

        // Example: Accessing array elements using index
        System.out.println("Student Name: " + studentNames[0] + ", Age: " + studentAges[0]);
        System.out.println("Student Name: " + studentNames[1] + ", Age: " + studentAges[1]);

        // Example: Iterating through array using for loop
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Student Name: " + studentNames[i] + ", Age: " + studentAges[i]);
        }

        /* Sample Output:
            Student Name: John Doe, Age: 20
            Student Name: Jane Doe, Age: 21
            Student Name: John Doe, Age: 20
            Student Name: Jane Doe, Age: 21
            Student Name: Alice, Age: 22
            Student Name: Bob, Age: 23
            Student Name: Charlie, Age: 24
         */
    }
}
