/**
 * 
 */
package Queue;

/**
 * @author I17996
 *
 */
public class ArrayQueueBean {
	
	protected final Object[] element;
	protected int rear = -1;
	protected int front = -1;
	protected int MAX_SIZE = 20;
	
	public ArrayQueueBean(int maxSize) {
		this.MAX_SIZE = maxSize;
		this.element = new Object[maxSize];
	}
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
