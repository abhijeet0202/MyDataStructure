package BinaryTree;

public class Two34TreeImpl {
	Two34TreeNode root;
	
	public Two34TreeNode insert(int element) {
		
		Two34TreeNode current = root;
		Two34TreeNode parent = null;
		DataItem dataItem = new DataItem(element);
		if(current == null) {
			current = new Two34TreeNode();
			current.dataElements[0] = dataItem;
			current.numberOfItems++;
			root = current;
			return current;
		}else {
			while(true) {
				if(current.isFull()) {
					split(current,parent);
					parent = current;
					current = current.getChildNode(dataItem);
				}else if(current.isLeafNode()){
					break;
				}else {
					parent = current;
					current = current.getChildNode(dataItem);
				}
			}
			return current.insert(dataItem);
		}
		
	}
	
	private Two34TreeNode split(Two34TreeNode current,Two34TreeNode parent) {
		Two34TreeNode newRoot = null;
		Two34TreeNode sibling = new Two34TreeNode();
		if(parent == null && current == root) {
			newRoot = new Two34TreeNode();
			root=current= newRoot;
		}else {
			newRoot = parent;
			
			
		}
		//parent or root
		newRoot.insert(current.dataElements[1]);
		for (int i = newRoot.numberOfItems;i>0;i--) {
			newRoot.childArray[i+1] = newRoot.childArray[i];
		}
		newRoot.childArray[0] = current;
		current.dataElements[1] = null;
		//Sibling
		sibling.dataElements[0] = current.dataElements[2];
		sibling.numberOfItems=1;
		newRoot.childArray[1] = sibling;
		current.dataElements[2] =null;
		//Current
		current.numberOfItems=1;
		current.childArray[2] = null;
		current.childArray[3] = null;
		
		return newRoot;
		
	}
}
