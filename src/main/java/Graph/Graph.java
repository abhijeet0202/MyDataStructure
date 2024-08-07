package Graph;

public class Graph {

	final Vertex vertexList[];
	final int adjacentMatrix[][];
	int currentVertexSize;
	private final boolean isGraphDirected;

	public Graph(int size, boolean isGraphDirected) {
		this.vertexList = new Vertex[size];
		this.adjacentMatrix = new int[size][size];
		this.isGraphDirected = isGraphDirected;
		this.currentVertexSize = 0;
	}

	public int getVertexIndex(char ch) {
		for (int index = 0; index < currentVertexSize; index++) {
			if (vertexList[index].item == ch) {
				return index;
			}
		}
		return -1;
	}

	public void addVertex(char item) {
		Vertex myVertex = new Vertex(item);
		vertexList[currentVertexSize++] = myVertex;

	}

	public void addEdges(int rowNum, int colNum) { // unweighted Graph
		addEdges(rowNum, colNum, 1);
	}

	public void addEdges(int rowNum, int colNum, int weight) { // weighted Graph
		adjacentMatrix[rowNum][colNum] = weight;
		if (!isGraphDirected)
			adjacentMatrix[colNum][rowNum] = weight;
	}

	public int getAdjUnvisitedVertex(int column) {
		for (int row = 0; row < currentVertexSize; row++) {
			if (adjacentMatrix[row][column] == 1 && vertexList[row].wasVisited == false) {
				return row; // return first such vertex
			}
		}
		return -1; // no such vertices
	} //

	// TODO : Need to test and code again
//	public void topologicalSorting() {
//		ArrayList<T> sortedArray = new ArrayList<T>(vertexList.size());
//		while(!vertexList.isEmpty()) {
//			int currentVertex = noSuccesor();
//			if(currentVertex == -1) {// must be a cycle
//				System.out.println("ERROR: Graph has cycles");
//				return;
//			}
//			// insert vertex label in sorted array (start at end)
//			sortedArray.set(vertexList.size()-1,vertexList.get(currentVertex).item);
//			deleteVertex(currentVertex); // delete vertex
//			} // end while
//	}

//	private int noSuccesor() {
//		boolean isEdge; // edge from row to column in adjacentMatrix
//		
//		for (int row = 0; row < vertexList.size(); row++) // for each vertex,
//		{
//			isEdge = false; // check edges
//			for (int col = 0; col < vertexList.size(); col++) {
//				if (adjacentMatrix.get(row).get(col) > 0) // if edge to
//				{ // another,
//					isEdge = true;
//					break; // this vertex
//				} // has a successor
//			} // try another
//			if (!isEdge) // if no edges,
//				return row; // has no successors
//		}
//		return -1; // no such vertex
//	} // end noSuccessors

//	public void deleteVertex(int delVert) {
//		if (delVert != vertexList.size() - 1) { // if not last vertex,
//			for (int j = delVert; j < vertexList.size() - 1; j++) {
//				vertexList.set(j, vertexList.get(j + 1));
//			}
//			// delete row from adjMat
//			for (int row = delVert; row < vertexList.size() - 1; row++) {
//				moveRowUp(row);
//			}
//			// delete col from adjMat
//			for (int col = delVert; col < vertexList.size() - 1; col++) {
//				moveColLeft(col);
//			}
//		}
//	}

//	private void moveRowUp(int row) {
//		for (int col = 0; col < adjacentMatrix.size(); col++) {
//			adjacentMatrix.get(row).set(col, adjacentMatrix.get(row+1).get(col));
//		}
//	}

	// -------------------------------------------------------------
//	private void moveColLeft(int col) {
//		for (int row = 0; row < adjacentMatrix.size(); row++) {
//			adjacentMatrix.get(row).set(col, adjacentMatrix.get(row).get(col+1));
//		}
//	}

	// Not Correct
	// Need to fix
//	public void flyodWarshall() {
//		int size = adjacentMatrix.size();
//		int[][] dist = new int[size][size];
//		
//		for (int k = 0; k < adjacentMatrix.size(); k++) 
//        { 
//            // Pick all vertices as source one by one 
//            for (int i = 0; i < adjacentMatrix.size(); i++) 
//            { 
//                // Pick all vertices as destination for the 
//                // above picked source 
//                for (int j = 0; j < adjacentMatrix.size(); j++) 
//                { 
//                    // If vertex k is on the shortest path from 
//                    // i to j, then update the value of dist[i][j] 
//                    if (dist[i][k] + dist[k][j] < dist[i][j]) 
//                        dist[i][j] = dist[i][k] + dist[k][j]; 
//                } 
//            } 
//        } 
//	}
}
