/**
 * 
 */
package BinaryTree;

import org.junit.Test;

/**
 * @author Abhijeet
 *
 */
public class TestRBTree {

	
	@Test
	public void testInsertRoot() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.inOrderTraversal(myTree.root);
	}
	
	@Test
	public void testInsertImmidiateLeftChildOfRoot() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.inOrderTraversal(myTree.root);
	}
	
	@Test
	public void testInsertImmidiateRightChildOfRoot() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
		myTree.inOrderTraversal(myTree.root);
	}
	
	@Test
	public void testInsertColorFlipRoot() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
		myTree.insert(12);
		myTree.inOrderTraversal(myTree.root);
	}
	//Left Side OutSide grandChild
	@Test
	public void testInsertColorFlipAndAfterLeftExternalRoate() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
		myTree.insert(12);
		myTree.insert(6);
		myTree.inOrderTraversal(myTree.root);
	}
	//Left Side Inside grandChild
	@Test
	public void testInsertColorFlipAndAfterLeftInternalRoate() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
		myTree.insert(12);
		myTree.insert(18);
		myTree.inOrderTraversal(myTree.root);
	}
	
	//Right Side OutSide grandChild
	@Test
	public void testInsertColorFlipAndAfterRightExternalRoate() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
		myTree.insert(85);
		myTree.insert(95);
		myTree.inOrderTraversal(myTree.root);
	}
	//Right Side inside grandChild
	@Test
	public void testInsertColorFlipAndAfterRightInternalRoate() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
		myTree.insert(85);
		myTree.insert(80);
		myTree.inOrderTraversal(myTree.root);
	}
	
	@Test
	public void testInsertColorFlipDuringAfterLeftExternalRoate() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
		myTree.insert(12);
		myTree.insert(37);
		myTree.insert(6);
		myTree.insert(18);
		myTree.insert(3);
		myTree.inOrderTraversal(myTree.root);
	}
	
	@Test
	public void testInsertColorFlipDuringAfterLeftInternaloate() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
		myTree.insert(12);
		myTree.insert(37);
		myTree.insert(31);
		myTree.insert(43);
		myTree.insert(28);
		myTree.inOrderTraversal(myTree.root);
	}
}
