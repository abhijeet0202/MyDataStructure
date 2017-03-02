package BinaryTree;

import java.util.Scanner;

public class BinaryTree {

	public static BinaryTreeBean root;
	Scanner scan;

	/************************************************************************************************************************
	 * FIND
	 * **********************************************************************************************************************
	 * 1. Check If root is null or not, if root is null, then simply assign address of newly node to root.
	 * 2. Assign Current as root
	 * 3. Otherwise, Start Iterate until KeyElement is not equal to current data,
	 * 	3a. Check if node Data is less than newly node Data, if YES.
	 * 		3a1. Else Move current = current.leftChild
	 * 	3b. If Node Data is greater than newly node data
	 * 	    3b1. Else Move current = current.rightChild
	 *  3c. if Current is == null, return 
	 */
	public BinaryTreeBean find(int element) {
		BinaryTreeBean current = root;

		while (current.iData != element) {
			if (element < current.iData)
				current = current.leftChild;
			else
				current = current.rightChild;
			if (current == null)
				return null;
		}
		return current;

	}
	/************************************************************************************************************************
	 * INSERT
	 * **********************************************************************************************************************
	 * 1. Check If root is null or not, if root is null, then simply assign address of newly node to root.
	 * 2. Otherwise, Start Iterate infinitly,
	 * 3. Assign Current as root;
	 * 	3a. Check if node Data is less than newly node Data, if YES.
	 * 		3a1. Check if Current node left Data is null or not, if null, simply assign the newly node ref in current.leftChild 
	 * 		3a2. Else Move current = current.leftChild
	 * 	3b. If Node Data is greater than newly node data
	 * 		3b1. Check if Current node right Data is null or not, if null, simply assign the newly node ref in current.rightChild 
	 * 		3a2. Else Move current = current.rightChild
	 */
	public BinaryTreeBean insert(){
		BinaryTreeBean current = root;
		
		scan = new Scanner(System.in);
		int iData = scan.nextInt();
		BinaryTreeBean node = new BinaryTreeBean(iData);
		
		if (null == root){
			root = node;
			return root;
		} else {
			while (true){
				if (iData < current.iData){
					if (current.leftChild == null){
						current.leftChild = node;
						return current;
					} else{
						current = current.leftChild;
					}
				}else {
					if (current.rightChild == null){
						current.rightChild = node;
						return current;
					} else {
						current = current.rightChild;
					}
				}
			}
		}
	}
	/************************************************************************************************************************
	 * INORDER TRAVERSAL
	 * **********************************************************************************************************************
	 * Example:
	 * 				4
	 * 			  /   \
	 * 			 /     \
	 * 			3	    6
	 * *********************************************************************************************************************
	 * inOrderTraversal(4)
	 * --------------------
	 * |inOrderTraversal(3)|----			
	 * |PRINT	4          |   |
	 * |inOrderTraversal(6)|---|-----------------------------------
	 * |-------------------|   |								  |
	 *                         |								  |
	 *                         |								  |
	 * 					inOrderTraversal(3)					inOrderTraversal(6)
	 * 				------------------------				------------------------
	 * 		--------|inOrderTraversal(null)|				|inOrderTraversal(null)|---|		
	 * 		|		|PRINT	3              |				|PRINT	6              |   |
	 * 		|		|inOrderTraversal(null)|----			|inOrderTraversal(null)|---|------------------|
	 * 		|		|----------------------|   |			|----------------------|   |                  |
	 *      |                                  |                                       |                  |
	 *      |                                  |                                       |                  |
	 * 	inOrderTraversal(null)	 inOrderTraversal(null)				inOrderTraversal(null)	     inOrderTraversal(null)
	 * ------------------------	 ------------------------			------------------------	 ------------------------
	 * |return                |	 |return      		    |			|return                |	 |return      		    |
	 * ------------------------  ------------------------			------------------------      -----------------------
	 */
	public void inOrderTraversal(BinaryTreeBean root){
		
		if (root != null){
			inOrderTraversal(root.leftChild);
			System.out.print(root.iData+"-->");
			inOrderTraversal(root.rightChild);
		}
	}

	/************************************************************************************************************************
	 * PREORDER TRAVERSAL
	 * **********************************************************************************************************************
	 * Example:
	 * 				4
	 * 			  /   \
	 * 			 /     \
	 * 			3	    6
	 * *********************************************************************************************************************
	 * preOrderTraversal(4)
	 * --------------------
	 * |PRINT	4          |			
	 * |preOrderTraversal(3|---|
	 * |preOrderTraversal(6|---|-----------------------------------
	 * |-------------------|   |								  |
	 *                         |								  |
	 *                         |								  |
	 * 					preOrderTraversal(3)					preOrderTraversal(6)
	 * 				------------------------				------------------------
	 * 				|PRINT	3		       |				|PRINT	6	           |		
	 * 		--------|preOrderTraversal(null|				|preOrderTraversal(null|---|
	 * 		|		|preOrderTraversal(null|----			|preOrderTraversal(null|---|------------------|
	 * 		|		|----------------------|   |			|----------------------|   |                  |
	 *      |                                  |                                       |                  |
	 *      |                                  |                                       |                  |
	 * 	preOrderTraversal(null)	 preOrderTraversal(null)			preOrderTraversal(null)	     preOrderTraversal(null)
	 * ------------------------	 ------------------------			------------------------	 ------------------------
	 * |return                |	 |return      		    |			|return                |	 |return      		    |
	 * ------------------------  ------------------------			------------------------      -----------------------
	 */
	public void preOrderTraversal(BinaryTreeBean root){

		if (root != null) {

			System.out.print(root.iData + "-->");
			inOrderTraversal(root.leftChild);
			inOrderTraversal(root.rightChild);
		}
	}
	
