/**
 * 
 */
package LinkedList;

import java.util.Scanner;


/**
 * @author aryan
 *
 */
public class SinglyLinkList {
	
	private SinglyLinkBean first;
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
	 * 1. First Step will Be Copy the current "first" content, first may contains null or it may contains next node address.
	 *    So We need to copy that content (i.e reference) in newly created node's->next.
	 * 2. Now, above is done Both "first" and "node.next" contains same value(null || reference of any node)
	 * 3. Now, Copy the "node" itself address to "first", so that "first", starts pointing to newly created node. 
	 */
	void insertFirst(){
		/*Ask User for input data */
		scan = new Scanner(System.in);
		System.out.println("Enter an Integer Number");
		int iData = scan.nextInt();
		SinglyLinkBean node = new SinglyLinkBean(iData);
		
		
		node.next = first;
		first = node;
		
	}
	/*
	 * ******************************************************
	 * DELETE FIRST
	 * ****************************************************** 
	 * 1. To remove the first node, simply copy the reference of "first.next" to "first"
	 *    But, Before doing this, check whether list should not be empty
	 * Optional:
	 * 	  if We want to return the deleted node to show or print then copy the "first" in temporary.
	 *    Otherwise not required, once GC will start it will clean up that deleted node (or unused node) 
	 */
	SinglyLinkBean deleteFirst(){
		SinglyLinkBean temp = first;
		
		if(!isEmpty())
			first = first.next;
		else
			System.out.println("No Node Exist");
		return temp;
	}
	
	/*
	 * ******************************************************
	 * DELETE NODE(Given Node will be deleted, if present)
	 * ****************************************************** 
	 * 1. To remove the given node, create 2 copy of List Object "previous" and "current"
	 * 2. Before Start deletion logic, check whether list should not be empty
	 * 3. If Not Empty, Iterate a loop using current (i.e. initialize with first) until "null" not get encountered.
	 * 4. Check the current item with key element, if matches, check
	 * 		4a. if current == first (Means given element is the first node, simply current.next to first)
	 * 		4b. if current != first ,then copy current.next node to previous.next
	 * 5. if current item is not matched with given key element.
	 * 6. Copy the current reference to previous
	 * 7. and increment current = current.next 
	 * 
	 */
	SinglyLinkBean deleteNode(int element){
		SinglyLinkBean previous = null;
		SinglyLinkBean current = first;
		
		if(!isEmpty()){
			while(current != null){
				if (current.iData == element){
					if (current == first)
						first = current.next;
					else
						previous.next = current.next;
					break;
				}
				previous = current;
				current = current.next;
			}
		}
		else
			System.out.println("No Node Exist");
		return current;
	}
	
	/*
	 * ******************************************************
	 * FIND NODE(Given Node will be returned, if present)
	 * ****************************************************** 
	 * 1. To find the given node, create a copy of List Object "current" assign with "first"
	 * 2. Before Start deletion logic, check whether list should not be empty
	 * 3. If Not Empty, Iterate a loop using current (i.e. initialize with first) until "null" not get encountered.
	 * 4. Check the current item with key element, if matches, return "current"
	 * 5. if current item is not matched with given key element, increment current = current.next 
	 * 
	 */
	SinglyLinkBean find(int element){
		SinglyLinkBean current = first;
		
		if(!isEmpty()){
			while(current != null){
				if (current.iData == element){
					return current;
				}
				current = current.next;
			}
		}
		else
			System.out.println("No Node Exist");
		return current;
	}
	
	/*
	 * ******************************************************
	 * DISPLAY COMPLETE LIST
	 * ****************************************************** 
	 * 1. Copy the reference of "first" in another variable "current"
	 * 2. Iterate the loop until "current" encountered null
	 * 		Display the content.
	 * 		Increment the "current" with "current.next"  
	 */
	void displayList() {
		SinglyLinkBean current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
	}

	public static void main(String[] args) {
		SinglyLinkList linkList = new SinglyLinkList();
		linkList.deleteFirst();
		linkList.insertFirst();
		linkList.insertFirst();
		System.out.println("Node " + linkList.deleteFirst() + " deleted");
		linkList.insertFirst();
		SinglyLinkBean bean = linkList.deleteNode(2);
		System.out.println("Node " + bean.display() + " deleted");
		linkList.displayList();
	}
}
