package BinaryTree;

class DataItem{
	int element;
	
	public DataItem(int element) {
		this.element=element;
	}
}
public class Two34TreeNode {
	
	final static int SIZE =4;
	Two34TreeNode []childArray = null;
	DataItem []dataElements =null;
	int numberOfItems;
	
	public Two34TreeNode() {
		childArray = new Two34TreeNode[SIZE];
		dataElements = new DataItem[SIZE-1];
		numberOfItems =0;
	}
	
	public boolean isLeafNode() {
		return this.childArray[0] == null? true:false;
	}
	
	public boolean isFull() {
		return this.numberOfItems == Two34TreeNode.SIZE-1?true:false;
	}
	
	public Two34TreeNode insert(DataItem dataItem) {
		dataElements[numberOfItems] = dataItem;
		numberOfItems++;
		for (int i =0;i<numberOfItems-1;i++) {
			if(dataElements[i].element > dataElements[i+1].element) {
				int temp = dataElements[i].element;
				dataElements[i].element = dataElements[i+1].element;
				dataElements[i+1].element=temp;
			}
		}
		return this;
	}
	
	public Two34TreeNode getChildNode(DataItem dataItem) {
		int i =0;
		for(i=0;i<numberOfItems-1;i++) {
			if (dataItem.element < this.dataElements[i].element) {
				return this.childArray[i];
			}
		}
			return this.childArray[i];
		
	}
	
	public int getElementIndex(DataItem dataItem) {
		for (int i =0;i<numberOfItems-1;i++) {
			if (this.dataElements[i].element == dataItem.element) {
				return i;
			}
		}
		return 0;
	}
	
}
