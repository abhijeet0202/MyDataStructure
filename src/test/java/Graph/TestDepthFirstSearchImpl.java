package Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDepthFirstSearchImpl {
	Graph<Character> myCharacterGraph = null;
	DepthFirstSearchImpl<Character> dfs = null;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
		myCharacterGraph = null;
	}
	@Test
	public void testDepthFirstSearchImpl() {
		myCharacterGraph = new Graph<Character>(9,false);
		
		dfs = new DepthFirstSearchImpl<Character>(myCharacterGraph);
		myCharacterGraph.addVertex('A');
		myCharacterGraph.addVertex('B');
		myCharacterGraph.addVertex('C');
		myCharacterGraph.addVertex('D');
		myCharacterGraph.addVertex('E');
		myCharacterGraph.addVertex('F');
		myCharacterGraph.addVertex('H');
		myCharacterGraph.addVertex('G');
		myCharacterGraph.addVertex('I');
		
		
		myCharacterGraph.addEdges(0, 1);   //AB
		myCharacterGraph.addEdges(0, 2);   //AC
		myCharacterGraph.addEdges(0, 3);   //AD
		myCharacterGraph.addEdges(0, 4);   //AE
		
		myCharacterGraph.addEdges(1, 5);   //BF
		myCharacterGraph.addEdges(5, 6);   //FH
		
		
		myCharacterGraph.addEdges(3, 7);   //DG
		myCharacterGraph.addEdges(7, 8);   //GI
		
		dfs.doDFS();
	}

}
