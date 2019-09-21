package LinkedList;

public class ListIterator<T> {
	DoublyLinkBean<T> current;
	DoublyLinkBean<T> previous;
	DoublyLinkList<T> ourList;
	
	public void reset(){
		//current = ourList.getFirst();
		previous = null;
	}
	
	
}
