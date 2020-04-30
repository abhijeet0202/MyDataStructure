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

	/**
	 * Check If a String Is a Valid Sequence from Root to Leaves Path in a Binary
	 * Tree
	 * 
	 * Given a binary tree where each path going from the root to any leaf form a
	 * valid sequence, check if a given string is a valid sequence in such binary
	 * tree.
	 * 
	 * We get the given string from the concatenation of an array of integers arr
	 * and the concatenation of all values of the nodes along a path results in a
	 * sequence in the given binary tree.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,0,1] 
	 * Output: true
	 * Explanation: The path 0 -> 1 -> 0 -> 1 is a valid sequence (green color in
	 * the figure). Other valid sequences are: 0 -> 1 -> 1 -> 0 0 -> 0 -> 0
	 * 
	 * Example 2:
	 * 
	 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,0,1] Output: false
	 * Explanation: The path 0 -> 0 -> 1 does not exist, therefore it is not even a
	 * sequence.
	 * 
	 * Example 3:
	 * 
	 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,1] Output: false
	 * Explanation: The path 0 -> 1 -> 1 is a sequence, but it is not a valid
	 * sequence.
	 * 
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= arr.length <= 5000 0 <= arr[i] <= 9 Each node's value is between [0 -
	 * 9].
	 * 
	 * @param root
	 * @return
	 */
	public boolean checkValidSequenceFromRootToLeaves(BinaryTreeBean<Integer> root, int arr[] ) {

		if (existPath(root, arr,0)) {
			return true;
		}
		return false;

	}
	private boolean existPath(BinaryTreeBean<Integer> root, int[] arr, int index) {
		// If root is NULL, then there must not be any element in array.  
        if(root==null) 
        { 
            return arr.length==0; 
        } 
  
        // If this node is a leaf and matches with last entry of array.  
        if((root.leftChild==null && root.rightChild==null)  ) 
        { 
        	if(index<arr.length && (root.iData==arr[index] && root.iData==arr[arr.length-1])) {
        		return true;
        	}
        } 
  
        // If current node is equal to arr[index] this means that till this level path has been matched and  
        // remaining path can be either in left subtree or right subtree.  
        return (index<arr.length && (root.iData==arr[index] && (existPath(root.leftChild,arr,index+1) || 
        		existPath(root.rightChild, arr, index+1)))); 
	}
}
