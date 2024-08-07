package Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDepthFirstSearchImpl {
	Graph myCharacterGraph = null;
	DepthFirstSearchImpl dfs = null;

	@Before
	public void setUp() throws Exception {
		myCharacterGraph = new Graph(9, false);
	}

	@After
	public void tearDown() throws Exception {
		myCharacterGraph = null;
	}

	@Test
	public void test1_DepthFirstSearchImpl() {
		System.out.print("Test1 ");
		dfs = new DepthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet1(myCharacterGraph);
		dfs.doDFSIterative(0);
		System.out.println();
	}

	@Test
	public void test1_DepthFirstSearchRecursion() {
		System.out.print("Test1 Visited Recursively");
		dfs = new DepthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet1(myCharacterGraph);
		dfs.doDFSRecursion(0);
		System.out.println();
	}

	@Test
	public void test2_DepthFirstSearchImpl() {
		System.out.print("Test2 ");
		dfs = new DepthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet2(myCharacterGraph);
		dfs.doDFSIterative(0);
		System.out.println();
	}

	@Test
	public void test2_DepthFirstSearchRecursion() {
		System.out.print("Test2 Visited Recursively");
		dfs = new DepthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet2(myCharacterGraph);
		dfs.doDFSRecursion(0);
		System.out.println();
	}

	@Test
	public void test3_DepthFirstSearchImpl() {
		System.out.print("Test3 ");
		dfs = new DepthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet3(myCharacterGraph);
		dfs.doDFSIterative(0);
		System.out.println();
	}

	@Test
	public void test3_DepthFirstSearchRecursion() {
		System.out.print("Test3 Visited Recursively");
		dfs = new DepthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet3(myCharacterGraph);
		dfs.doDFSRecursion(0);
		System.out.println();
	}

}
