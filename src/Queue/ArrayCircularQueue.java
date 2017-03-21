/**
 * 
 */
package Queue;

/**
 * @author Aryan
 *
 */
public class ArrayCircularQueue<T> extends Queue<T> {


	ArrayCircularQueue() {
	}

	ArrayCircularQueue(int maxSize) {
		super(maxSize);
	}

	@Override
	void insert(T element) {

		if (((rear+1)%MAX_SIZE)== front) {
			throw new StackOverflowError("Queue OverFlow...");
		} else {
			rear =(rear+1)%MAX_SIZE;
			this.element[rear] = element;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + rear);
			if (front == -1)
				front =0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	T remove() {
		if (front == -1 ){
			throw new StackOverflowError("Queue UnderFlows...");
		}
		else {
			
			System.out.println("Initaited Removing Element: " + this.element[front]
					+ " from head index :" + front);
			Object returnValue = this.element[front];
			this.element[front] = null;
			
			System.out.println("Successfully Removed Element: " + this.element[front]
					+ " in head index :" + front);
			
			if(front == rear)
				front = rear =-1;
			else
				front = (front + 1) % MAX_SIZE;
			return (T) returnValue;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	T peek() {
		if (front == -1 || front != rear) {
			throw new StackOverflowError("Queue UnderFlow...");
		}else{
			System.out.println("Front Element is: " + this.element[front] + " in index :" + front);
			return (T) this.element[front];
		}
	}
	
	@Override
	boolean isEmpty() {
		if (rear == -1)
			return true;
		else
			return false;
				
	}

	@Override
	boolean isFull() {
		if (((rear+1)%MAX_SIZE)== front){
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
