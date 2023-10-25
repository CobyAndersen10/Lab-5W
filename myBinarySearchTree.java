
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
        if (data < node.data) {
            node.left = add(node.left, data);
            size++;
            addReturn = true;
        }
        else if (data > node.data) {
            node.right = add(node.right, data);
            size++;
            addReturn = true;
        }
        else if (data == node.data) {
            node.right = add(node.right, data);
            size++;
            addReturn = true;
        }
        else {
            addReturn = false;
        }
        return node;
    }

}
