/**
 * 
 */
package LinkedList;


import org.junit.Test;

/**
 * @author I17996
 *
 */
public class TestIterator {

	/**
	 * Test method for {@link LinkedList.Iterator#Iterator(LinkedList.SinglyLinkList)}.
	 */
	@Test
	public void testIterator() {
		SinglyLinkList<String> singlylinkList= new SinglyLinkList<String>();
		Iterator<String> myItr = singlylinkList.getIterator();
		myItr.insertAfter("Abhijeet");
		myItr.insertAfter("Banerjee");
		myItr.insertAfter("Aryan");
		singlylinkList.displayList();
		
	}

}
