package Queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPriorityQueue {

	@Test
	public void testInsertFirstIndex() {
		int maxSize = 3;
		Queue<Integer> myPriorityQueue = new ArrayPriorityQueue<Integer>(maxSize);

		myPriorityQueue.insert(23);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 0);
		assertEquals(myPriorityQueue.element[0], 23);
		System.out.println(myPriorityQueue);

	}

	@Test
	public void testInsertSecondIndexWithHighElement() {
		int maxSize = 3;
		Queue<Integer> myPriorityQueue = new ArrayPriorityQueue<Integer>(maxSize);

		myPriorityQueue.insert(23);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 0);
		assertEquals(myPriorityQueue.element[0], 23);

		myPriorityQueue.insert(24);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 1);
		assertEquals(myPriorityQueue.element[0], 23);
		assertEquals(myPriorityQueue.element[1], 24);

	}

	@Test
	public void testInsertSecondIndexWithLowElement() {
		int maxSize = 3;
		Queue<Integer> myPriorityQueue = new ArrayPriorityQueue<Integer>(maxSize);

		myPriorityQueue.insert(23);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 0);
		assertEquals(myPriorityQueue.element[0], 23);

		myPriorityQueue.insert(22);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 1);
		assertEquals(myPriorityQueue.element[0], 22);
		assertEquals(myPriorityQueue.element[1], 23);

	}

	@Test
	public void testInsertSecondIndexWithLowElementAgain() {
		int maxSize = 3;
		Queue<Integer> myPriorityQueue = new ArrayPriorityQueue<Integer>(maxSize);

		myPriorityQueue.insert(23);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 0);
		assertEquals(myPriorityQueue.element[0], 23);

		myPriorityQueue.insert(20);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 1);
		assertEquals(myPriorityQueue.element[0], 20);
		assertEquals(myPriorityQueue.element[1], 23);

		myPriorityQueue.insert(21);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 2);
		assertEquals(myPriorityQueue.element[0], 20);
		assertEquals(myPriorityQueue.element[1], 21);
		assertEquals(myPriorityQueue.element[2], 23);

	}

	@Test
	public void testInsertSecondIndexWithLowElementinTop() {
		int maxSize = 4;
		Queue<Integer> myPriorityQueue = new ArrayPriorityQueue<Integer>(maxSize);

		myPriorityQueue.insert(23);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 0);
		assertEquals(myPriorityQueue.element[0], 23);

		myPriorityQueue.insert(20);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 1);
		assertEquals(myPriorityQueue.element[0], 20);
		assertEquals(myPriorityQueue.element[1], 23);

		myPriorityQueue.insert(21);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 2);
		assertEquals(myPriorityQueue.element[0], 20);
		assertEquals(myPriorityQueue.element[1], 21);
		assertEquals(myPriorityQueue.element[2], 23);

		myPriorityQueue.insert(19);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 3);
		assertEquals(myPriorityQueue.element[0], 19);
		assertEquals(myPriorityQueue.element[1], 20);
		assertEquals(myPriorityQueue.element[2], 21);
		assertEquals(myPriorityQueue.element[3], 23);

	}

	@Test(expected = StackOverflowError.class)
	public void testExceptionWhileInsertion() {
		int maxSize = 1;
		Queue<Integer> myPriorityQueue = new ArrayPriorityQueue<Integer>(maxSize);

		myPriorityQueue.insert(23);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 0);
		assertEquals(myPriorityQueue.element[0], 23);

		myPriorityQueue.insert(20);
	}

	@Test(expected = StackOverflowError.class)
	public void testRemoveException() {
		int maxSize = 1;
		Queue<Integer> myPriorityQueue = new ArrayPriorityQueue<Integer>(maxSize);

		myPriorityQueue.remove();
	}
	
	@Test()
	public void testRemoveFront() {
		int maxSize = 4;
		Queue<Integer> myPriorityQueue = new ArrayPriorityQueue<Integer>(maxSize);

		myPriorityQueue.insert(23);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 0);
		assertEquals(myPriorityQueue.element[0], 23);

		myPriorityQueue.insert(20);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 1);
		assertEquals(myPriorityQueue.element[0], 20);
		assertEquals(myPriorityQueue.element[1], 23);

		myPriorityQueue.insert(21);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 2);
		assertEquals(myPriorityQueue.element[0], 20);
		assertEquals(myPriorityQueue.element[1], 21);
		assertEquals(myPriorityQueue.element[2], 23);

		myPriorityQueue.insert(19);
		assertEquals(myPriorityQueue.front, 0);
		assertEquals(myPriorityQueue.rear, 3);
		assertEquals(myPriorityQueue.element[0], 19);
		assertEquals(myPriorityQueue.element[1], 20);
		assertEquals(myPriorityQueue.element[2], 21);
		assertEquals(myPriorityQueue.element[3], 23);

		myPriorityQueue.remove();
		assertEquals(myPriorityQueue.front, 1);
		assertEquals(myPriorityQueue.rear, 3);
		assertEquals(myPriorityQueue.element[0], null);
		assertEquals(myPriorityQueue.element[1], 20);
		assertEquals(myPriorityQueue.element[2], 21);
		assertEquals(myPriorityQueue.element[3], 23);
		
		myPriorityQueue.remove();
		assertEquals(myPriorityQueue.front, 2);
		assertEquals(myPriorityQueue.rear, 3);
		assertEquals(myPriorityQueue.element[0], null);
		assertEquals(myPriorityQueue.element[1], null);
		assertEquals(myPriorityQueue.element[2], 21);
		assertEquals(myPriorityQueue.element[3], 23);
		
		myPriorityQueue.remove();
		assertEquals(myPriorityQueue.front, 3);
		assertEquals(myPriorityQueue.rear, 3);
		assertEquals(myPriorityQueue.element[0], null);
		assertEquals(myPriorityQueue.element[1], null);
		assertEquals(myPriorityQueue.element[2], null);
		assertEquals(myPriorityQueue.element[3], 23);
		
		myPriorityQueue.remove();
		assertEquals(myPriorityQueue.front, -1);
		assertEquals(myPriorityQueue.rear, -1);
		assertEquals(myPriorityQueue.element[0], null);
		assertEquals(myPriorityQueue.element[1], null);
		assertEquals(myPriorityQueue.element[2], null);
		assertEquals(myPriorityQueue.element[3], null);
	}
}
