/**
 * 
 */
package Stack;

/**
 * @author Aryan
 *
 */
abstract class Stack<T> {

	abstract void push(T stack);

	abstract T pop();

	abstract T top();
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	abstract boolean isEmpty();
	
	abstract boolean isFull();
	
	
}
