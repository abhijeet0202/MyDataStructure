/**
 * 
 */
package BinaryTree;

/**
 * @author Abhijeet
 *
 */
public class RBTreeBean<T extends Comparable<T>> {
	
	T iData;
	boolean isRed;
	boolean isDeleted; // It will keep track of deleted node, Physically node will not be deleted, we simply mark as true
	RBTreeBean<T> leftChild;
	RBTreeBean<T> rightChild;
	
	public RBTreeBean(T data) {
		this.iData = data;
		this.isDeleted=false;
		this.isRed=true;
		leftChild = null;
		rightChild = null;
	}
}
