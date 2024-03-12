package _posts.cs_engineering.prog_languages.java.ds_algos.datastructures;

public class LinkedListsDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Example: Node class for linked list
        class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // Example: Linked list creation and traversal
        // Visual representation of the linked list:
        // head -> 10 -> 20 -> 30 -> 40 -> 50 -> null
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        Node temp = head;
        while (temp != null) {
            System.out.println("Node data: " + temp.data);
            temp = temp.next;
        }
        /* Sample Output:
            Node data: 10
            Node data: 20
            Node data: 30
            Node data: 40
            Node data: 50
         */
    }
}
