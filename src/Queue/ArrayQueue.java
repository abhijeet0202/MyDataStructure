package Queue;

public class ArrayQueue<T> extends Queue<T> {
	
	ArrayQueue(){}
	ArrayQueue(int maxSize){
		super(maxSize);
	}
	
	@Override
	void insert(T element) {
		if (rear < MAX_SIZE-1) {
			if(rear == -1)
				++front;
			this.element[++rear] = element;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + rear);
		}else{
			throw new StackOverflowError("Queue OverFlow...");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	T remove() {
		if (front >= 0 && front <= rear) {
			System.out.println("Initaited Removing Element: " + this.element[front] + " from head index :" + front);
			Object returnValue = this.element[front];
			this.element[front] = null;
			System.out.println("Successfully Removed Element: " + this.element[front] + " in head index :" + front);
			front++;
			return (T) returnValue;
		}else{
			throw new StackOverflowError("Queue UnderFlow...");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	T peek() {
		if (front <= rear) {
			System.out.println("Front Element is: " + this.element[front] + " in index :" + front);
			return (T) this.element[front];
		}else{
			throw new StackOverflowError("Queue UnderFlow...");
		}
	}
	@Override
	boolean isEmpty() {

		if (front <= -1 || front >= rear) {
			return true;
		}

		return false;
	}

	@Override
	boolean isFull() {
		return rear == MAX_SIZE-1;
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
