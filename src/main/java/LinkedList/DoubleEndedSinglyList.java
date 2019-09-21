package LinkedList;

public class DoubleEndedSinglyList<T> {
	private SinglyLinkBean<T> first;
	private SinglyLinkBean<T> last;
	
	/*
	 * Check if object who invoked isEmpty() contains any list or it 
	 * is empty, Return True if Empty else False
	 */
	public boolean isEmpty(){
		return (first == null);
	}
	
	/*
	 * ******************************************************
	 * INSERT FIRST
	 * ****************************************************** 
	 * 1. First Step will be to check first is null or not, if its null then copy newly constructed node reference in last
	 * 2. Second Step will Be Copy the current "first" content, first may contains null or it may contains next node address.
	 *    So We need to copy that content (i.e reference) in newly created node's->next.
	 * 3. Now, above is done Both "first" and "node.next" contains same value(null || reference of any node)
	 * 4. Now, Copy the "node" itself address to "first", so that "first", starts pointing to newly created node. 
	 */
	public void insertFirst(T element){
		
		SinglyLinkBean<T> node = new SinglyLinkBean<T>(element);
		
		if(isEmpty())
			last = node;
		node.next = first;
		first = node;
		
	}
	
	/*
	 * ******************************************************
	 * INSERT LAST
	 * ****************************************************** 
	 * 1. First Step will be to check first is null or not, if its null then copy newly constructed node reference in first and last both
	 * 2. if list was not empty, then simply copy reference of newly node on both "last" as well as "last.next"
	 */
	public void insertLast(T element){
		
		SinglyLinkBean<T> node = new SinglyLinkBean<T>(element);
		
		if( isEmpty())
			first = node;
		else
			last.next = node;
		last = node;
	}
	
	/*
	 * ******************************************************
	 * DELETE FIRST
	 * ****************************************************** 
	 * 1. To remove the first node, simply copy the reference of "first.next" to "first"
	 *    But, Before doing this, check whether list should not be empty
	 *    This check assures list is not empty, we are good to delete the node
	 *	  FYI, it may happen Current List have only 1 node remains or more than a node
	 *  
	 * 2. Again put a check ,if Current list had only single node, which get deleted 
	 *    in above line, then we need to make sure "last" should not hold that node, 
	 *    so we need to initialize "null" to "last" 
	 *
	 * Optional:
	 * 	  if We want to return the deleted node to show or print then copy the "first" in temporary.
	 *    Otherwise not required, once GC will start it will clean up that deleted node (or unused node) 
	 */
	public SinglyLinkBean<T> deleteFirst(){
		SinglyLinkBean<T> temp = first;
		
		if(!isEmpty()){ 
			first = first.next;
			if (isEmpty()){ 
				last = null;
			}
		}
		else
			System.out.println("No Node Exist");
		return (SinglyLinkBean<T>)temp;
	}
	
	/*
	 * ******************************************************
	 * DELETE LAST
	 * ****************************************************** 
	 * 1 : To delete the last node we need to iterate till second last node, 
	 * 	   which keeps last node address.
	 * 2.: In case only single node present in list, which means first and last
	 * 	   both pointing to same node, In this case make both "first" and "last" null.
	 * 3 : Otherwise, make the current's next (second last node's pointing to last node) null.
	 * 	   and then assign the "current" address to "last"
	 * 
	 * * Optional:
	 * 	  if We want to return the deleted node to show or print then copy the "first" in temporary.
	 *    Otherwise not required, once GC will start it will clean up that deleted node (or unused node) 
	 */
	
	SinglyLinkBean<T> deleteLast() {
		SinglyLinkBean<T> current = (SinglyLinkBean<T>) first;

		if (!isEmpty()) {
			while (current.next != null) {
				//previous = current;
				current = current.next;
			}
		} else
			System.out.println("No Node Exist");

		//Means only 1 node left make both first and last null
		if (current == first){
			first =  null;
			last = null;
		} else {
			current.next = null;
			last = current;
		}
		return (SinglyLinkBean<T>) current;
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
	public void displayList(){
		SinglyLinkBean<T> current = first;
		while (current != null){
			current.display();
			current = current.next;
		}
	}
}
