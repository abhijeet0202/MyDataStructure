package Queue;

public class ArrayPriorityQueue extends Queue{
	static Queue[] arrayPriorityCircularQueue;

	ArrayPriorityQueue() {
	}

	ArrayPriorityQueue(int element) {
		super(element);
	}

	@Override
	boolean insert(int priority) {
			return true;
	}

	@Override
	boolean remove() {
		return false;
	}

	@Override
	boolean peek() {
		return false;
	}
	
	boolean isEmpty() {
		
			return false;
				
	}


	boolean isFull() {
		
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		arrayPriorityCircularQueue = new ArrayPriorityQueue[MAX_SIZE];

		ArrayPriorityQueue arrayPriorityQueue = new ArrayPriorityQueue();
		for (int i = 0; i < 21; i++) {
			arrayPriorityQueue.insert(i*2);
		}
		System.out.println(arrayPriorityQueue.isEmpty());
		System.out.println(arrayPriorityQueue.isFull());

		for (int i = 0; i < 21; i++) {
			arrayPriorityQueue.remove();
		}
		arrayPriorityQueue.insert(2);
		arrayPriorityQueue.insert(3);
		arrayPriorityQueue.insert(4);
		arrayPriorityQueue.remove();
		arrayPriorityQueue.remove();
		arrayPriorityQueue.remove();
		System.out.println(arrayPriorityQueue.isEmpty());
		System.out.println(arrayPriorityQueue.isFull());
	}

}