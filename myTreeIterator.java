/**
 * myTreeIterator is an iterator that iterates across
 * a BinarySearchTree via in-order traverse.
 * @author Ben Gaudreau
 * @version Oct. 25 2023
 */
public class myTreeIterator implements ITreeIterator {
	private int[] sequenceArray;
	private int nextIndex;
	
	/**
	 * Returns an array representation of the given BinarySearchTree.
	 * The array is sorted by in-order traverse.
	 */
	public int[] sequenceArray(BinarySearchTree bst) {
		sequenceArray = new int[bst.getSize()];
		nextIndex = 0;
		buildSequence(bst.root);
		return sequenceArray;
	}
	
	/**
	 * Helper recursive method to visit each node of the BinarySearchTree.
	 */
	private void buildSequence(Node node) {
		if (node == null)
			return;
		buildSequence(node.left);
		sequenceArray[nextIndex++] = node;
		buildSequence(node.right);
	}
}