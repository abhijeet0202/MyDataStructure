package Graph;

import java.util.Stack;

/**
 * Depth-First-Search uses a stack to remember where it should go, if it reached
 * to dead-end. In DFS we used to get as far away from the starting point as
 * quickly as possible and return only when it reached a dead end. If we use the
 * term DEPTH to mean distance from the starting point.
 * 
 * Rules: Rule 1: If possible, visit an adjacent unvisited vertex, mark it, and
 * push it on the stack. Rule 2: If you can’t follow Rule 1, then, if possible,
 * pop a vertex off the stack and again start Rule 1 Rule 3: If you can’t follow
 * Rule 1 or Rule 2, you’re done.
 * 
 * @author Abhijeet
 *
 * @param <T>
 */
public class DepthFirstSearchImpl {
	Graph dfs;
	Stack<Vertex> dfsStack;

	public DepthFirstSearchImpl(Graph root) {
		dfs = root;
		dfsStack = new Stack<Vertex>();
	}

	public void doDFSIterative(int row) {
		dfs.vertexList[row].wasVisited = true;
		dfsStack.push(dfs.vertexList[row]);// a
		System.out.print("Visited Iteratively:-> " + dfs.vertexList[row].item);

		while (!dfsStack.isEmpty()) {
			Vertex currentVertex = dfsStack.peek();// a
			int indexOfElement = dfs.getVertexIndex(currentVertex.item);
			int visited = dfs.getAdjUnvisitedVertex(indexOfElement);

			if (visited == -1) {
				dfsStack.pop();
			} else {
				dfs.vertexList[visited].wasVisited = true;
				dfsStack.push(dfs.vertexList[visited]);
				System.out.print("-> " + dfs.vertexList[visited].item);
			}
		}

	}
	
	public void doDFSRecursion(int row) {
		if (dfs.vertexList[row].wasVisited) {
			return;
		}
		dfs.vertexList[row].wasVisited = true;
		System.out.print("-> " + dfs.vertexList[row].item);

		for (int column = 0; column < dfs.adjacentMatrix.length; column++) {
			if (dfs.adjacentMatrix[row][column] == 1 && dfs.vertexList[column].wasVisited == false) {
				doDFSRecursion(column);
			}
		}
	}

}
