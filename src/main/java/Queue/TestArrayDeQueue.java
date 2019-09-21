package Queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestArrayDeQueue {

	/*
	 * Scenario1 : When 1st Time both rear and front is in -1.then
	 * 1. AddRight which makes both point to 0th Index, Now
	 * 2. If You try to addLeft which means "current Index -1" i.e. -1
	 * It will throw error 
	 */
	@Test(expected= StackOverflowError.class)
	public void testInsertRightLeftFresh() {
		int maxSize =20;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insertRear(20);
		arrayDeQueue.insertFront(20);
	}
	/*
	 * Scenario2 : When 1st Time both rear and front is in -1.then
	 * 1. AddLeft which makes both point to 0th Index, Now
	 * 2. Add addRight which means "current Index +1" i.e. 1
	 * It will insert 
	 */
	@Test
	public void testInsertLeftRightFresh() {
		int maxSize =20;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insertFront(21);
		arrayDeQueue.insertRear(20);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 20);
	}
	
	/*
	 * Scenario3A : When 1st Time both rear and front is in -1.then
	 * 1. AddLeft which makes both point to 0th Index, Now
	 * 2. removeLeft which again makes both rear and front index = -1
	 * 2. Add addRight which means "rear == -1 the increment front = rear =0 " and add
	 * It will insert successfully
	 */
	@Test
	public void testInsertLeftRemoveLeftInsertRight() {
		int maxSize =20;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insert(21);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		
		
		arrayDeQueue.remove();
		assertEquals(arrayDeQueue.arrayQueueBean.front, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		
		arrayDeQueue.insertRear(20);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 20);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 20);
	}


	/*
	 * Scenario3B : When 1st Time both rear and front is in -1.then
	 * 1. AddRight which makes both point to 0th Index, Now
	 * 2. removeLeft which again makes both rear and front index = -1
	 * 2. Add addLeft which means "rear == -1 the increment front = rear =0 " and add
	 * It will insert successfully
	 */
	@Test
	public void testInsertRightRemoveLeftInsertLeft() {
		int maxSize =20;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insertRear(21);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		
		
		arrayDeQueue.remove();
		assertEquals(arrayDeQueue.arrayQueueBean.front, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		
		arrayDeQueue.insertFront(20);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 20);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 20);
	}

	/*
	 * Scenario4A : When 1st Time both rear and front is in -1.then
	 * 1. AddLeft which makes both point to 0th Index, Now
	 * 2. removeRight which again makes both rear and front index = -1
	 * 2. Add addRight which means "rear == -1 the increment front = rear =0 " and add
	 * It will insert successfully
	 */
	@Test
	public void testInsertLeftRemoveRightInsertRight() {
		int maxSize =20;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insert(21);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		
		
		arrayDeQueue.removeRear();
		assertEquals(arrayDeQueue.arrayQueueBean.front, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		
		arrayDeQueue.insertRear(20);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 20);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 20);
	}

	/*
	 * Scenario4B : When 1st Time both rear and front is in -1.then
	 * 1. AddRight which makes both point to 0th Index, Now
	 * 2. removeRight which again makes both rear and front index = -1
	 * 2. Add addLeft which means "rear == -1 the increment front = rear =0 " and add
	 * It will insert successfully
	 */
	@Test
	public void testInsertRightRemoveRightInsertLeft() {
		int maxSize =20;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insertRear(21);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		
		
		arrayDeQueue.removeRear();
		assertEquals(arrayDeQueue.arrayQueueBean.front, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		
		arrayDeQueue.insert(20);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 20);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 20);
	}

	/*
	 * Scenario 5 : Remove from Left when array does not contains any Value
	 */
	@Test(expected = StackOverflowError.class)
	public void testRemoveLeft() {
		int maxSize =20;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		
		arrayDeQueue.removeFront();
	}

	/*
	 * Scenario 6 : Remove from Right when array does not contains any Value
	 */
	@Test(expected = StackOverflowError.class)
	public void testremoveRight() {
		int maxSize =20;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		
		arrayDeQueue.removeRear();
	}

	/*
	 * Scenario 7 : Testing the scenario when we inserted few elements via Rear
	 * then trying to remove it through front, so that front index will increase.
	 */
	@Test
	public void testInsertRearX3RemoveFront() {
		int maxSize =20;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insertRear(21);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		
		
		arrayDeQueue.insertRear(23);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		
		arrayDeQueue.insertRear(20);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 20);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 20);
	}

	/*
	 * Scenario 8 : Testing the scenario when we inserted few elements via Rear
	 * then trying to remove it through front, so that front index will increase.
	 * and also removing item from rear so rear index will decrease
	 */
	@Test
	public void testInsertRearX3RemoveFrontRemoveRear() {
		int maxSize =20;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insertRear(21);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		
		
		arrayDeQueue.insertRear(23);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		
		arrayDeQueue.insertRear(20);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 20);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 20);
		
		arrayDeQueue.removeRear();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], null);
	}

	/*
	 * Scenario 9:  Add more element than max size from Rear end
	 */
	@Test(expected = StackOverflowError.class)
	public void testRearOverFlow() {
		int maxSize =2;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insertRear(21);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		
		
		arrayDeQueue.insertRear(23);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		
		arrayDeQueue.insertRear(20);
	}

	/*
	 * Scenario10: Testing front inserting behaviour while adding in somewhere middle index
	 */
	@Test
	public void testinsertFrontDifferentIndexThanOne() {
		int maxSize =6;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insertRear(21);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		
		
		arrayDeQueue.insertRear(23);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		
		arrayDeQueue.insertRear(24);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		
		arrayDeQueue.insertRear(25);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 3);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		
		arrayDeQueue.insertRear(26);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 3);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.insertFront(100);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 3);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 100);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.insertFront(101);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 101);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 100);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
	}

	@Test
	public void testDeleteRearWhenBothRearAndFrontInMiddle() {
		int maxSize =6;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insertRear(21);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		
		
		arrayDeQueue.insertRear(23);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		
		arrayDeQueue.insertRear(24);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		
		arrayDeQueue.insertRear(25);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 3);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		
		arrayDeQueue.insertRear(26);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 3);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeRear();
		assertEquals(arrayDeQueue.arrayQueueBean.front, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], null);
		
	}

	@Test
	public void testDeleteFrontWhenBothRearAndFrontInMiddle() {
		int maxSize =6;
		ArrayDeQueue<Integer> arrayDeQueue = new ArrayDeQueue<Integer>(maxSize);
		arrayDeQueue.insertRear(21);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		
		
		arrayDeQueue.insertRear(23);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		
		arrayDeQueue.insertRear(24);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		
		arrayDeQueue.insertRear(25);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 3);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		
		arrayDeQueue.insertRear(26);
		assertEquals(arrayDeQueue.arrayQueueBean.front, 0);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], 21);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], 23);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 2);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], 24);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 3);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], 25);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, 4);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], 26);
		
		arrayDeQueue.removeFront();
		assertEquals(arrayDeQueue.arrayQueueBean.front, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.rear, -1);
		assertEquals(arrayDeQueue.arrayQueueBean.element[0], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[1], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[2], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[3], null);
		assertEquals(arrayDeQueue.arrayQueueBean.element[4], null);
		
	}

}
