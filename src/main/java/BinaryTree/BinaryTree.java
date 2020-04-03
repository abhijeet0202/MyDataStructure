package BinaryTree;

public class BinaryTree<T extends Comparable<T>>{

	public BinaryTreeBean<T> root;

	/************************************************************************************************************************
	 * FIND
	 * **********************************************************************************************************************
	 * 1. Check If root is null or not, if root is null, then simply assign address of newly node to root.
	 * 2. Assign Current as root
	 * 3. Otherwise, Start Iterate until KeyElement is not equal to current data,
	 * 	3a. Check if node Data is less than newly node Data, if YES.
	 * 		3a1.  Move current = current.leftChild
	 * 	3b. If Node Data is greater than newly node data
	 * 	    3b1. s Move current = current.rightChild
	 *  3c. if Current is == null, return 
	 *  
	 *  Efficiency : O(LogN)
	 */
	public BinaryTreeBean<T> find(T element) {
		BinaryTreeBean<T> current = root;

		if (current == null)
			return null;
		
		while (current.iData.compareTo(element)!= 0) {
			if (current.iData.compareTo(element) > 0)
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
	 * 2. Otherwise, Start Iterate infinitely,
	 * 3. Assign Current as root;
	 * 	3a. Check if node Data is less than newly node Data, if YES.
	 * 		3a1. Check if Current node left Data is null or not, if null, simply assign the newly node ref in current.leftChild 
	 * 		3a2. Else Move current = current.leftChild
	 * 	3b. If Node Data is greater than newly node data
	 * 		3b1. Check if Current node right Data is null or not, if null, simply assign the newly node ref in current.rightChild 
	 * 		3a2. Else Move current = current.rightChild
	 */
	public BinaryTreeBean<T> insert(T element){
		BinaryTreeBean<T> current = root;
		
		
		BinaryTreeBean<T> node = new BinaryTreeBean<T>(element);
		
		if (null == root){
			root = node;
			return root;
			
		} else {
			while (true){
				if (current.iData.compareTo(element) > 0){
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
	public void inOrderTraversal(BinaryTreeBean<T> root){
		
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
	public void preOrderTraversal(BinaryTreeBean<T> root){

		if (root != null) {

			System.out.print(root.iData + "-->");
			preOrderTraversal(root.leftChild);
			preOrderTraversal(root.rightChild);
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
	public void postOrderTraversal(BinaryTreeBean<T> root){
		if (root != null) {

			postOrderTraversal(root.leftChild);
			postOrderTraversal(root.rightChild);
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
	public BinaryTreeBean<T> delete(T element){
		BinaryTreeBean<T> current = root;
		BinaryTreeBean<T> parent = null;
		boolean isLeftNode = true;
		if (root == null){
			System.out.println("No Element Exist To Delete");
			return null;
		}
		
		while (current.iData.compareTo(element) != 0){
			if (current.iData.compareTo(element) > 0){
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
		} else if(((null != current.leftChild) && (null != current.rightChild))){
			
			return deleteDoubleChildNode(current, parent, isLeftNode);
		}else {
			return deleteSingleChildNode(current,parent,isLeftNode);
		}
		
	}
	/************************************************************************************************************************
	 * DELETE LEAF
	 * **********************************************************************************************************************
	 * Make Parent as NULL, and return Current (i.e. Deleted Node)
	 */
	private BinaryTreeBean<T> deleteLeaf(BinaryTreeBean<T> current,BinaryTreeBean<T> parent, boolean isLeftNode){
		if (current == root)
			root = null;
		else if (isLeftNode){
			parent.leftChild = null;
		}else {
			parent.rightChild = null;
		}
		return current;
	}
	/*
	 * 4 Variation could be possible with below combination.
	 *  1. Child of the node (to be deleted) may be either a left child or right child.
	 *  2. Also node (to be deleted) may be either left or right child of its parent so we need to k 
	 */
	private BinaryTreeBean<T> deleteSingleChildNode(BinaryTreeBean<T> current, BinaryTreeBean<T> parent,
			boolean isLeftNode) {
		if ((null != current.leftChild)) {
			if (current == root) {
				root = current.leftChild;
				return root;
			}
			if (isLeftNode) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.leftChild;
			}
		} else {
			if (current == root) {
				root = current.rightChild;
				return root;
			}
			if (isLeftNode) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.rightChild;
			}
		}

		return current;
	}
	
	private BinaryTreeBean<T> deleteDoubleChildNode(BinaryTreeBean<T> current, BinaryTreeBean<T> parent, boolean isLeftNode) {
		
		// cuurent is successur
		BinaryTreeBean<T> deletableNode = current;
		BinaryTreeBean<T> parentSuccessorNode = null;
		current = current.rightChild;

		while (null != current.leftChild) {
			parentSuccessorNode = current;
			current = current.leftChild;
		}
		
		if (deletableNode.rightChild != current) {
			parentSuccessorNode.leftChild = current.rightChild;
			current.rightChild = deletableNode.rightChild;
		}
		if(deletableNode == root) {
			root = current;
		}
		else if (isLeftNode) {
			parent.leftChild = current;
		} else {
			parent.rightChild = current;
		}
		current.leftChild = deletableNode.leftChild;
		return deletableNode;
	}
	
}
