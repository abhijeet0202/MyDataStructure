package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchRecursion<T extends Comparable<T>> {

	Graph<T> dfs;
	Queue<Vertex<T>> bfsQuueue;

	public BreadthFirstSearchRecursion(Graph<T> root) {
			dfs = root;
			bfsQuueue = new LinkedList<>();
		}

	public void startBFS() {
		for (int i = 0; i < dfs.adjacentMatrix.size(); i++) {
			bfsQuueue.add(dfs.vertexList.get(i));
			doBFSRecursion();
		}
	}

	public void doBFSRecursion() {
		
		if(bfsQuueue.isEmpty())return;
		
		Vertex<T> ver = bfsQuueue.poll();
		
		for (int i = 0; i < dfs.adjacentMatrix.size(); i++) {
			if (dfs.adjacentMatrix.get(i).get(dfs.vertexList.indexOf(ver)) == 1 && dfs.vertexList.get(i).isVisited == false) {
				dfs.vertexList.get(i).isVisited = true;
				System.out.println(dfs.vertexList.get(i).item);
				bfsQuueue.offer(dfs.vertexList.get(i));
			}
		}
		doBFSRecursion();
	}

}
