package Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMinimumSpanningTree {
	Graph myCharacterGraph = null;
	MinimumSpanningTreeImpl mst = null;

	@Before
	public void setUp() throws Exception {
		myCharacterGraph = new Graph(9, false);
	}

	@After
	public void tearDown() throws Exception {
		myCharacterGraph = null;
	}

	@Test
	public void test1_MinimumSpanningTreeImpl() {
		System.out.print("Test1 MST");
		mst = new MinimumSpanningTreeImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet1(myCharacterGraph);
		mst.doMinimumSpanningTreeIterative(0);
		System.out.println();
	}

	@Test
	public void test2_MinimumSpanningTreeImpl() {
		System.out.print("Test2 MST");
		mst = new MinimumSpanningTreeImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet2(myCharacterGraph);
		mst.doMinimumSpanningTreeIterative(0);
		System.out.println();
	}

	@Test
	public void test3_MinimumSpanningTreeImpl() {
		System.out.print("Test3 MST ");
		mst = new MinimumSpanningTreeImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet3(myCharacterGraph);
		mst.doMinimumSpanningTreeIterative(0);
		System.out.println();
	}

	@Test
	public void test3_MinimumSpanningTreeRecursive() {
		System.out.print("Test3 MST Recursive ");
		mst = new MinimumSpanningTreeImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet3(myCharacterGraph);
		mst.doMinimumSpanningTreeRecursive(0);
		System.out.println();
	}

}
