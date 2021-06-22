package Graph;

public class DepthFirstSearchRecursion<T extends Comparable<T>> {

	Graph<T> dfs;

	public DepthFirstSearchRecursion(Graph<T> root) {
		dfs = root;
	}

	public void doDFSRecursion() {
		for (int i = 0; i < dfs.adjacentMatrix.size(); i++) {
			doDFSRecursion(i);
		}
	}
	
	public void doDFSRecursion(int v) {
		for (int i = 0; i < dfs.adjacentMatrix.size(); i++) {
			if (dfs.adjacentMatrix.get(v).get(i) == 1 && dfs.vertexList.get(i).isVisited == false) {
				dfs.vertexList.get(i).isVisited = true;
				System.out.println(dfs.vertexList.get(i).item);
				doDFSRecursion(i);
			}
		}
	}

}
