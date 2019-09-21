package Queue;



public class LinkedListQueue<T> extends Queue<T>{
	
	ListQueueBean<T> first = null;
	

	public LinkedListQueue() {
	}
	@Override
	void insert(T element) {	
		
		ListQueueBean<T> newNode = new ListQueueBean<T>(element);
		if (first == null){
			first = (ListQueueBean<T>) newNode;
			return;
		}
		ListQueueBean<T> current = (ListQueueBean<T>) first;
		while(current.next != null){
			current = (ListQueueBean<T>) current.next;
		}		
		current.next = newNode;
	}

	@SuppressWarnings("unchecked")
	@Override
	T remove() {
		ListQueueBean<T> current = first;
		ListQueueBean<T> returnValue = null;;
		if (current == null)
			throw new StackOverflowError("Queue Underflow..");
		else{
			returnValue = current;
			first = (ListQueueBean<T>)current.next;
		}
		System.out.println("Deleting Value Presnt in First is :" +returnValue.iData);
		return (T) returnValue;
	}

	@SuppressWarnings("unchecked")
	@Override
	T peek() {
		ListQueueBean<T> current = first;
		if (current == null)
			throw new StackOverflowError("Queue Underflow..");
		else{
			System.out.println("Current Value Present in Peek is :" +current.iData);
			return (T) current;
		}
	}
	
	void displayList() {
		ListQueueBean<T> current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
	}
	
	@Override
	boolean isEmpty() {
		return first == null;
	}
	@Override
	boolean isFull() {
		// Not required to check overflow in linklist
		return false;
	}
	public static void main(String[] args) {
		LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<Integer>();
		linkedListQueue.insert(1);
		linkedListQueue.insert(2);
		linkedListQueue.insert(3);
		linkedListQueue.displayList();
		linkedListQueue.peek();
		linkedListQueue.remove();
		linkedListQueue.displayList();
		linkedListQueue.peek();
		linkedListQueue.remove();
		
		LinkedListQueue<String> strlinkedListQueue = new LinkedListQueue<String>();
		strlinkedListQueue.insert("Abhijeet");
		strlinkedListQueue.insert("Banerjee");
		strlinkedListQueue.insert("Aryan");
		strlinkedListQueue.displayList();
		strlinkedListQueue.peek();
		strlinkedListQueue.remove();
		strlinkedListQueue.displayList();
		strlinkedListQueue.peek();
		strlinkedListQueue.remove();
	}
	

}
