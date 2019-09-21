package Queue;

public class ArrayQueue<T> extends Queue<T> {
	
	ArrayQueueBean arrayQueueBean = null;
	
	ArrayQueue(){}
	
	ArrayQueue(int maxSize){
		arrayQueueBean = new ArrayQueueBean(maxSize);
	}
	
	@Override
	void insert(T element) {
		if (arrayQueueBean.rear < arrayQueueBean.MAX_SIZE-1) {
			if(arrayQueueBean.rear == -1)
				++arrayQueueBean.front;
			arrayQueueBean.element[++arrayQueueBean.rear] = element;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + arrayQueueBean.rear);
		}else{
			throw new StackOverflowError("Queue OverFlow...");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	T remove() {
		if (arrayQueueBean.front >= 0 && arrayQueueBean.front <= arrayQueueBean.rear) {
			System.out.println("Initaited Removing Element: " + arrayQueueBean.element[arrayQueueBean.front] + " from head index :" + arrayQueueBean.front);
			Object returnValue = arrayQueueBean.element[arrayQueueBean.front];
			arrayQueueBean.element[arrayQueueBean.front] = null;
			System.out.println("Successfully Removed Element: " + arrayQueueBean.element[arrayQueueBean.front] + " in head index :" + arrayQueueBean.front);
			arrayQueueBean.front++;
			return (T) returnValue;
		}else{
			throw new StackOverflowError("Queue UnderFlow...");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	T peek() {
		if (arrayQueueBean.front <= arrayQueueBean.rear) {
			System.out.println("Front Element is: " + arrayQueueBean.element[arrayQueueBean.front] + " in index :" + arrayQueueBean.front);
			return (T) arrayQueueBean.element[arrayQueueBean.front];
		}else{
			throw new StackOverflowError("Queue UnderFlow...");
		}
	}
	@Override
	boolean isEmpty() {

		if (arrayQueueBean.front <= -1 || arrayQueueBean.front >= arrayQueueBean.rear) {
			return true;
		}

		return false;
	}

	@Override
	boolean isFull() {
		return arrayQueueBean.rear == arrayQueueBean.MAX_SIZE-1;
	}

	
	public static void main(String[] args) {
		
		int maxSize = 20;
		Queue<Integer> queue = new ArrayQueue<Integer>(maxSize);
		
		for(int i =0 ;i<maxSize; i++){
			queue.insert(i*5);
		}
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		
		for(int i =0 ;i<maxSize; i++){
			queue.remove();
		}
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
	}

}
