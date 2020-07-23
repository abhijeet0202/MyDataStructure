package Heap;

import java.util.ArrayList;
/**
 * Usually Heap is implemented by the help of Array.But we can Implement Heap using Tree also.
 * It takes extra calculation and variables to implement
 * @author Abhijeet
 *
 * @param <T>
 */
class TreeNode<T extends Comparable<T>>{
	T data;
	TreeNode<T> leftChild;
	TreeNode<T> rightChild;
	
	TreeNode(T data){
		this.data = data;
	}
	
	@Override
		public String toString() {
			return data.toString();
		}
}
public class TreeHeap<T extends Comparable<T>> {
	TreeNode<T> root;
	int count =-1; //Count variavle will keep count of total number of items in array, With each insert it will increment and decrement while remove
	
	public void insert(T element) {
		TreeNode<T> current = new TreeNode<T>(element);
//		if(root == null) {
//			root = current;
//			count++;
//			return;
//		}
		ArrayList<Integer> path = findIndex();
		trickleUp(current,path);
	}
	/**
	 * Usually, in Heap using array we put the new element in last index the use trickleUp logic to check the size of
	 * its parents and replace as required.
	 * But in Tree, we don't have luxury to first reach on the last node using huffman logic then trickle up.
	 * Because we dont have the parents chain, we cannot finf parent by seating in child node.
	 * 
	 * So, we will swap the parent and child node while going down from root, if child node is greater then parent,
	 * and will proceed with 
	 * @param current
	 * @param path
	 */
	private void trickleUp(TreeNode<T> current, ArrayList<Integer> path) {
		TreeNode<T> parent =null;
		for (int i =0; i<path.size();i++) {
			if (path.get(i)== 0) {
				parent = current;
				current = current.leftChild;
			}else {
				parent = current;
				current = current.rightChild;
			}
		}
		
	}
	/**
	 * Using Huffman code we can reach to the target node.
	 * As per Huffman rule, if we know the index of the node, in our case we always need last Node (either insert or delete) i.e. count variable.
	 * So lets Say, if my "count" value is 29, the binary of same will be 11101,
	 * Now, neglect first index of binary, i.e. 1, we will left with 1101.
	 * Now, 1 represent Move Towards RightChild and 0 represent leftChild.
	 * @return
	 */
	public ArrayList<Integer> findIndex() {
		int index = 3;
		ArrayList<Integer> path = new ArrayList<Integer>();
		while(index >=1) {
			index  = index%2;
			path.add(0, index);
			index/=2;
		}
		return path;
		
	}
}
