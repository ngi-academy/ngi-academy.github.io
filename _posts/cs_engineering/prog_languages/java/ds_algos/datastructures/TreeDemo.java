package _posts.cs_engineering.prog_languages.java.ds_algos.datastructures;

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
