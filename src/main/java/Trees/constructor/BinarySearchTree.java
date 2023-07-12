package Trees.constructor;

public class BinarySearchTree {
    public Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }
}
