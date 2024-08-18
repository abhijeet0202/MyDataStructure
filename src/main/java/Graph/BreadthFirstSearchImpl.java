package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchImpl {

	Graph bfs;
	Queue<Vertex> bfsQueue;

	public BreadthFirstSearchImpl(Graph root) {
		bfs = root;
		bfsQueue = new LinkedList<Vertex>();
	}

	public void doBFSIterative(int row) {
		bfs.vertexList[row].wasVisited = true;
		bfsQueue.offer(bfs.vertexList[row]);// a
		System.out.print("Visited Iteratively:->" + bfs.vertexList[row].item);

		while (!bfsQueue.isEmpty()) {
			Vertex current = bfsQueue.peek();
			int index = bfs.getVertexIndex(current.item);
			int vertexIndex = bfs.getAdjUnvisitedVertex(index); 
			if (vertexIndex == -1)
				bfsQueue.poll();
			else {
				bfs.vertexList[vertexIndex].wasVisited = true;
				bfsQueue.offer(bfs.vertexList[vertexIndex]);
				System.out.print("->" + bfs.vertexList[vertexIndex].item);
			}
		}
	}
	
	public void doBFSRecursion(int row) {
		System.out.print("Visited Recursively:");
		bfsQueue.add(bfs.vertexList[row]);
		bfs.vertexList[row].wasVisited = true;
		doBFSRecursion();
	}

	public void doBFSRecursion() {
		if (bfsQueue.isEmpty())
			return;

		Vertex vertex = bfsQueue.poll();
		System.out.print("->" + vertex.item);
		int row = bfs.getVertexIndex(vertex.item);
		
		for (int column = 0; column < bfs.adjacentMatrix.length; column++) {
			if (bfs.adjacentMatrix[row][column] == 1 && bfs.vertexList[column].wasVisited == false) {
				bfs.vertexList[column].wasVisited = true;
				bfsQueue.offer(bfs.vertexList[column]);
			}
		}
		doBFSRecursion();
	}
}
