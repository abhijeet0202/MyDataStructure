/**
 * 
 */
package LinkedList;

/**
 * @author aryan
 *
 */
public class SinglyLinkList<T> {
	
	public SinglyLinkBean<T> first;
	
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
	void insertFirst(T element){
		SinglyLinkBean<T> node = new SinglyLinkBean<T>(element);		
		node.next = (SinglyLinkBean<T>) first;
		first = (SinglyLinkBean<T>) node;
		
	}
	
	/*
	 * ******************************************************
	 * INSERT LAST
	 * ****************************************************** 
	 * 1. First Step is to check weather first is null or not, if first is null it means no item present so simply assign
	 * 	  newly constructed node to first.
	 * 2. Now, if first was not null, then traverse till the end of list (i.e current.next == null), Once we reach
	 * 	  assign the newly constructed node to current.next    
	 */
	void insertLast(T element){
		SinglyLinkBean<T> node = new SinglyLinkBean<T>(element);
		SinglyLinkBean<T> current = first;
		
		if (first == null){
			first = (SinglyLinkBean<T>) node;
		}
		else {
			while (current.next != null){
				current = current.next;
			}
			current.next = node;
		}
		
	}
	
	/*
	 * ******************************************************
	 * INSERT NODE(After given element)
	 * ****************************************************** 
	 * 1. First Step is to check weather first is null or not, if first is null it means no item present so simply assign
	 * 	  newly constructed node to first.
	 * 2. Now, if first was not null, then start traversing till the end of list (i.e current.next == null), and find the given
	 * 	  element, if found:
	 * 		a. 1st assign content of current.next to node.next, Now both current.next and node.next point to his next address.
	 * 		b. after then assign newly constructed node address to current.next now link was constructed i.e. current.next points
	 *         to newly construced node address, wheras newly node.next point to next given items address.
	 * 3. if we failed to find given item simply add newly node at last. i.e. pevious.next = node; 
	 */
	void insertNode(T element, T item){
		SinglyLinkBean<T> node = new SinglyLinkBean<T>(element);
		SinglyLinkBean<T> current = first;
		SinglyLinkBean<T> previous = null;
		
		if (first == null){
			first = (SinglyLinkBean<T>) node;
			return;
		}
		else {
			while (current != null){
				if (current.iData == item){
					node.next = current.next;
					current.next = node;
					return;
				}
				previous = current;
				current = current.next;				
			}
		}
		previous.next = node;
		
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
	@SuppressWarnings("unchecked")
	T deleteFirst(){
		SinglyLinkBean<Integer> temp = (SinglyLinkBean<Integer>) first;
		
		if(!isEmpty())
			first = first.next;
		else
			System.out.println("No Node Exist");
		return (T) temp;
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
	@SuppressWarnings("unchecked")
	SinglyLinkBean<T> deleteNode(int element){
		SinglyLinkBean<Integer> previous = null;
		SinglyLinkBean<Integer> current = (SinglyLinkBean<Integer>) first;
		
		if(!isEmpty()){
			while(current != null){
				if (current.iData == element){
					if (current == first)
						first = (SinglyLinkBean<T>) current.next;
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
		return (SinglyLinkBean<T>) current;
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
	@SuppressWarnings("unchecked")
	T find(int element){
		SinglyLinkBean<Integer> current = (SinglyLinkBean<Integer>) first;
		
		if(!isEmpty()){
			while(current != null){
				if (current.iData == element){
					return (T) current;
				}
				current = current.next;
			}
		}
		else
			System.out.println("No Node Exist");
		return (T)current;
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
	@SuppressWarnings("unchecked")
	void displayList() {
		SinglyLinkBean<Integer> current = (SinglyLinkBean<Integer>) first;
		while (current != null) {
			current.display();
			current = current.next;
		}
	}

	public static void main(String[] args) {
		/*SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.deleteFirst();
		linkList.insertFirst();
		linkList.insertFirst();
		System.out.println("Node " + linkList.deleteFirst() + " deleted");
		linkList.insertFirst();
		SinglyLinkBean<Integer> bean = linkList.deleteNode(2);
		System.out.println("Node " + bean.display() + " deleted");
		linkList.displayList();*/
	}
}
