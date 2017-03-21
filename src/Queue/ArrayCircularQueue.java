/**
 * 
 */
package Queue;

/**
 * @author Aryan
 *
 */
public class ArrayCircularQueue<T> extends Queue<T> {

	ArrayQueueBean arrayQueueBean = null;
	ArrayCircularQueue() {
	}

	ArrayCircularQueue(int maxSize) {
		arrayQueueBean = new ArrayQueueBean(maxSize);
	}

	@Override
	void insert(T element) {

		if (((arrayQueueBean.rear+1)%arrayQueueBean.MAX_SIZE)== arrayQueueBean.front) {
			throw new StackOverflowError("Queue OverFlow...");
		} else {
			arrayQueueBean.rear =(arrayQueueBean.rear+1)%arrayQueueBean.MAX_SIZE;
			arrayQueueBean.element[arrayQueueBean.rear] = element;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + arrayQueueBean.rear);
			if (arrayQueueBean.front == -1)
				arrayQueueBean.front =0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	T remove() {
		if (arrayQueueBean.front == -1 ){
			throw new StackOverflowError("Queue UnderFlows...");
		}
		else {
			
			System.out.println("Initaited Removing Element: " + arrayQueueBean.element[arrayQueueBean.front]
					+ " from head index :" + arrayQueueBean.front);
			Object returnValue = arrayQueueBean.element[arrayQueueBean.front];
			arrayQueueBean.element[arrayQueueBean.front] = null;
			
			System.out.println("Successfully Removed Element: " + arrayQueueBean.element[arrayQueueBean.front]
					+ " in head index :" + arrayQueueBean.front);
			
			if(arrayQueueBean.front == arrayQueueBean.rear)
				arrayQueueBean.front = arrayQueueBean.rear =-1;
			else
				arrayQueueBean.front = (arrayQueueBean.front + 1) % arrayQueueBean.MAX_SIZE;
			return (T) returnValue;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	T peek() {
		if (arrayQueueBean.front == -1 || arrayQueueBean.front != arrayQueueBean.rear) {
			throw new StackOverflowError("Queue UnderFlow...");
		}else{
			System.out.println("Front Element is: " + arrayQueueBean.element[arrayQueueBean.front] + " in index :" + arrayQueueBean.front);
			return (T) arrayQueueBean.element[arrayQueueBean.front];
		}
	}
	
	@Override
	boolean isEmpty() {
		if (arrayQueueBean.rear == -1)
			return true;
		else
			return false;
				
	}

	@Override
	boolean isFull() {
		if (((arrayQueueBean.rear+1)%arrayQueueBean.MAX_SIZE)== arrayQueueBean.front){
			return true;
		}
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxSize = 20;

		Queue<Integer> arrayCircularqueue = new ArrayCircularQueue<Integer>(maxSize);
		for (int i = 0; i < maxSize; i++) {
			arrayCircularqueue.insert(i*2);
		}
		System.out.println(arrayCircularqueue.isEmpty());
		System.out.println(arrayCircularqueue.isFull());

		for (int i = 0; i < maxSize; i++) {
			arrayCircularqueue.remove();
		}
		arrayCircularqueue.insert(2);
		arrayCircularqueue.insert(3);
		arrayCircularqueue.insert(4);
		arrayCircularqueue.remove();
		arrayCircularqueue.remove();
		arrayCircularqueue.remove();
		System.out.println(arrayCircularqueue.isEmpty());
		System.out.println(arrayCircularqueue.isFull());
	}

}
