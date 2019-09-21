/**
 * 
 */
package LinkedList;

/**
 * @author Aryan
 *
 */

/*
 * Linked list is also known as self-refrential because it member variable contains object "next" of itself.
 * Which will point or save address/reference of next link list or node.
 */
public class SinglyLinkBean<T> {
	protected T iData;
	public SinglyLinkBean<T> next;
	
	/**
	 * @param iData
	 */
	public SinglyLinkBean(T iData) {
		this.iData = iData;
		/*No Need to set next, it is an object by default it will set as "null" */
	}
	
	public SinglyLinkBean() {
		/*No Need to set next, it is an object by default it will set as "null" */
	}
	public String display(){
		System.out.print("{" + iData + "}--> ");
		return "";
	}

}
