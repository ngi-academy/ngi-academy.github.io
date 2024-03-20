---
layout: post
author: sheikirfanbasha
title: Java Data Structures and Algorithms
excerpt: In the vast realm of Java programming, understanding data structures and algorithms is akin to having a robust toolkit. In this exploration, we'll delve into the essential data structures and algorithms available in Java, empowering developers to craft efficient and scalable solutions.
categories: blog
comments: true
---

# Navigating the World of Java: Data Structures and Algorithms
In the vast realm of Java programming, understanding data structures and algorithms is akin to having a robust toolkit. In this exploration, we'll delve into the essential data structures and algorithms available in Java, empowering developers to craft efficient and scalable solutions.

## Data Structures in Java
### 1. Arrays
Arrays in Java provide a contiguous memory space to store elements of the same data type. They offer fast random access but have a fixed size.

```java
// Example: Declaration and Initialization of an Array
int[] numbers = {1, 2, 3, 4, 5};
```
<details>
<summary>
Arrays Demo
</summary>

{% highlight java %}
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
{% endhighlight %}

</details>

### 2. Linked Lists
Linked lists consist of nodes, each containing data and a reference to the next node. They are dynamic and efficient for insertions and deletions.

```java
// Example: Implementation of a Singly Linked List
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
```
<details>
<summary>
LinkedLists Demo
</summary>

{% highlight java %}
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
{% endhighlight %}

</details>

### 3. Stacks and Queues

Java provides Stack and Queue interfaces, with implementations like LinkedList and ArrayDeque. Stacks follow the Last In, First Out (LIFO) principle, while queues adhere to the First In, First Out (FIFO) principle.

```java
// Example: Using Stack and Queue
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);

Queue<String> queue = new LinkedList<>();
queue.offer("First");
queue.offer("Second");
```
<details>
<summary>
Stack Demo
</summary>

{% highlight java %}
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
{% endhighlight %}

</details>

<details>
<summary>
Queue Demo
</summary>

{% highlight java %}
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
{% endhighlight %}

</details>

### 4. Trees

Trees are hierarchical structures with a root, nodes, and leaves. In Java, the TreeNode class can be used to represent nodes in a tree.

```java
// Example: TreeNode Class for Binary Trees
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}
```
<details>
<summary>
Tree Demo
</summary>

{% highlight java %}
public class TreeDemo {
    public static void main(String[] args) {
        // Example: TreeNode class for tree
        class TreeNode {
            int data;
            TreeNode left;
            TreeNode right;
            TreeNode(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        // Example: Tree creation and traversal
        // Visual representation of the tree:
        //       10
        //      /  \
        //     20  30
        //    / \   \
        //   40 50  60
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.right = new TreeNode(60);
        System.out.println("Root data: " + root.data);
        System.out.println("Left child of root: " + root.left.data);
        System.out.println("Right child of root: " + root.right.data);
        System.out.println("Left child of root's left child: " + root.left.left.data);
        System.out.println("Right child of root's left child: " + root.left.right.data);
        System.out.println("Right child of root's right child: " + root.right.right.data);
        /* Sample Output:
            Root data: 10
            Left child of root: 20
            Right child of root: 30
            Left child of root's left child: 40
            Right child of root's left child: 50
            Right child of root's right child: 60
         */
    }
}
{% endhighlight %}

</details>

### 5. Maps and HashTables

Java's Map interface, implemented by classes like HashMap and TreeMap, provides key-value pair storage. HashTables ensure efficient key-based retrieval.

```java
// Example: HashMap Implementation
Map<String, Integer> studentGrades = new HashMap<>();
studentGrades.put("Alice", 90);
studentGrades.put("Bob", 85);
```
<details>
<summary>
Map Demo
</summary>

{% highlight java %}
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
{% endhighlight %}

</details>

<details>
<summary>
Set Demo
</summary>

{% highlight java %}
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
{% endhighlight %}

</details>

## Algorithms in Java

### 1. Searching Algorithms
#### Binary Search
```java
// Example: Binary Search
int[] sortedArray = {1, 2, 3, 4, 5};
int target = 3;
int index = Arrays.binarySearch(sortedArray, target);
```
<details>
<summary>
BinarySearch Demo
</summary>

{% highlight java %}
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int key = 13;
        int index = binarySearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
        index = recursiveBinarySearch(arr, key, 0, arr.length - 1);
        if (index != -1) {
            System.out.println("Using recursion method, element found at index: " + index);
        } else {
            System.out.println("Using recursion method, element not found");
        }
        /*
         * Output:
         * Element found at index: 6
         * Using recursion method, element found at index: 6
         */
    }

