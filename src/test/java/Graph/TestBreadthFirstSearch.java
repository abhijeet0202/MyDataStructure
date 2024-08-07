package Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBreadthFirstSearch {

	Graph myCharacterGraph = null;
	BreadthFirstSearchImpl bfs = null;

	@Before
	public void setUp() throws Exception {
		myCharacterGraph = new Graph(9, false);
	}

	@After
	public void tearDown() throws Exception {
		myCharacterGraph = null;
	}

	@Test
	public void test1_BreathFirstSearchImpl() {
		System.out.print("BFS Test1 ");
		bfs = new BreadthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet1(myCharacterGraph);
		bfs.doBFSIterative(0);
		System.out.println();
		// myCharacterGraph.flyodWarshall();
	}

	@Test
	public void test1_BreathFirstSearchRecursion() {
		System.out.print("BFS Test1 ");
		bfs = new BreadthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet1(myCharacterGraph);
		bfs.doBFSRecursion(0);
		System.out.println();
		// myCharacterGraph.flyodWarshall();
	}

	@Test
	public void test2_BreathFirstSearchImpl() {
		System.out.print("BFS Test2 ");
		bfs = new BreadthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet2(myCharacterGraph);
		bfs.doBFSIterative(0);
		System.out.println();
	}

	@Test
	public void test2_BreathFirstSearchRecursion() {
		System.out.print("BFS Test2 ");
		bfs = new BreadthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet2(myCharacterGraph);
		bfs.doBFSRecursion(0);
		System.out.println();
		// myCharacterGraph.flyodWarshall();
	}

	@Test
	public void test3_BreathFirstSearchImpl() {
		System.out.print("BFS Test3 ");
		bfs = new BreadthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet3(myCharacterGraph);
		bfs.doBFSIterative(0);
		System.out.println();
	}

	@Test
	public void test3_BreathFirstSearchRecursion() {
		System.out.print("BFS Test3 ");
		bfs = new BreadthFirstSearchImpl(myCharacterGraph);
		TestCommonUtility.getTestDataSet3(myCharacterGraph);
		bfs.doBFSRecursion(0);
		System.out.println();
		// myCharacterGraph.flyodWarshall();
	}

}
