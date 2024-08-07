package Graph;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTopologicalSorting {

	Graph myCharacterGraph;
	TopologicalSorting testTS;
	@Before
	public void setUp() throws Exception {
		myCharacterGraph = new Graph(8, true);
	}

	@Test
	public void testDoTopologicalSorting() {
		TestCommonUtility.getTestDataSetforTopologicalSorting(myCharacterGraph);
		testTS = new TopologicalSorting(myCharacterGraph);
		testTS.doTopologicalSorting();
		
	}

}
