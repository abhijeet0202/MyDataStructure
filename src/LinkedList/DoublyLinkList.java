/**
 * 
 */
package LinkedList;

/**
 * @author Aryan
 *
 */
public class DoublyLinkList<T> {
	
	private DoublyLinkBean<T> first;
	private DoublyLinkBean<T> last;
	
	
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
	public void insertFirst(T element) {
		
		DoublyLinkBean<T> node = new DoublyLinkBean<T>(element);
		
		
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
	public void insertLast(T element) {
		
		DoublyLinkBean<T> node = new DoublyLinkBean<T>(element);
		
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
	public boolean insertAfter(T element) {
		
		DoublyLinkBean<T> node = new DoublyLinkBean<T>(element);
		
		DoublyLinkBean<T> current = first;
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
	
	/*
	 *******************************************************
	 * DELETE FIRST
	 *******************************************************
	 * Step 1: If list is empty simply throw error.
	 * Step 2: Corner Case - if only one node present (first.next ==null),
	 * 		   this means we need to handle "last" also,Assign "last" as null 
	 * 		   And, First.last automatically contains "null" so simply assign it to "first"
	 * 		   So, now both "first" and "last" is null.
	 * Step 3: Otherwise, Assign "null" to 2nd node's "previous", which actually 
	 * 		   pointing to 1st node.(which need to be deleted).
	 *        Then, assign first.next = first, which contains next address.
	 */
	@SuppressWarnings("unchecked")
	T deleteFirst(){
		DoublyLinkBean<T> current = first;
		if(!isEmpty()){
			if (first.next == null){
				last = null;
			} else {
				first.next.previous = null;
			}
			first = first.next;
		}else
			System.out.println("No Node Exist");		
		return (T)current;
	}
	
	/*
	 *******************************************************
	 * DELETE LAST
	 *******************************************************
	 * Step 1: If list is empty simply throw error.
	 * Step 2: Corner Case - if only one node present (first.next ==null),
	 * 		   this means we need to last as null 
	 * 		   And, First.last automatically contains "null" so simply assign it to "first"
	 * 		   So, now both "first" and "last" is null.
	 * Step 3: Otherwise, Assign "null" to 2nd's last node's "next", which actually 
	 * 		   pointing to last node.(which need to be deleted). [last.previous.next= null]
	 *        Then, assign last with last's->previous.
	 */
	@SuppressWarnings("unchecked")
	T deleteLast(){
		DoublyLinkBean<T> current = last;
		if(!isEmpty()){
			if (first.next == null){
				last = null;
			}else{
				last.previous.next = null;
			}
			last = last.previous;
		}else
			System.out.println("No Node Exist");		
		return (T)current;
	}
	
	/*
	 * 
	 */
	@SuppressWarnings("unchecked")
	T deleteKey(T element){
		DoublyLinkBean<T> current = first;
		while (current.iData != element){
			current = current.next;
			if (current == null)
				return null;
		}
		if (current == first){
			first = current.next;
		}else{
			current.previous.next = current.next;
		}
		
		if (current == last){
			last = current.previous;
		}else{
			current.next.previous = current.previous;
		}
		return(T)current;
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
	void displayForwardList() {
		DoublyLinkBean<T> current = (DoublyLinkBean<T>) first;
		while (current != null) {
			current.display();
			current = current.next;
		}
	}
	
	/*
	 * ******************************************************
	 * DISPLAY COMPLETE LIST
	 * ****************************************************** 
	 * 1. Copy the reference of "last" in another variable "current"
	 * 2. Iterate the loop until "current" encountered null
	 * 		Display the content.
	 * 		Increment the "current" with "current.previous"  
	 */
	void displayBackwardList() {
		DoublyLinkBean<T> current = (DoublyLinkBean<T>) last;
		while (current != null) {
			current.display();
			current = current.previous;
		}
	}
}
