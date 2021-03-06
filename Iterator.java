import java.util.*;

/**
 * Iterator for the Binary Search Tree
 * @author Jonathan Rukaj
 *
 */
public class Iterator<T> {

	private Stack<BinaryNode> stack;
	
	/**
	 * Iterator constructor
	 * @param root
	 */
	public Iterator(BinaryNode root) {
		stack = new Stack<BinaryNode>();
		pushLeft(root);
	}
	
	/**
	 * Pushes nodes to a stack such that an in-order traversal can
	 * take place.
	 * @param root
	 */
	private void pushLeft(BinaryNode root) {
		while (root != null) {
			stack.push(root);
			root = root.getLeft();
		}
	}
	
	/**
	 * Determines if the iterator has another node to iterate through.
	 * @return true if there is one, false if there is not
	 */
	public boolean hasNext() {
		return !stack.isEmpty();
	}
	
	/**
	 * Returns the next node
	 * @return the next node, if it exists
	 */
	public BinaryNode<T> next() {
		if (!hasNext()) {
			throw new NoSuchElementException("There are no more nodes in the tree!");
		}
		
		BinaryNode<T> curr = stack.pop();
		pushLeft(curr.getRight());
		return curr;
	}
}
