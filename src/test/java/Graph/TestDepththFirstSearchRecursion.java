package Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDepththFirstSearchRecursion {

	Graph<Character> myCharacterGraph = null;
	DepthFirstSearchRecursion<Character> dfs = null;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
		myCharacterGraph = null;
	}
	@Test
	public void test() {
		myCharacterGraph = new Graph<Character>(9,false);
		
		dfs = new DepthFirstSearchRecursion<Character>(myCharacterGraph);
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
		
		myCharacterGraph.addEdges(0, 0);   //AA
		myCharacterGraph.addEdges(1, 1);   //BB
		myCharacterGraph.addEdges(2, 2);   //CC
		myCharacterGraph.addEdges(3, 3);   //DD
		myCharacterGraph.addEdges(4, 4);   //EE
		
		myCharacterGraph.addEdges(5, 5);   //FF
		myCharacterGraph.addEdges(6, 6);   //GG
		
		
		myCharacterGraph.addEdges(7, 7);   //HH
		myCharacterGraph.addEdges(8, 8);   //II
		
		dfs.doDFSRecursion();
	}

}
