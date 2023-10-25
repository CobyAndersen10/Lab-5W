public abstract class BinarySearchTree {
    protected Node root;
    protected int size;

    public abstract boolean add(int data);

    public int getSize() {
        return size;
    }



   protected class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}


