/**
 * 
 */
package BinaryTree;

/**
 * @author Aryan
 *
 */
public class BinaryTreeBean<T extends Comparable<T>>{

	T iData;
	BinaryTreeBean<T> leftChild;
	BinaryTreeBean<T> rightChild;
	
	public BinaryTreeBean(T iData) {
		this.iData = iData;
		leftChild = null;
		rightChild = null;
	}
	
	public String toString(){
		System.out.print("{" + iData + "}--> ");
		return "";
	}
}