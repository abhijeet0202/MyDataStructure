package Queue;

import LinkedList.DoubleEndedSinglyList;

public class LinkedListQueue extends Queue{
	
	private DoubleEndedSinglyList doubleEndedSinglyList;

	public LinkedListQueue() {
		doubleEndedSinglyList = new DoubleEndedSinglyList();
	}
	
	@Override
	boolean insert(int stack) {
		doubleEndedSinglyList.insertLast();
		return true;
	}

	@Override
	boolean remove() {
		doubleEndedSinglyList.deleteFirst();
		return true;
	}

	@Override
	boolean peek() {
		if(!doubleEndedSinglyList.isEmpty()){
			doubleEndedSinglyList.displayList();
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		LinkedListQueue linkedListQueue = new LinkedListQueue();
		linkedListQueue.insert(0);
		linkedListQueue.insert(0);
		linkedListQueue.insert(0);
		linkedListQueue.insert(0);
		linkedListQueue.remove();
	}

}
