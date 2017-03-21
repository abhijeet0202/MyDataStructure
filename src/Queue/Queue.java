/**
 * 
 */
package Queue;

/**
 * @author Aryan
 *
 */
abstract class Queue<T> {
	
	
	abstract void insert(T stack);

	abstract T remove();

	abstract T peek();
	
	abstract boolean isEmpty();
	
	abstract boolean isFull();
	
}
