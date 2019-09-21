package Queue;

public class ArrayPriorityQueue<T> extends Queue<T> {

	ArrayQueueBean arrayQueueBean = null;
	ArrayPriorityQueue() {
	}

	ArrayPriorityQueue(int maxSize) {
		arrayQueueBean = new ArrayQueueBean(maxSize);
	}

	@Override
	void insert(T element) {
		if (arrayQueueBean.rear == -1){
			arrayQueueBean.element[++arrayQueueBean.rear] = element;
			arrayQueueBean.front++;
		}
		else if(arrayQueueBean.rear+1 == arrayQueueBean.MAX_SIZE){
			throw new StackOverflowError("Queue OverFlow...");
		}
		else{
			int i =arrayQueueBean.rear;
			for (; i>=0 ;i--){
				if (((Integer)arrayQueueBean.element[i]) > (Integer)element){
					arrayQueueBean.element[i+1] = arrayQueueBean.element[i];
				}else {
					break;
				}
			}
			arrayQueueBean.element[i+1] =element;
			arrayQueueBean.rear++;
			}
	}

	@SuppressWarnings("unchecked")
	@Override
	T remove() {
		if (arrayQueueBean.front == -1){
			throw new StackOverflowError("Queue UnderFlow...");
		}else{
			Object returnValue = arrayQueueBean.element[arrayQueueBean.front];
			arrayQueueBean.element[arrayQueueBean.front] =null;
			arrayQueueBean.front++;
			if (arrayQueueBean.front > arrayQueueBean.rear){
				arrayQueueBean.front =arrayQueueBean.rear =-1;
			}
			return (T)returnValue;
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	T peek() {
		if (arrayQueueBean.front == -1){
			throw new StackOverflowError("Queue UnderFlow...");
		}else{
			return (T) arrayQueueBean.element[arrayQueueBean.front];
		}
	}

	boolean isEmpty() {

		return arrayQueueBean.front == -1;

	}

	boolean isFull() {

		return arrayQueueBean.rear == arrayQueueBean.MAX_SIZE;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}