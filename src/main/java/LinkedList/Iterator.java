/**
 * 
 */
package LinkedList;

/**
 * @author I17996
 *
 */
public class Iterator<T> {

	private SinglyLinkBean<T> current;
	private SinglyLinkList<T> myList;

	public Iterator(SinglyLinkList<T> list) {
		myList = list;
		reset();
	}

	public void reset() {
		current = myList.getFirst();
	}

	public boolean atEnd() {
		return (current.next == null);
	}

	public void nextLink() {
		current = current.next;
	}

	public SinglyLinkBean<T> getCurrent() {
		return current;
	}

	public void insertAfter(T element) {
		SinglyLinkBean<T> node = new SinglyLinkBean<T>(element);

		if (myList.isEmpty()) {
			myList.setFirst(node);
			current = node;
		} else {
			node.next = current.next;
			current.next = node;
			nextLink();
		}
	}
	
	public T deleteCurrent(){
		return null;
	}
}
