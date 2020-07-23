package Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBreadthFirstSearch {

	Graph<Character> myCharacterGraph = null;
	BreadthFirstSearchImpl<Character> bfs = null;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
		myCharacterGraph = null;
	}
	@Test
	public void test() {
		myCharacterGraph = new Graph<Character>(5,false);
		
		bfs = new BreadthFirstSearchImpl<Character>(myCharacterGraph);
		myCharacterGraph.addVertex('A');
		myCharacterGraph.addVertex('B');
		myCharacterGraph.addVertex('C');
		myCharacterGraph.addVertex('D');
		myCharacterGraph.addVertex('E');
		
		
		myCharacterGraph.addEdges(0, 1);   //AB
		myCharacterGraph.addEdges(1, 2);   //BC
		myCharacterGraph.addEdges(0, 3);   //AD
		myCharacterGraph.addEdges(3, 4);   //DE
		
		bfs.doBFS();
		
		myCharacterGraph.flyodWarshall();
	}

}
