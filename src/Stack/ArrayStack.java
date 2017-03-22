/**
 * 
 */
package Stack;

/**
 * @author Aryan
 *
 */
public class ArrayStack<T> extends Stack<T> {

	public ArrayStackBean arrayStackBean = null;
	public ArrayStack() {
		arrayStackBean = new ArrayStackBean(20);
	}
	
	public ArrayStack(int maxSize){
		arrayStackBean = new ArrayStackBean(maxSize);
		
	}
	
	@Override
	public void push(T element) {
		if (arrayStackBean.top < arrayStackBean.MAX_SIZE) {
			arrayStackBean.element[++arrayStackBean.top] = element;
			//System.out.println("Successfully Inserted Element: " + element + " in head index :" + top);
		} else {
			throw new StackOverflowError("StackOver Flow");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		if (arrayStackBean.top > -1) {
			//System.out.println("Initaited Removing Element: " + element[top] + " in head index :" + top);
			Object returnValue = arrayStackBean.element[arrayStackBean.top];
			arrayStackBean.element[arrayStackBean.top] = null;
			//System.out.println("Successfully Removed Element: " + element[top] + " in head index :" + top);
			arrayStackBean.top--;
			return (T) returnValue;
		} else {
			throw new StackOverflowError("Stack UnderFlow...");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T top() {
		if (arrayStackBean.top > -1) {
			System.out
					.println("Element in Head is : " + arrayStackBean.element[arrayStackBean.top] + " and current head index is :" + arrayStackBean.top);
			return (T)arrayStackBean.element[arrayStackBean.top];
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
			stackService.top();
		}
		
		for (int i = 0 ; i <20;i++)
			stackService.pop();

	}

	@Override
	boolean isEmpty() {
		return (arrayStackBean.top == 0);
	}

	@Override
	boolean isFull() {
		return (arrayStackBean.top == arrayStackBean.MAX_SIZE);
	}

}
