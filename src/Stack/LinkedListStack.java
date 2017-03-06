package Stack;

import java.util.Scanner;

import LinkedList.SinglyLinkBean;

public class LinkedListStack{

	private SinglyLinkBean first;
	private Scanner scan;
	
	
	public static void main(String[] args) {
		LinkedListStack linkedListStack = new LinkedListStack();
	}


	/*
	 * ******************************************************
	 * INSERT FIRST || PUSH
	 * ****************************************************** 
	 * 1. First Step will Be Copy the current "first" content, first may contains null or it may contains next node address.
	 *    So We need to copy that content (i.e reference) in newly created node's->next.
	 * 2. Now, above is done Both "first" and "node.next" contains same value(null || reference of any node)
	 * 3. Now, Copy the "node" itself address to "first", so that "first", starts pointing to newly created node. 
	 */
	void push(){
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
	 * DELETE FIRST || POP
	 * ****************************************************** 
	 * 1. To remove the first node, simply copy the reference of "first.next" to "first"
	 *    But, Before doing this, check whether list should not be empty
	 * Optional:
	 * 	  if We want to return the deleted node to show or print then copy the "first" in temporary.
	 *    Otherwise not required, once GC will start it will clean up that deleted node (or unused node) 
	 */
	SinglyLinkBean pop(){
		SinglyLinkBean temp = first;
		
		if(!isEmpty())
			first = first.next;
		else
			System.out.println("No Node Exist");
		return temp;
	}

	/*
	 * ******************************************************
	 * RETURN FIRST || PEEk
	 * ****************************************************** 
	 * 1. return the first node. But, Before doing this, check whether list should not be empty
	 */
	SinglyLinkBean peek() {
		if (!isEmpty()){
			return first;
		}
		return null;
	}
	
	/*
	 * Check if object who invoked isEmpty() contains any list or it 
	 * is empty, Return True if Empty else False
	 */
	boolean isEmpty(){
		return (first == null);
	}

}
