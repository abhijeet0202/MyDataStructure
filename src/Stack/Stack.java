/**
 * 
 */
package Stack;

/**
 * @author Aryan
 *
 */
abstract class Stack<T> {

	protected int top = -1;
	protected int MAX_SIZE;
	protected final Object[] element;
	
	public Stack() {
		MAX_SIZE = 20;
		this.element = new Object[MAX_SIZE];
	}
	
	public Stack(int maxSize) {
		this.element = new Object[maxSize];
		MAX_SIZE = maxSize;
	}

	abstract void push(T stack);

	abstract T pop();

	abstract T peek();
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	boolean isEmpty(){
		return top == -1;
	}
	
	boolean isFull(){
		return top == MAX_SIZE;
	}
	
	public int getTop(){
		return top;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stack [element=").append(element).append("]");
		return builder.toString();
	}
}
