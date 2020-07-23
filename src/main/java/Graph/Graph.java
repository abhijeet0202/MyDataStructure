package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Graph<T extends Comparable<T>> {
	ArrayList<Vertex<T>> vertexList =null;
	ArrayList<ArrayList<Integer>> adjacentMatrix = null;
	boolean isGraphDirected;
	
	
	public Graph(int size, boolean isGraphDirected) {
		vertexList = new ArrayList<Vertex<T>>(size);
		adjacentMatrix = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i <size;i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>(Collections.nCopies(size, 0));
				adjacentMatrix.add(temp);
		}
		this.isGraphDirected = isGraphDirected;
}
	
	public void addVertex(T item) {
		Vertex<T> myVertex = new Vertex<T>(item);
		vertexList.add(myVertex);
		
	}
	
	public void addEdges(int rowNum,int colNum) {
		adjacentMatrix.get(rowNum).set(colNum,1);
		if(!isGraphDirected)
			adjacentMatrix.get(colNum).set(rowNum,1);
	}
	
	public int getAdjUnvisitedVertex(int v)
	{
		for(int j=0; j<vertexList.size(); j++) {
			if(adjacentMatrix.get(v).get(j)==1 && vertexList.get(j).isVisited==false) {
				return j; // return first such vertex
			}
		}
	return -1; // no such vertices
	} //
	
	
	//TODO : Need to test and code again
	public void topologicalSorting() {
		ArrayList<T> sortedArray = new ArrayList<T>(vertexList.size());
		while(!vertexList.isEmpty()) {
			int currentVertex = noSuccesor();
			if(currentVertex == -1) {// must be a cycle
				System.out.println("ERROR: Graph has cycles");
				return;
			}
			// insert vertex label in sorted array (start at end)
			sortedArray.set(vertexList.size()-1,vertexList.get(currentVertex).item);
			deleteVertex(currentVertex); // delete vertex
			} // end while
	}
	
	private int noSuccesor() {
		boolean isEdge; // edge from row to column in adjacentMatrix
		
		for (int row = 0; row < vertexList.size(); row++) // for each vertex,
		{
			isEdge = false; // check edges
			for (int col = 0; col < vertexList.size(); col++) {
				if (adjacentMatrix.get(row).get(col) > 0) // if edge to
				{ // another,
					isEdge = true;
					break; // this vertex
				} // has a successor
			} // try another
			if (!isEdge) // if no edges,
				return row; // has no successors
		}
		return -1; // no such vertex
	} // end noSuccessors
	
	
	public void deleteVertex(int delVert) {
		if (delVert != vertexList.size() - 1) { // if not last vertex,
			for (int j = delVert; j < vertexList.size() - 1; j++) {
				vertexList.set(j, vertexList.get(j + 1));
			}
			// delete row from adjMat
			for (int row = delVert; row < vertexList.size() - 1; row++) {
				moveRowUp(row);
			}
			// delete col from adjMat
			for (int col = delVert; col < vertexList.size() - 1; col++) {
				moveColLeft(col);
			}
		}
	}
	
	private void moveRowUp(int row) {
		for (int col = 0; col < adjacentMatrix.size(); col++) {
			adjacentMatrix.get(row).set(col, adjacentMatrix.get(row+1).get(col));
		}
	}

	// -------------------------------------------------------------
	private void moveColLeft(int col) {
		for (int row = 0; row < adjacentMatrix.size(); row++) {
			adjacentMatrix.get(row).set(col, adjacentMatrix.get(row).get(col+1));
		}
	}
	
	//Not Correct
	//Need to fix
	public void flyodWarshall() {
		int size = adjacentMatrix.size();
		int[][] dist = new int[size][size];
		
		for (int k = 0; k < adjacentMatrix.size(); k++) 
        { 
            // Pick all vertices as source one by one 
            for (int i = 0; i < adjacentMatrix.size(); i++) 
            { 
                // Pick all vertices as destination for the 
                // above picked source 
                for (int j = 0; j < adjacentMatrix.size(); j++) 
                { 
                    // If vertex k is on the shortest path from 
                    // i to j, then update the value of dist[i][j] 
                    if (dist[i][k] + dist[k][j] < dist[i][j]) 
                        dist[i][j] = dist[i][k] + dist[k][j]; 
                } 
            } 
        } 
	}
}
