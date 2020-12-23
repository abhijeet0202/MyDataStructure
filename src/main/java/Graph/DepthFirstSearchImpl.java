package Graph;

import java.util.Stack;

/**
 * Depth-First-Search uses a stack to remember where it should go, if it reached to dead-end.
 * In DFS we used to get as far away from the starting point as quickly as possible and return only
 * when it reached a dead end.
 * If we use the term DEPTH to mean distance from the starting point.
 * 
 * Rules:
 * Rule 1: If possible, visit an adjacent unvisited vertex, mark it, and push it on the stack.
 * Rule 2: If you can’t follow Rule 1, then, if possible, pop a vertex off the stack and again start Rule 1
 * Rule 3: If you can’t follow Rule 1 or Rule 2, you’re done.
 * 
 * @author Abhijeet
 *
 * @param <T>
 */
public class DepthFirstSearchImpl<T extends Comparable<T>> {
	Graph<T> dfs;
	Stack<Vertex<T>> dfsStack ;
	
	public DepthFirstSearchImpl(Graph<T> root) {
		dfs = root;
		dfsStack = new Stack<Vertex<T>>();
	}
	
	public void doDFS() {
		dfs.vertexList.get(0).isVisited = true;
		dfsStack.push(dfs.vertexList.get(0));//a
		System.out.println(dfs.vertexList.get(0).item);
		
		while(!dfsStack.isEmpty()) {
			Vertex<T>  currentVertex = dfsStack.peek();//a
			int peekIndex = dfs.vertexList.indexOf(currentVertex);//0
			int visited = dfs.getAdjUnvisitedVertex(peekIndex);
			
			if(visited == -1) {
				dfsStack.pop();
			}else {
				dfs.vertexList.get(visited).isVisited = true;
				dfsStack.push(dfs.vertexList.get(visited));
				System.out.println(dfs.vertexList.get(visited).item);
			}
		}
		
	}
	
}
