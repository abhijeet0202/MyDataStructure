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
	}
	
	@Test
	public void testInsertImmidiateLeftChildOfRoot() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
	}
	
	@Test
	public void testInsertImmidiateRightChildOfRoot() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
	}
	
	@Test
	public void testInsertColorFlipRoot() {
		RBTree<Integer> myTree = new RBTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
		myTree.insert(12);
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
	}
	//Right Side inside grandChild

}
