package Queue;

public class ArrayPriorityQueue<T> extends Queue<T> {

	ArrayPriorityQueue() {
	}

	ArrayPriorityQueue(int maxSize) {
		super(maxSize);
	}

	@Override
	void insert(T element) {
		if (rear == -1){
			this.element[++rear] = element;
			front++;
		}
		else if(rear+1 == MAX_SIZE){
			throw new StackOverflowError("Queue OverFlow...");
		}
		else{
			int i =rear;
			for (; i>=0 ;i--){
				if (((Integer)this.element[i]) > (Integer)element){
					this.element[i+1] = this.element[i];
				}else {
					break;
				}
			}
			this.element[i+1] =element;
					rear++;
			}
	}

	@SuppressWarnings("unchecked")
	@Override
	T remove() {
		if (front == -1){
			throw new StackOverflowError("Queue UnderFlow...");
		}else{
			Object returnValue = this.element[front];
			this.element[front] =null;
			front++;
			if (front > rear){
				front =rear =-1;
			}
			return (T)returnValue;
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	T peek() {
		if (front == -1){
			throw new StackOverflowError("Queue UnderFlow...");
		}else{
			return (T) this.element[front];
		}
	}

	boolean isEmpty() {

		return front == -1;

	}

	boolean isFull() {

		return rear == MAX_SIZE;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}