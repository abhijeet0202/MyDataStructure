package Queue;

public class ArrayDeQueue<T> extends Queue<T>{
	ArrayQueueBean arrayQueueBean = null;
	public ArrayDeQueue() {	}
	
	public ArrayDeQueue(int maxSize){
		arrayQueueBean = new ArrayQueueBean(maxSize);
	}
	
	@Override
	void insert(T element) {
		insertRear(element);
	}
	
	void insertRear(T element){
		if ((arrayQueueBean.rear+1) == arrayQueueBean.MAX_SIZE){
			throw new StackOverflowError("Queue OverFlow...");
		} else {
			arrayQueueBean.element[++arrayQueueBean.rear] = element;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + arrayQueueBean.rear);
			if (arrayQueueBean.front == -1)
				arrayQueueBean.front =0;
		}
	}
	
	void insertFront(T element){
		if (arrayQueueBean.front == -1){
			arrayQueueBean.element[++arrayQueueBean.front] = element;
			++arrayQueueBean.rear;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + arrayQueueBean.front);
		}
		else if ((arrayQueueBean.front -1) == -1){
			throw new StackOverflowError("Queue OverFlow...");
		} else{
			arrayQueueBean.element[--arrayQueueBean.front] = element;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + arrayQueueBean.front);
		}
	}

	@Override
	T remove() {
		return removeFront();
	}
	
	@SuppressWarnings("unchecked")
	T removeFront(){
		if (arrayQueueBean.front == -1){
			throw new StackOverflowError("Queue Underflow..");
		} else {
			Object returnValue = arrayQueueBean.element[arrayQueueBean.front];
			arrayQueueBean.element[arrayQueueBean.front] = null;
			if (arrayQueueBean.front == arrayQueueBean.rear )
				arrayQueueBean.rear = arrayQueueBean.front =-1;
			if (arrayQueueBean.front < arrayQueueBean.rear)
				arrayQueueBean.front++;
			return (T) returnValue;
		}
	}
	
	@SuppressWarnings("unchecked")
	T removeRear(){
		if (arrayQueueBean.rear == -1){
			throw new StackOverflowError("Queue Underflow..");
		} else {
			Object returnValue = arrayQueueBean.element[arrayQueueBean.rear];
			arrayQueueBean.element[arrayQueueBean.rear] = null;
			arrayQueueBean.rear--;
			if (arrayQueueBean.rear == -1 || arrayQueueBean.rear < arrayQueueBean.front)
				arrayQueueBean.rear = arrayQueueBean.front =-1;
			return (T) returnValue;
		}
	}

	@Override
	T peek() {
		return peekLeft();
	}
	
	@SuppressWarnings("unchecked")
	T peekLeft(){
		if (arrayQueueBean.front == -1){
			throw new StackOverflowError("Queue Underflow..");
		} else {
			System.out.println("Front Element is: " + arrayQueueBean.element[arrayQueueBean.front] + " in index :" + arrayQueueBean.front);
			return (T) arrayQueueBean.element[arrayQueueBean.front];
		}
	}
	
	@SuppressWarnings("unchecked")
	T peekRight(){
		if (arrayQueueBean.rear == -1){
			throw new StackOverflowError("Queue Underflow..");
		} else {
			System.out.println("Front Element is: " + arrayQueueBean.element[arrayQueueBean.rear] + " in index :" + arrayQueueBean.rear);
			return (T) arrayQueueBean.element[arrayQueueBean.rear];
		}
	}
	
	@Override
	boolean isEmpty(){
		return arrayQueueBean.front == -1;
	}
	
	@Override
	boolean isFull(){
		return arrayQueueBean.rear == arrayQueueBean.MAX_SIZE;
	}
}
