package Graph;

import java.util.Stack;

/**
 * The result would be a graph with the minimum number of edges necessary to
 * connect the vertices.
 * 
 * @author Abhijeet
 *
 */
public class MinimumSpanningTreeImpl {
	Graph mst;
	Stack<Vertex> mstStack;

	public MinimumSpanningTreeImpl(Graph root) {
		mst = root;
		mstStack = new Stack<Vertex>();
	}

	public void doMinimumSpanningTreeIterative(int startIndex) {
		mst.vertexList[startIndex].wasVisited = true;
		mstStack.push(mst.vertexList[startIndex]);
		System.out.print("Visited Iteratively:-> ");

		while (!mstStack.isEmpty()) {
			Vertex vertex = mstStack.peek();
			int row = mst.getVertexIndex(vertex.item);
			int visited = mst.getAdjUnvisitedVertex(row);

			if (visited == -1) {
				mstStack.pop();
			} else {
				mst.vertexList[visited].wasVisited = true;
				mstStack.push(mst.vertexList[visited]);
				System.out.print(mst.vertexList[row].item + "->" + mst.vertexList[visited].item + ",");
			}
		}
	}

	public void doMinimumSpanningTreeRecursive(int row) {
		mst.vertexList[row].wasVisited = true;
		for (int column = 0; column < mst.adjacentMatrix.length; column++) {
			if (mst.adjacentMatrix[row][column] == 1 && mst.vertexList[column].wasVisited == false) {
				System.out.print(mst.vertexList[row].item + "->" + mst.vertexList[column].item + ",");
				doMinimumSpanningTreeRecursive(column);
			}
		}
	}
}
