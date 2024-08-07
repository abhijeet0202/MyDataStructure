package Graph;
/**
 *  Vertex Structure which can support Weighted, Direction or No Weighted and no Direction
 * @author Abhijeet
 *
 */
public class Vertex {

	char item;
	boolean wasVisited;
	
	public Vertex(char element) {
		this.item = element;
		this.wasVisited=false;
	}
	
	public char getItem() {
		return this.item;
	}
	
	public boolean wasVisited() {
		return this.wasVisited;
	}
}
