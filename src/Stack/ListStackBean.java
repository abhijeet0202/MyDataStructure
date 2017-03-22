/**
 * 
 */
package Stack;


/**
 * @author I17996
 *
 */
public class ListStackBean<T> {
	
	protected T iData;
	public ListStackBean<T> next;
	
	/**
	 * @param iData
	 */
	public ListStackBean(T iData) {
		this.iData = iData;
		/*No Need to set next, it is an object by default it will set as "null" */
	}
	
	public ListStackBean() {
		/*No Need to set next, it is an object by default it will set as "null" */
	}
	public String display(){
		System.out.print("{" + iData + "}--> ");
		return "";
	}


}
