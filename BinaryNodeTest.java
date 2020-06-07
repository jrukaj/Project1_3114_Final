import org.junit.Test;

import student.TestCase;

public class BinaryNodeTest extends TestCase {

	private BinaryNode node;
	private BinaryNode<student> studentNode;
	
	/**
	 * Sets up test environment
	 */
	public void setUp() {
		student student = new student("Jonathan", "Rukaj");
		node = new BinaryNode(4);
		studentNode = new BinaryNode(student);
	}
	
	/**
	 * Tests the getElement() method
	 */
	public void testGetElement() {
		assertEquals(4, node.getElement());
		assertEquals("Jonathan", studentNode.getElement().getFirst());
		assertEquals("Rukaj", studentNode.getElement().getLast());
	}
	
	/**
	 * Tests the getLeft() method
	 */
	public void testGetLeft() {
		BinaryNode left = new BinaryNode(3);
		assertEquals(null, node.getLeft());
		node.setLeft(left);
		assertEquals(3, node.getLeft().getElement());
		
		BinaryNode<student> sLeft = new BinaryNode(new student("Dilan", "Prasad"));
		assertEquals(null, studentNode.getLeft());
		studentNode.setLeft(sLeft);
		assertEquals("Dilan", studentNode.getLeft().getElement().getFirst());
		assertEquals("Prasad", studentNode.getLeft().getElement().getLast());
	}
	
	/**
	 * Tests the getRight method
	 */
	public void testGetRight() {
		BinaryNode right = new BinaryNode(3);
		assertEquals(null, node.getRight());
		node.setRight(right);
		assertEquals(3, node.getRight().getElement());
		
		BinaryNode<student> sRight = new BinaryNode(new student("Dilan", "Prasad"));
		assertEquals(null, studentNode.getRight());
		studentNode.setRight(sRight);
		assertEquals("Dilan", studentNode.getRight().getElement().getFirst());
		assertEquals("Prasad", studentNode.getRight().getElement().getLast());
	}
}