    /**
     * Performs a binary search on a sorted array to find the index of a given key.
     *
     * @param arr the sorted array to search in
     * @param key the value to search for
     * @return the index of the key if found, -1 otherwise
     */
    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Performs a recursive binary search on a sorted array to find the index of a given key.
     *
     * @param arr  the sorted array to search in
     * @param key  the key to search for
     * @param low  the lower bound of the search range
     * @param high the upper bound of the search range
     * @return the index of the key in the array, or -1 if the key is not found
     */
    private static int recursiveBinarySearch(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return recursiveBinarySearch(arr, key, mid + 1, high);
        } else {
            return recursiveBinarySearch(arr, key, low, mid - 1);
        }
    }
}
{% endhighlight %}
</details>

### 2. Sorting Algorithms
#### Merge Sort
```java
// Example: Merge Sort
int[] arrayToSort = {5, 2, 9, 1, 5, 6};
MergeSort.sort(arrayToSort);
```
<details>
<summary>
MergeSort Demo
</summary>

{% highlight java %}
import java.util.Arrays;

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        /*
         * Output:
         * Sorted array: [3, 9, 10, 27, 38, 43, 82]
         */
    }

    /**
     * Sorts the given array using the merge sort algorithm.
     *
     * @param arr   the array to be sorted
     * @param left  the starting index of the subarray to be sorted
     * @param right the ending index of the subarray to be sorted
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort the left and right halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    /**
     * Merges two subarrays of the given array.
     *
     * @param arr   the array to be sorted
     * @param left  the starting index of the first subarray
     * @param mid   the ending index of the first subarray
     * @param right the ending index of the second subarray
     */
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        // Merge the two arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from leftArr and rightArr
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
{% endhighlight %}
</details>
#### Quick Sort
```java
// Example: Quick Sort
int[] arrayToSort = {5, 2, 9, 1, 5, 6};
QuickSort.sort(arrayToSort);
```
<details>
<summary>
QuickSort Demo
</summary>

{% highlight java %}
import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        /*
         * Output:
         * Sorted array: [3, 9, 10, 27, 38, 43, 82]
         */
    }

    /**
     * Sorts the given array using the quick sort algorithm.
     *
     * @param arr   the array to be sorted
     * @param left  the starting index of the subarray to be sorted
     * @param right the ending index of the subarray to be sorted
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    /**
     * Partitions the given array and returns the index of the pivot element.
     *
     * @param arr   the array to be sorted
     * @param left  the starting index of the subarray to be sorted
     * @param right the ending index of the subarray to be sorted
     * @return the index of the pivot element
     */
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    /**
     * Swaps the elements at the specified indices in the given array.
     *
     * @param arr the array in which to swap elements
     * @param i   the index of the first element
     * @param j   the index of the second element
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
{% endhighlight %}
</details>

### 3. Graph Algorithms
#### Breadth-First Search (BFS)
```java
// Example: Breadth-First Search
Graph graph = new Graph();
graph.addVertex("A");
graph.addVertex("B");
graph.addEdge("A", "B");
graph.BFS("A");
```
<details>
<summary>
Breadth First Search Demo
</summary>

{% highlight java %}
{% endhighlight %}
</details>

#### Depth-First Search (DFS)
```java
// Example: Depth-First Search
Graph graph = new Graph();
graph.addVertex("A");
graph.addVertex("B");
graph.addEdge("A", "B");
graph.DFS("A");
```
<details>
<summary>
Depth First Search Demo
</summary>

{% highlight java %}
{% endhighlight %}
</details>
### 4. Dynamic Programming
#### Fibonacci Sequence

```java
// Example: Fibonacci Sequence using Dynamic Programming
int n = 10;
int[] fibArray = new int[n + 1];
int result = fibonacci(n, fibArray);
```
<details>
<summary>
Fibonacci Sequence Demo
</summary>

{% highlight java %}
{% endhighlight %}
</details>

## Space and Time Complexities

Understanding the efficiency of algorithms is pivotal in designing robust systems. The Big O notation succinctly expresses the upper bound of an algorithm's growth rate in both time and space complexities.

### Time Complexity:

* **O(1):** Constant time
* **O(log n):** Logarithmic time
* **O(n):** Linear time
* **O(n log n):** Linearithmic time
* **O(n^2):** Quadratic time
* **O(2^n):** Exponential time

### Space Complexity:

* **O(1):** Constant space
* **O(n):** Linear space
* **O(n^2):** Quadratic space

Mastering space and time complexities empowers developers to choose the most efficient algorithms and data structures for their applications.

## Conclusion
In the vast landscape of Java programming, mastering data structures and algorithms is indispensable. These tools empower developers to craft efficient, scalable, and optimized solutions. As you navigate the world of Java, remember that the choices you make regarding data structures and algorithms can profoundly impact the performance and efficiency of your applications. Whether it's arrays, trees, or searching algorithms, each component plays a crucial role in building robust and sophisticated software solutions. Happy coding!