	/************************************************************************************************************************
	 * POSTORDER TRAVERSAL
	 * **********************************************************************************************************************
	 * Example:
	 * 				4
	 * 			  /   \
	 * 			 /     \
	 * 			3	    6
	 * *********************************************************************************************************************
	 * postOrderTraversal(4)
	 * --------------------
	 * |postOrderTraversal(3)|----			
	 * |postOrderTraversal(6)|   |
	 * |PRINT	4            |---|-----------------------------------
	 * |---------------------|   |								  |
	 *                           |								  |
	 *                           |								  |
	 * 					postOrderTraversal(3)					postOrderTraversal(6)
	 * 				------------------------				--------------------------
	 * 		--------|postOrderTraversal(null)|				|postOrderTraversal(null)|---|		
	 * 		|		|postOrderTraversal(null)|----			|postOrderTraversal(null)|---|------------------|
	 * 		|		|PRINT	3                |	 |	    	|PRINT	6                |   |                  |
	 * 		|		|------------------------|   |			|------------------------|   |                  |
	 *      |                                    |                                       |                  |
	 *      |                                    |                                       |                  |
	 * 	postOrderTraversal(null)	postOrderTraversal(null)		postOrderTraversal(null)	  postOrderTraversal(null)
	 * ------------------------	 ------------------------			------------------------	 ------------------------
	 * |return                |	 |return      		    |			|return                |	 |return      		    |
	 * ------------------------  ------------------------			------------------------      -----------------------
	 */
	public void postOrderTraversal(BinaryTreeBean root){

		if (root != null) {

			inOrderTraversal(root.leftChild);
			inOrderTraversal(root.rightChild);
			System.out.print(root.iData + "-->");
		}
	}

	/************************************************************************************************************************
	 * DELETE
	 * **********************************************************************************************************************
	 * We need to consider 3 below options while deleting a node
	 * 1. The node to be deleted is a leaf (has no children).
	 * 2. The node to be deleted has one child.
     * 3. The node to be deleted has two children. 
	 */
	public BinaryTreeBean delete(int element){
		BinaryTreeBean current = root;
		BinaryTreeBean parent = null;
		boolean isLeftNode = true;
		if (root == null){
			System.out.println("No Element Exist To Delete");
			return null;
		}
		
		while (current.iData != element){
			if (element < current.iData){
				parent = current;
				current = current.leftChild;
				isLeftNode = true;
			}else{
				parent = current;
				current = current.rightChild;
				isLeftNode = false;
			}
			if (current == null){
				System.out.println("Given Element Not Exist");
				return null;
			}
		}
		
		if ((null == current.leftChild) && (null == current.rightChild)){
			return deleteLeaf(current,parent,isLeftNode);
		} else if(((null != current.leftChild) && (null == current.rightChild))){
			if (current == root)
				root = current.leftChild;
			return deleteSingleChildNode(current,parent, isLeftNode);
		} else if(((null == current.leftChild) && (null != current.rightChild))){
			if (current == root)
				root = current.rightChild;
			return deleteSingleChildNode(current,parent, isLeftNode);
		}else {
			return deleteDoubleChildNode(current,parent,isLeftNode);
		}
		
	}
	/************************************************************************************************************************
	 * DELETE LEAF
	 * **********************************************************************************************************************
	 * Make Parent as NULL, and return Current (i.e. Deleted Node)
	 */
	private BinaryTreeBean deleteLeaf(BinaryTreeBean current,BinaryTreeBean parent, boolean isLeftNode){
		if (current == root)
			root = null;
		else if (isLeftNode){
			parent.leftChild = null;
		}else {
			parent.rightChild = null;
		}
		return current;
	}
	
	private BinaryTreeBean deleteSingleChildNode(BinaryTreeBean current,BinaryTreeBean parent, boolean isLeftNode){
		
		if (isLeftNode){
			parent.leftChild = current.leftChild;
		}else{
			parent.rightChild = current.rightChild;
		}
		return current;
	}
	
	private BinaryTreeBean deleteDoubleChildNode(BinaryTreeBean current, BinaryTreeBean parent, boolean isLeftNode) {
		
		
		/////Need to re verify..few points may miss
		BinaryTreeBean deletableNode = current;
		BinaryTreeBean successorNode = null;
		current = current.rightChild;

		while (null != current.leftChild) {
			successorNode = current;
			current = current.leftChild;
		}
		successorNode.rightChild = current.rightChild;
		current.leftChild = deletableNode.leftChild;
		current.rightChild = deletableNode.rightChild;
		if (isLeftNode) {

			parent.leftChild = current;
		} else {
			parent.rightChild = current;
		}
		return deletableNode;
	}
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert();
		binaryTree.inOrderTraversal(root);
		binaryTree.insert();
		binaryTree.inOrderTraversal(root);
		binaryTree.insert();
		binaryTree.inOrderTraversal(root);
		binaryTree.insert();
		binaryTree.inOrderTraversal(root);
		binaryTree.insert();
		binaryTree.inOrderTraversal(root);
		binaryTree.insert();
		binaryTree.inOrderTraversal(root);
		binaryTree.insert();
		binaryTree.inOrderTraversal(root);
		binaryTree.insert();
		binaryTree.inOrderTraversal(root);
		System.out.println();
		binaryTree.preOrderTraversal(root);
		System.out.println();
		binaryTree.postOrderTraversal(root);
		
	}

}
