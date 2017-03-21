/**
 * 
 */
package Queue;

/**
 * @author Aryan
 *
 */
abstract class Queue<T> {
	
	protected final Object[] element;
	protected int rear = -1;
	protected int front = -1;
	protected int MAX_SIZE = 20;

	public Queue() {
		this.MAX_SIZE = 20;
		this.element = new Object[MAX_SIZE];
	}

	Queue(int maxSize) {
		this.MAX_SIZE = maxSize;
		this.element = new Object[maxSize];
	}

	abstract void insert(T stack);

	abstract T remove();

	abstract T peek();
	
	abstract boolean isEmpty();
	
	abstract boolean isFull();
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Queue Elements:\n");
		for (int i = 0; i<element.length; i++){
			builder.append("Element in Index[").append(i).append("] is [").append(this.element[i]).append("]\n");
		}
		return builder.toString();
	}
}
