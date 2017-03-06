package Queue;

public class ArrayQueue extends Queue {
	
	static Queue[] queue;

	ArrayQueue(){}
	ArrayQueue(int element){
		super(element);
	}
	
	@Override
	boolean insert(int element) {
		if (rear < MAX_SIZE-1) {
			Queue queue = new ArrayQueue(element);
			ArrayQueue.queue[++rear] = queue;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + rear);
			return true;
		}else{
			System.out.println("Queue OverFlow...");
			return false;
		}
	}

	@Override
	boolean remove() {
		if (front >= 0 && front <= rear) {
			System.out.println("Initaited Removing Element: " + ArrayQueue.queue[front] + " from head index :" + front);
			ArrayQueue.queue[front] = null;
			System.out.println("Successfully Removed Element: " + ArrayQueue.queue[front] + " in head index :" + front);
			front++;
			return true;
		}else{
			System.out.println("Queue UnderFlow...");
			return false;
		}
	}

	@Override
	boolean peek() {
		if (front <= rear) {
			System.out.println("Front Element is: " + ArrayQueue.queue[front] + " in index :" + front);
			return true;
		}else{
			System.out.println("Queue UnderFlow...");
			return false;
		}
	}
	
	public static void main(String[] args) {
		queue = new ArrayQueue[MAX_SIZE];
		
		ArrayQueue arrayQueue = new ArrayQueue();
		for(int i =0 ;i<21; i++){
			arrayQueue.insert(i*5);
		}
		System.out.println(arrayQueue.isEmpty());
		System.out.println(arrayQueue.isFull());
		
		for(int i =0 ;i<21; i++){
			arrayQueue.remove();
		}
		System.out.println(arrayQueue.isEmpty());
		System.out.println(arrayQueue.isFull());
	}

}
