package _posts.cs_engineering.prog_languages.java.ds_algos.datastructures;

public class GraphDemo {
    public static void main(String[] args){
        // Example: Graph creation and traversal
        // Visual representation of the graph:
        // 1 -> 2 -> 3
        // |    |    |
        // v    v    v
        // 4 -> 5 -> 6
        class GraphNode {
            int data;
            GraphNode[] neighbors;
            GraphNode(int data) {
                this.data = data;
                this.neighbors = new GraphNode[0];
            }
        }

        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);
        GraphNode node6 = new GraphNode(6);
        node1.neighbors = new GraphNode[]{node2, node4};
        node2.neighbors = new GraphNode[]{node3, node5};
        node3.neighbors = new GraphNode[]{node6};
        node4.neighbors = new GraphNode[]{node5};
        node5.neighbors = new GraphNode[]{node6};
        System.out.println("Node 1 data: " + node1.data);
        System.out.println("Node 2 data: " + node2.data);
        System.out.println("Node 3 data: " + node3.data);
        System.out.println("Node 4 data: " + node4.data);
        System.out.println("Node 5 data: " + node5.data);
        System.out.println("Node 6 data: " + node6.data);
        System.out.println("Node 1 neighbors: " + node1.neighbors[0].data + ", " + node1.neighbors[1].data);
        System.out.println("Node 2 neighbors: " + node2.neighbors[0].data + ", " + node2.neighbors[1].data);
        System.out.println("Node 3 neighbors: " + node3.neighbors[0].data);
        System.out.println("Node 4 neighbors: " + node4.neighbors[0].data);
        System.out.println("Node 5 neighbors: " + node5.neighbors[0].data);
        System.out.println("Node 6 neighbors: " + node6.neighbors.length);
        /* Sample Output:
            Node 1 data: 1
            Node 2 data: 2
            Node 3 data: 3
            Node 4 data: 4
            Node 5 data: 5
            Node 6 data: 6
            Node 1 neighbors: 2, 4
            Node 2 neighbors: 3, 5
            Node 3 neighbors: 6
            Node 4 neighbors: 5
            Node 5 neighbors: 6
            Node 6 neighbors: 0
        */
    }
}
