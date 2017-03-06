/**
 * 
 */
package Queue;

/**
 * @author Aryan
 *
 */
public abstract class Queue {
	
	int element;
	public int rear = -1;
	public int front = -1;
	public final static int MAX_SIZE = 20;

	public Queue() {
	}

	Queue(int element) {
		this.element = element;
	}

	abstract boolean insert(int stack);

	abstract boolean remove();

	abstract boolean peek();
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	boolean isEmpty() {

		if (front <= -1 || front >= rear) {
			return true;
		}

		return false;
	}

	boolean isFull() {
		if (rear >= MAX_SIZE-1) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stack [element=").append(element).append("]");
		return builder.toString();
	}
}
