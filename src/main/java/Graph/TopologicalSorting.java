package Graph;

//  - Topological Sorting is used to model any job scheduling when one job/events/items needs to be arranged in specific order. 
//     Algebra->Adv. Algebra-> Seminar-> Degree 
//- Its always a directed graph. 
// - Modeling job schedules with graph is known as CRITICAL PATH ANALYSIS

//STEP1: Find a vertex that has no successor (end/leaf node)
//STEP2: Delete this vertex from the graph, and insert its label/item at the beginning of a list

//NOTE:: ONE KIND OF GRAPH THE TOPOLOGICAL-SORT ALGORITHM CANNOT HANDLE IS A GRAPH WITH CYCLE
//NOTE: A GARPGH WITH NO CYCLE IS ALLED A TREE.
//DIRECTED ACYCLIC GRAPH(DAG): DIRECTED GRAPH WITH NO CYCLE
public class TopologicalSorting {

	Graph ts;
	int numVertex;
	char resultSortedArray[];

	public TopologicalSorting(Graph root) {
		ts = root;
		numVertex = root.currentVertexSize;
		resultSortedArray = new char[numVertex];
	}

	public void doTopologicalSorting() {
		while (numVertex > 0) {
			// get a vertex with no Successor
			int currentVertex = noSuccesor();
			if (currentVertex == -1) { // must be cyclic
				throw new RuntimeException("ERROR: CYCLIC GRAPH DETECTED" + currentVertex);
			}

			resultSortedArray[numVertex - 1] = ts.vertexList[currentVertex].item;
			deleteVertex(currentVertex);
		}

		// Display Topological Sorted Array
		for (int i = 0; i < resultSortedArray.length; i++) {
			System.out.print(resultSortedArray[i] + "->");
		}
	}

	private int noSuccesor() {
		boolean isNotSuccesor;
		for (int row = 0; row < numVertex; row++) {
			isNotSuccesor = false;
			for (int column = 0; column < numVertex; column++) {
				if (ts.adjacentMatrix[row][column] > 0) {
					isNotSuccesor = true; // Has a Successor
					break;
				}
			}
			if (!isNotSuccesor) {
				return row; // Has no Successor
			}
		}
		return -1;
	}

	private void deleteVertex(int deleteVertex) {
		//
		for (int i = deleteVertex; i < numVertex - 1; i++) {
			ts.vertexList[i] = ts.vertexList[i + 1]; // Keep Shifting one vertex i.e. delete vertex
		}

		for (int row = deleteVertex; row < numVertex - 1; row++) {// Delete One Row from Adjacent MAtrix
			for (int column = 0; column < numVertex; column++) { // Column need to same as numVertex length. as we just deleting row.Row =n-1, wheras col =n
				ts.adjacentMatrix[row][column] = ts.adjacentMatrix[row + 1][column];
			}
		}

		for (int column = deleteVertex; column < numVertex - 1; column++) {// Delete One Column from Adjacent MAtrix
			for (int row = 0; row < numVertex - 1; row++) { // why  again -1? we already deleted row on above for loop. So now ah
				ts.adjacentMatrix[row][column] = ts.adjacentMatrix[row][column + 1];
			}
		}

		// Decrement number Of Vertex count
		numVertex--;
	}

}
