package Heap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHeapArray {
	ArrayHeap<Integer>  myArrayHeap = null;
	@Before
	public void setUp() throws Exception {
		myArrayHeap = new ArrayHeap<Integer>();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testDelete() {
		myArrayHeap.insert(5);
		myArrayHeap.insert(70);
		myArrayHeap.insert(45);
		myArrayHeap.insert(50);
		myArrayHeap.insert(80);
		myArrayHeap.remove();
		myArrayHeap.remove();
		myArrayHeap.remove();
		myArrayHeap.remove();
		myArrayHeap.remove();
	}

	@Test
	public void testInsert() {
		myArrayHeap.insert(5);
		myArrayHeap.insert(70);
		myArrayHeap.insert(45);
		myArrayHeap.insert(50);
		myArrayHeap.insert(80);
		myArrayHeap.insert(55);
		myArrayHeap.insert(58);
		myArrayHeap.insert(40);
		myArrayHeap.insert(60);
		myArrayHeap.insert(10);
		myArrayHeap.insert(20);
		myArrayHeap.insert(30);
		myArrayHeap.insert(90);
		myArrayHeap.insert(100);
		System.out.println(myArrayHeap);
		myArrayHeap.remove();
		System.out.println(myArrayHeap);
	}

}
