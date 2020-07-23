package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchImpl<T extends Comparable<T>> {

	Graph<T> bfs;
	Queue<Vertex<T>> bfsQueue ;
	
	public BreadthFirstSearchImpl(Graph<T> root) {
		bfs = root;
		bfsQueue = new LinkedList<Vertex<T>>();
	}
	
	public void doBFS() {
		bfs.vertexList.get(0).isVisited = true;
		bfsQueue.offer(bfs.vertexList.get(0));//a
		System.out.println(bfs.vertexList.get(0).item);
		
		while(!bfsQueue.isEmpty()) {
			Vertex<T> current = bfsQueue.peek();
			int index = bfs.vertexList.indexOf(current);
			int vertexIndex = bfs.getAdjUnvisitedVertex(index);
			if(vertexIndex == -1)
				bfsQueue.poll();
			else {
				bfs.vertexList.get(vertexIndex).isVisited = true;
				bfsQueue.offer(bfs.vertexList.get(vertexIndex));
				System.out.println(bfs.vertexList.get(vertexIndex).item);
			}
		}
	}
}
