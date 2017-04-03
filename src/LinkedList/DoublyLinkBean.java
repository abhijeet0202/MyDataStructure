package LinkedList;

public class DoublyLinkBean<T> {
	
	public DoublyLinkBean<T> next;
	public T iData;
	public DoublyLinkBean<T> previous;
	
	public DoublyLinkBean(T iData) {
		this.iData = iData;
	}
	
	public String display(){
		System.out.print("{" + iData + "}--> ");
		return "";
	}

}
