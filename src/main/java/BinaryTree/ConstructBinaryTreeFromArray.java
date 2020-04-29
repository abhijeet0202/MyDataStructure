package BinaryTree;

import java.util.List;
class Res{
	int value;
	
	Res(){
		value =Integer.MIN_VALUE;
	}
}
public class ConstructBinaryTreeFromArray {

	/**
	 * Return the root node of a binary search tree that matches the given preorder
	 * traversal.
	 * 
	 * (Recall that a binary search tree is a binary tree where for every node, any
	 * descendant of node.left has a value < node.val, and any descendant of
	 * node.right has a value > node.val. Also recall that a preorder traversal
	 * displays the value of the node first, then traverses node.left, then
	 * traverses node.right.)
	 * 
	 * @param bstArray
	 * @param root
	 * @param index
	 * @return
	 */
	public BinaryTreeBean<Integer> constructBinaryTree(List<Integer> bstArray, BinaryTreeBean<Integer> root,
			int index) {
		if (index < bstArray.size() && bstArray.get(index)!= null) {
				BinaryTreeBean<Integer> temp = new BinaryTreeBean<Integer>(bstArray.get(index));
				root = temp;
				

			root.leftChild = constructBinaryTree(bstArray, root.leftChild, 2 * index + 1);

			root.rightChild = constructBinaryTree(bstArray, root.rightChild, 2 * index + 2);
		}
		return root;
	}

	/**
	 * Given a non-empty binary tree, find the maximum path sum.
	 * 
	 * For this problem, a path is defined as any sequence of nodes from some
	 * starting node to any node in the tree along the parent-child connections. The
	 * path must contain at least one node and does not need to go through the root.
	 * 
	 * Example 1:
	 * 
	 * Input: [1,2,3]
	 * 
	 * 			1 
	 * 		   / \ 
	 * 		  2   3
	 * Output: 6
	 * 
	 * Example 2:
	 * 
	 * Input: [-10,9,20,null,null,15,7]
	 * 
	 * 		-10 
	 * 	 	 / \ 
	 * 		9  20 
	 * 		   / \ 
	 * 		  15  7
	 * 
	 * Output: 42
	 * 
	 * 
	 * @param root
	 */
	public int binaryTreeMaximumPathSum(BinaryTreeBean<Integer> root) {

		Res obj = new Res();
		calculateTotalSum(root, obj);
		return obj.value;

	}

	private int calculateTotalSum(BinaryTreeBean<Integer> root, Res obj) {
		if (root == null) 
			return 0;

		int left = calculateTotalSum(root.leftChild, obj);
		int right = calculateTotalSum(root.rightChild, obj);

		int current = Math.max(root.iData, Math.max(root.iData + left, root.iData + right));

		obj.value = Math.max(obj.value, Math.max(current, left + root.iData + right));

		return current;
	}
}
