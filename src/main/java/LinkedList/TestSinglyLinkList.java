/**
 * 
 */
package LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author I17996
 *
 */
public class TestSinglyLinkList {

	/**
	 * Test method for {@link LinkedList.SinglyLinkList#insertFirst()}.
	 */
	@Test
	public void testInsertFirst() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertFirst(23);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(23));
		assertEquals((linkList.first.iData), Integer.valueOf(23));
		assertEquals((linkList.first.next), null);
	}

	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteFirst()}.
	 */
	@Test
	public void testinsertFirstFirst() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertFirst(23);
		linkList.insertFirst(24);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(24));
		assertEquals((linkList.first.iData), Integer.valueOf(24));
		// assertEquals((linkList.first.next), notNullValue());

		assertEquals((linkList.first.next.iData), Integer.valueOf(23));
		assertEquals((linkList.first.next.next), null);
	}

	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testinsertLast() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertLast(23);
		// linkList.insertLast(24);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(23));
		assertEquals((linkList.first.iData), Integer.valueOf(23));
		assertEquals((linkList.first.next), null);

		// assertEquals((linkList.first.next.iData), Integer.valueOf(23));
		// assertEquals((linkList.first.next.next), null);
	}

	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testinsertLastLast() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertLast(23);
		linkList.insertLast(24);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(23));
		assertEquals((linkList.first.iData), Integer.valueOf(23));
		assertNotEquals((linkList.first.next), null);

		assertEquals((linkList.first.next.iData), Integer.valueOf(24));
		assertEquals((linkList.first.next.next), null);
	}

	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testinsertLastLastLast() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertLast(23);
		linkList.insertLast(24);
		linkList.insertLast(25);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(23));
		assertEquals((linkList.first.iData), Integer.valueOf(23));
		assertNotEquals((linkList.first.next), null);

		assertEquals((linkList.first.next.iData), Integer.valueOf(24));
		assertNotEquals((linkList.first.next.next), null);

		assertEquals((linkList.first.next.next.iData), Integer.valueOf(25));
		assertEquals((linkList.first.next.next.next), null);
	}

	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testinsertNodeBlank() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertNode(23, 23);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(23));
		assertEquals((linkList.first.iData), Integer.valueOf(23));
		assertEquals((linkList.first.next), null);
	}

	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testinsertNodeLast() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertNode(23, 23);
		linkList.insertNode(24, 24);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(23));
		assertEquals((linkList.first.iData), Integer.valueOf(23));
		assertNotEquals((linkList.first.next), null);

		assertEquals((linkList.first.next.iData), Integer.valueOf(24));
		assertEquals((linkList.first.next.next), null);

		linkList.displayList();
	}

	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testinsertNodeAfterItem() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertNode(23, 23);
		linkList.insertNode(24, 24);
		linkList.insertNode(25, 23);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(23));
		assertEquals((linkList.first.iData), Integer.valueOf(23));
		assertNotEquals((linkList.first.next), null);

		assertEquals((linkList.first.next.iData), Integer.valueOf(25));
		assertNotEquals((linkList.first.next.next), null);

		assertEquals((linkList.first.next.next.iData), Integer.valueOf(24));
		assertEquals((linkList.first.next.next.next), null);

		linkList.displayList();
	}
	
	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testdeleteFirstNodeblank() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.deleteFirst();

		assertEquals(linkList.isEmpty(), true);
	}
	
	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testdeleteFirstNode() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertNode(24, 24);
		linkList.insertNode(25, 23);
		linkList.deleteFirst();

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(25));
		assertEquals((linkList.first.iData), Integer.valueOf(25));
		assertEquals((linkList.first.next), null);

		linkList.displayList();
	}
	
	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testdeleteGivenNodeBlank() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.deleteNode(23);

		assertEquals(linkList.isEmpty(), true);
	}
	
	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testdeleteGivenNodeLast() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertNode(24, 24);
		linkList.insertNode(25, 23);
		linkList.deleteNode(25);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(24));
		assertEquals((linkList.first.iData), Integer.valueOf(24));
		assertEquals((linkList.first.next), null);

		linkList.displayList();
	}
	
	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testdeleteGivenNodeFirst() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		linkList.insertNode(24, 24);
		linkList.insertNode(25, 23);
		linkList.deleteNode(24);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(25));
		assertEquals((linkList.first.iData), Integer.valueOf(25));
		assertEquals((linkList.first.next), null);

		linkList.displayList();
	}
	
	/**
	 * Test method for {@link LinkedList.SinglyLinkList#deleteNode(int)}.
	 */
	@Test
	public void testdeleteGivenNodeInMiddle() {
		SinglyLinkList<Integer> linkList = new SinglyLinkList<Integer>();
		
		linkList.insertFirst(23);
		linkList.insertNode(24, 23);
		linkList.insertLast(25);
		linkList.insertFirst(21);
		linkList.displayList();
		linkList.deleteNode(24);

		assertEquals(linkList.isEmpty(), false);
		assertNotNull(linkList.find(25));
		assertEquals((linkList.first.next.next.iData), Integer.valueOf(25));
		assertEquals((linkList.first.next.next.next), null);
		System.out.println("====");
		linkList.displayList();
	}

}
