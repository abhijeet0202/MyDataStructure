package Heap;

import java.util.ArrayList;
import java.util.List;

/**
 * A Heap is a Kind Of tree.it offers both insertion and deletion in O(LogN).
 * 
 * A heap is Binary tree, with these characteristics:
 * 		Its Complete: Its completely filled in, reading from left to right across each row.
 * 		Although the last row need not be full.
 * 		
 * 		Its usually implemented as an array,There is nothing to do with trees and nodes (i.e left or right child),
 * 
 * 		Condition: EVERY NODE KEY SHOULD BE GREATER THAN THE KEYS OF ITS CHILDREN
 * 				   There should not be any "holes" i.e. NULL value in the array which we used to represent it.
 * 
 * Mostly heap is used to implement priority Queue.
 * 
 * WEAKLY ORDERED: if compare to BST, in which all nodes left child have keys less than its right child.
 * 		So TRAVERSING is NOT POSSIBLE IN HEAP.
 * 		Find/Search is not allowed or convenient.
 * 		If FIND is not allowed, then DELETEINg specified Key not allowed/convenient
 * 
 * Heap is always used for faster removal and faster insertion of Maximum key Node
 * @author Abhijeet
 *
 */
class Node<T extends Comparable<T>>{
	T data;
	
	Node(T data){
		this.data = data;
	}
	
	@Override
		public String toString() {
			return data.toString();
		}
}
public class ArrayHeap<T extends Comparable<T>> {
	List<Node<T>> heapArray = new ArrayList<Node<T>>();
	
	@Override
	public String toString() {
		String str = new String();
		// TODO Auto-generated method stub
		for (int i =0; i<heapArray.size();i++) {
			str+= i;
			str+="[";
			str+= heapArray.get(i);
			str+="] ";
		}
		return str;
	}
	
	/**
	 * Removal means removing the node with the maximum Key (i.e. Root)
	 * Steps:
	 * 	1. Remove the root.
	 * 	2. Move the last node into the root
	 * 	3. Move the newly init root to down until its below a larger and above smaller one.
	 * 		While moving down, we need to compare both child, choose and swap with higher key child.
	 * 
	 * • Its left child is 2*x + 1.
• Its right child is 2*x + 2.
	 * @return
	 */
	public Node<T> remove() {
		heapArray.set(0, heapArray.get(heapArray.size()-1));
		heapArray.remove(heapArray.size()-1);
		
		if (heapArray.size() == 0)
			return null;
		
		trickelDown();
		return heapArray.get(0);
	}
	
	private Node<T> trickelDown() {
		Node<T> current =heapArray.get(0);
		if (heapArray.size() == 1)
			return current;
		
		int currentIndex = 0;
		int leftChildIndex = -1;
		Node<T> leftChild =null;		
		int rightChildIndex = -1;
		Node<T> rightChild = null;
		int size = heapArray.size();
		while(currentIndex < size/2) {
			
			leftChildIndex = 2*currentIndex+1;
			rightChildIndex = 2*currentIndex+2;
			if (leftChildIndex<size)
				leftChild = heapArray.get(leftChildIndex);
			if (rightChildIndex<size)
				rightChild = heapArray.get(rightChildIndex);
			if(rightChildIndex<size && leftChild.data.compareTo(rightChild.data) < 0) {
				if (current.data.compareTo(rightChild.data) <0) {
					heapArray.set(currentIndex, rightChild);
					heapArray.set(rightChildIndex, current);
					currentIndex = rightChildIndex;
				}else {
					return current;
				}
			}else {
				if (current.data.compareTo(leftChild.data) <0) {
					heapArray.set(currentIndex, leftChild);
					heapArray.set(leftChildIndex, current);
					currentIndex = leftChildIndex;
				}else {
					return current;
				}
			}
			
		}
		return null;
	}
	/**
	 * Insertion uses trickle up approach
	 * 	1. Add new element in last index of an array.
	 * 	2. Then start comparing with its parent, if new node is greater than parent swap it else stop
	 * 
	 * To Find Parent :is (x-1) / 2.
	 * @param element
	 */
	public void insert(T element) {
		Node<T> newNode = new Node<T>(element);
		heapArray.add(newNode);
		if (heapArray.size() !=1)
			trickleUp(newNode);
		
	}
	private void trickleUp(Node<T> newNode) {
		int currentIndex = heapArray.indexOf(newNode);
		int parentIndex = (currentIndex-1)/2;
		Node<T> parent = heapArray.get(parentIndex);
		while(parent.data.compareTo(newNode.data) < 0 && parentIndex != currentIndex) {
			//Node<T> temp = heapArray.get(currentIndex);
			heapArray.set(currentIndex, parent);
			heapArray.set(parentIndex, newNode);
			currentIndex = parentIndex;
			parentIndex = (currentIndex-1)/2;
			parent = heapArray.get(parentIndex);
		}
	}
}
