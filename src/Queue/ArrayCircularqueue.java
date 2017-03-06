/**
 * 
 */
package Queue;

/**
 * @author Aryan
 *
 */
public class ArrayCircularqueue extends Queue {

	static Queue[] arrayCircularqueue;

	ArrayCircularqueue() {
	}

	ArrayCircularqueue(int element) {
		super(element);
	}

	@Override
	boolean insert(int element) {

		if (((rear+1)%MAX_SIZE)== front) {
			System.out.println("Queue OverFlow...");
			return false;
		} else {
			rear =(rear+1)%MAX_SIZE;
			Queue queue = new ArrayCircularqueue(element);
			ArrayCircularqueue.arrayCircularqueue[rear] = queue;
			System.out.println("Successfully Inserted Element: " + element + " in head index :" + rear);
			if (front == -1)
				front =0;
			return true;
		}
	}

	@Override
	boolean remove() {
		if (front == -1 ){
			System.out.println("Queue UnderFlows...");
			return false;
		}
		else {
			
			System.out.println("Initaited Removing Element: " + ArrayCircularqueue.arrayCircularqueue[front]
					+ " from head index :" + front);
			ArrayCircularqueue.arrayCircularqueue[front] = null;
			
			System.out.println("Successfully Removed Element: " + ArrayCircularqueue.arrayCircularqueue[front]
					+ " in head index :" + front);
			
			if(front == rear)
				front = rear =-1;
			else
				front = (front + 1) % MAX_SIZE;
			return true;
		}
	}

	@Override
	boolean peek() {
		if (front == -1 || front != rear) {
			System.out.println("Queue UnderFlow...");
			return false;
		}else{
			System.out.println("Front Element is: " + ArrayCircularqueue.arrayCircularqueue[front] + " in index :" + front);
			return true;
		}
	}
	
	boolean isEmpty() {
		if (rear == -1)
			return true;
		else
			return false;
				
	}


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
		arrayCircularqueue = new ArrayCircularqueue[MAX_SIZE];

		ArrayCircularqueue arrayCircularqueue = new ArrayCircularqueue();
		for (int i = 0; i < 21; i++) {
			arrayCircularqueue.insert(i*2);
		}
		System.out.println(arrayCircularqueue.isEmpty());
		System.out.println(arrayCircularqueue.isFull());

		for (int i = 0; i < 21; i++) {
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
