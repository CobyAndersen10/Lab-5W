
public class myBinarySearchTree extends BinarySearchTree{
    private boolean addReturn;
    
    public myBinarySearchTree() {
        size = 0;
    }

    @Override
    public boolean add(int data) {
        root = add(root, data);
        return false;
    }
    private Node add(Node node, int data) {
        if(node == null) {
            addReturn = true;
            size++;
            return new Node(data);
        }
        //if data is less than node data add to left
        if (data < node.data) {
            node.left = add(node.left, data);
            size++;
            addReturn = true;
        }
        //if data is greater than or equal to node data add to right
        else if (data > node.data || data == node.data) {
            node.right = add(node.right, data);
            size++;
            addReturn = true;
        }
        //nothing else to add so return false
        else {
            addReturn = false;
        }
        return node;
    }

}
