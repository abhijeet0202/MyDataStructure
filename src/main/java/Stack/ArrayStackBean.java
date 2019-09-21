/**
 * 
 */
package Stack;

/**
 * @author I17996
 *
 */
public class ArrayStackBean {
	protected int top = -1;
	protected int MAX_SIZE;
	protected final Object[] element;
	
	public ArrayStackBean() {
		MAX_SIZE = 20;
		this.element = new Object[MAX_SIZE];
	}
	
	public ArrayStackBean(int maxSize) {
		this.element = new Object[maxSize];
		MAX_SIZE = maxSize;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stack [element=").append(element).append("]");
		return builder.toString();
	}

}
