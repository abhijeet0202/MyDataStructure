package LinkedList;

public class DoublyLinkBean {
	
	public DoublyLinkBean next;
	public int iData;
	public DoublyLinkBean previous;
	
	public DoublyLinkBean(int iData) {
		this.iData = iData;
	}
	
	public String display(){
		System.out.print("{" + iData + "}--> ");
		return "";
	}

}
