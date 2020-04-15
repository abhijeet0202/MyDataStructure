package BinaryTree;

import org.junit.Test;

public class TestTwo34TreeNode {


	@Test
	public void testInsertRoot1() {
		Two34TreeImpl impl = new Two34TreeImpl();
		impl.insert(50);
	}
	
	@Test
	public void testInsertRoot2() {
		Two34TreeImpl impl = new Two34TreeImpl();
		impl.insert(50);
		impl.insert(20);
	}
	
	@Test
	public void testInsertRoot3() {
		Two34TreeImpl impl = new Two34TreeImpl();
		impl.insert(50);
		impl.insert(150);
	}
	
	@Test
	public void testInsertRoot4() {
		Two34TreeImpl impl = new Two34TreeImpl();
		impl.insert(50);
		impl.insert(120);
		impl.insert(110);
		impl.insert(32);
	}

}
