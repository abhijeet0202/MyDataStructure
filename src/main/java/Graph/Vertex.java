package Graph;
/**
 * Generic Vertex Structure which can support Weighted, Direction or No Weighted and no Direction
 * @author Abhijeet
 *
 */
public class Vertex<T extends Comparable<T>> {

	T item;
	boolean isVisited;
	
	public Vertex(T element) {
		this.item = element;
		this.isVisited=false;
	}
	
	public T getItem() {
		return this.item;
	}
	
	public boolean isVisited() {
		return this.isVisited;
	}
}
