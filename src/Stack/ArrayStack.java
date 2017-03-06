/**
 * 
 */
package Stack;

/**
 * @author Aryan
 *
 */
public class ArrayStack<T> extends Stack<T> {

	public ArrayStack() {
		this(20);
	}
	
	public ArrayStack(int maxSize){
		super(maxSize);
		this.MAX_SIZE = maxSize -1;
		
	}
	
	@Override
	public void push(T element) {
		if (top < MAX_SIZE) {
			this.element[++top] = element;
			//System.out.println("Successfully Inserted Element: " + element + " in head index :" + top);
		} else {
			throw new StackOverflowError("StackOver Flow");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		if (top > -1) {
			//System.out.println("Initaited Removing Element: " + element[top] + " in head index :" + top);
			Object returnValue = element[top];
			element[top] = null;
			//System.out.println("Successfully Removed Element: " + element[top] + " in head index :" + top);
			top--;
			return (T) returnValue;
		} else {
			throw new StackOverflowError("Stack UnderFlow...");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		if (top > -1) {
			System.out
					.println("Element in Head is : " + element[top] + " and current head index is :" + top);
			return (T)element[top];
		} else {
			throw new StackOverflowError("Stack UnderFlow...");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int stackSize = 21;
		//Creating temporary DB
		Stack<Integer> stackService = new ArrayStack<Integer>(stackSize);
		
				
		for (int i = 0 ; i <20;i++){
			stackService.push(i+11);
			stackService.peek();
		}
		
		for (int i = 0 ; i <20;i++)
			stackService.pop();

	}

}
