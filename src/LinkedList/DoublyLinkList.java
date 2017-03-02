/**
 * 
 */
package LinkedList;

import java.util.Scanner;

/**
 * @author Aryan
 *
 */
public class DoublyLinkList {
	
	private DoublyLinkBean first;
	private DoublyLinkBean last;
	private Scanner scan;
	
	
	/*
	 * Check if object who invoked isEmpty() contains any list or it 
	 * is empty, Return True if Empty else False
	 */
	boolean isEmpty(){
		return (first == null);
	}
	
	/*
	 * ******************************************************
	 * INSERT FIRST
	 * ****************************************************** 
	 * 1. Now, if link list is empty, then just copy reference of new node in last.
	 * 2. Else(it means) at least a list is present, so goto that list "previous"
	 *    (i.e first.previous) and save the newly node reference, now backward iterate get started
	 * 3. Copy the address/reference present in "first" to newly created node's.first
	 *    if list is blank "null" will be copied if it have any list, then newly node's
	 *    first will start pointing it.
	 * 4. Now, copy the address of newly node to first. So that it starts pointing this
	 *    node, and this way we created the one way at least.
	 */
	public void insertFirst() {
		scan = new Scanner(System.in);
		int iData = scan.nextInt();
		DoublyLinkBean node = new DoublyLinkBean(iData);
		
		
		if (!isEmpty()) // If linked list is Empty
			last = node; // Add new node in last
		else
			first.previous = node; // If link is not empty, then copy new node address in old.previous
		node.next = first; //Now copy  whatever address saved in "first" may be "null" or next node in node's next.
		first = node; //Finally assign reference of newly node to first
	}
	
	/*
	 * ******************************************************
	 * INSERT LAST
	 * ****************************************************** 
	 * 1. Now, if link list is empty, then just copy reference of new node in first.
	 * 2. Else(it means) at least a list is present, copy the last address, in newly
	 *    created node's.previous.
	 * 3. copy the new node address into last.next
	 * 4. Now, copy the address of newly node to last. 
	 */
	public void insertLast() {
		scan = new Scanner(System.in);
		int iData = scan.nextInt();
		DoublyLinkBean node = new DoublyLinkBean(iData);
		
		if (!isEmpty()) // If linked list is Empty
			first = node; // Add new node in first
		else{
			node.previous = last;
			last.next = node;
		}
		last = node; //Finally assign reference of newly node to last
	}
	
	/*
	 * ******************************************************
	 * INSERT AFTER
	 * ****************************************************** 
	 * 1. Now, if link list is empty, then just copy reference of new node in first.
	 * 2. Else(it means) at least a list is present, copy the last address, in newly
	 *    created node's.previous.
	 * 3. copy the new node address into last.next
	 * 4. Now, copy the address of newly node to last. 
	 */
	public boolean insertAfter(int element) {
		scan = new Scanner(System.in);
		int iData = scan.nextInt();
		DoublyLinkBean node = new DoublyLinkBean(iData);
		
		DoublyLinkBean current = first;
		while (current.iData == element){
			current = current.next;
			if (current == null)
				return false;
		}
		if (current == last){
			last = node;
			
		}else{
			node.next = current.next;
			current.next.previous= node;
		}
		node.previous = current;
		current.next = node;
		return true;
	}
}
