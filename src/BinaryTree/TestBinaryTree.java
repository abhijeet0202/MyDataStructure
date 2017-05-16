package BinaryTree;

import org.junit.Test;

public class TestBinaryTree {

	@Test
	public void testBlankTreeFind() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.find(27);
	}
	@Test
	public void testOneElementTreeFind() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(27);
		myTree.find(27);
	}
	
	@Test
	public void testLeftElementTreeFind() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(27);
		myTree.insert(26);
		myTree.insert(25);
		myTree.find(25);
	}
	
	@Test
	public void testRightElementTreeFind() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(25);
		myTree.insert(26);
		myTree.insert(27);
		myTree.find(27);
		
		
	}
	
	@Test
	public void testFindElementWhichIsNotPresent() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		BinaryTreeBean<Integer> root = myTree.insert(27);
		myTree.insert(28);
		myTree.insert(25);
		myTree.find(30);
		myTree.inOrderTraversal(root);
		
		
	}

}
