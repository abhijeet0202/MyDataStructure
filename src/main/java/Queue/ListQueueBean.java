/**
 * 
 */
package Queue;


/**
 * @author I17996
 *
 */
public class ListQueueBean<T> {
	
	protected T iData;
	public ListQueueBean<T> next;
	
	/**
	 * @param iData
	 */
	public ListQueueBean(T iData) {
		this.iData = iData;
		/*No Need to set next, it is an object by default it will set as "null" */
	}
	
	public ListQueueBean() {
		/*No Need to set next, it is an object by default it will set as "null" */
	}
	public String display(){
		System.out.print("{" + iData + "}--> ");
		return "";
	}


}
