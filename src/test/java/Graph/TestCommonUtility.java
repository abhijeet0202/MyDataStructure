package Graph;

public class TestCommonUtility {
	static Graph getTestDataSet1(Graph myCharacterGraph) {
		myCharacterGraph.addVertex('A');
		myCharacterGraph.addVertex('B');
		myCharacterGraph.addVertex('C');
		myCharacterGraph.addVertex('D');
		myCharacterGraph.addVertex('E');
		myCharacterGraph.addVertex('F');
		myCharacterGraph.addVertex('G');
		myCharacterGraph.addVertex('H');
		myCharacterGraph.addVertex('I');

		myCharacterGraph.addEdges(0, 1); // AB
		myCharacterGraph.addEdges(0, 2); // AC
		myCharacterGraph.addEdges(0, 3); // AD
		myCharacterGraph.addEdges(0, 4); // AE

		myCharacterGraph.addEdges(1, 5); // BF
		myCharacterGraph.addEdges(5, 6); // FH

		myCharacterGraph.addEdges(3, 7); // DG
		myCharacterGraph.addEdges(7, 8); // GI
		return myCharacterGraph;
	}

	static Graph getTestDataSet2(Graph myCharacterGraph) {
		myCharacterGraph.addVertex('A');
		myCharacterGraph.addVertex('B');
		myCharacterGraph.addVertex('C');
		myCharacterGraph.addVertex('D');
		myCharacterGraph.addVertex('E');
		myCharacterGraph.addEdges(0, 1);
		myCharacterGraph.addEdges(1, 2);
		myCharacterGraph.addEdges(0, 3);
		myCharacterGraph.addEdges(3, 4);
		return myCharacterGraph;
	}

	static void getTestDataSet3(Graph myCharacterGraph) {
		myCharacterGraph.addVertex('A'); // 0 (start for mst)
		myCharacterGraph.addVertex('B'); // 1
		myCharacterGraph.addVertex('C'); // 2
		myCharacterGraph.addVertex('D'); // 3
		myCharacterGraph.addVertex('E'); // 4

		myCharacterGraph.addEdges(0, 1); // AB
		myCharacterGraph.addEdges(0, 2); // AC
		myCharacterGraph.addEdges(0, 3); // AD
		myCharacterGraph.addEdges(0, 4); // AE
		myCharacterGraph.addEdges(1, 2); // BC
		myCharacterGraph.addEdges(1, 3); // BD
		myCharacterGraph.addEdges(1, 4); // BE
		myCharacterGraph.addEdges(2, 3); // CD
		myCharacterGraph.addEdges(2, 4); // CE
		myCharacterGraph.addEdges(3, 4); // DE

	}

	static void getTestDataSetforTopologicalSorting(Graph myCharacterGraph) {
		myCharacterGraph.addVertex('A'); // 0
		myCharacterGraph.addVertex('B'); // 1
		myCharacterGraph.addVertex('C'); // 2
		myCharacterGraph.addVertex('D'); // 3
		myCharacterGraph.addVertex('E'); // 4
		myCharacterGraph.addVertex('F'); // 5
		myCharacterGraph.addVertex('G'); // 6
		myCharacterGraph.addVertex('H'); // 7

		myCharacterGraph.addEdges(0, 3); // AD
		myCharacterGraph.addEdges(0, 4); // AE
		myCharacterGraph.addEdges(1, 4); // BE
		myCharacterGraph.addEdges(2, 5); // CF
		myCharacterGraph.addEdges(3, 6); // DG
		myCharacterGraph.addEdges(4, 6); // EG
		myCharacterGraph.addEdges(5, 7); // FH
		myCharacterGraph.addEdges(6, 7); // GH
	}

}
