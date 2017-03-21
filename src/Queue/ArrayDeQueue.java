package Queue;

public class ArrayDeQueue<T> extends Queue<T>{
	
	public ArrayDeQueue() {	}
	
	public ArrayDeQueue(int maxSize){
		super(maxSize);
	}
	
	@Override
	void insert(T element) {
		insertRear(element);
	}
	
	void insertRear(T element){
		if ((rear+1) == MAX_SIZE){
			throw new StackOverflowError("Queue OverFlow...");
		} else {
			this.element[++rear] = element;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + rear);
			if (front == -1)
				front =0;
		}
	}
	
	void insertFront(T element){
		if (front == -1){
			this.element[++front] = element;
			++rear;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + front);
		}
		else if ((front -1) == -1){
			throw new StackOverflowError("Queue OverFlow...");
		} else{
			this.element[--front] = element;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + front);
		}
	}

	@Override
	T remove() {
		return removeFront();
	}
	
	@SuppressWarnings("unchecked")
	T removeFront(){
		if (front == -1){
			throw new StackOverflowError("Queue Underflow..");
		} else {
			Object returnValue = this.element[front];
			this.element[front] = null;
			if (front == rear )
				rear = front =-1;
			if (front < rear)
				front++;
			return (T) returnValue;
		}
	}
	
	@SuppressWarnings("unchecked")
	T removeRear(){
		if (rear == -1){
			throw new StackOverflowError("Queue Underflow..");
		} else {
			Object returnValue = this.element[rear];
			this.element[rear] = null;
			rear--;
			if (rear == -1 || rear < front)
				rear = front =-1;
			return (T) returnValue;
		}
	}

	@Override
	T peek() {
		return peekLeft();
	}
	
	@SuppressWarnings("unchecked")
	T peekLeft(){
		if (front == -1){
			throw new StackOverflowError("Queue Underflow..");
		} else {
			System.out.println("Front Element is: " + this.element[front] + " in index :" + front);
			return (T) this.element[front];
		}
	}
	
	@SuppressWarnings("unchecked")
	T peekRight(){
		if (rear == -1){
			throw new StackOverflowError("Queue Underflow..");
		} else {
			System.out.println("Front Element is: " + this.element[rear] + " in index :" + rear);
			return (T) this.element[rear];
		}
	}
	
	@Override
	boolean isEmpty(){
		return front == -1;
	}
	
	@Override
	boolean isFull(){
		return rear == MAX_SIZE;
	}
}
