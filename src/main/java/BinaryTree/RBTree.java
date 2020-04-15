/**
 * 
 */
package BinaryTree;

import java.lang.management.GarbageCollectorMXBean;

/**
 * Rules: When inserting (or deleting) a new node, certain rules, must be
 * followed. If they're followed, the tree will be balanced.
 * 
 * 1> Every node is either RED or BLACK 
 * 2> The ROOT is always black. 
 * 3> If any NODE color is RED, it children MUST be BLACK. 
 * 4> Every path from the "ROOT to
 * a LEAF" or "ROOT to a NON-LEAF" MUST contain same number of BLACK NODES.
 * NULL-CHILD : New node ready to attached to a NON-LEAF(i.e. Node have only one
 * child) * The number of BLACK NODES on a path from ROOT to LEAF is called the
 * "BLACK-HEIGHT". * Another way to state RULE 4 is: BLACK-HEIGHT must be the
 * same for all paths from the root to a leaf HOWEVER, we should not bother
 * about BLACK-HEIGHT during code, RULE 4 automatically get enforced if we
 * adhere RULE1,2,3 strictly
 * 
 * PREVENTION: 1. Duplicate keys Not Allowed.
 * 
 * @author Abhijeet
 *
 */
public class RBTree<T extends Comparable<T>> {

	public RBTreeBean<T> root;
	RBTreeBean<T> current = null;;
	RBTreeBean<T> parent = null;
	RBTreeBean<T> grandParent = null;
	RBTreeBean<T> greatGrandParent = null;

	public void inOrderTraversal(RBTreeBean<T> root){
		
		if (root != null){
				inOrderTraversal(root.leftChild);
				if(root.isDeleted != true) {
					System.out.print(root.iData+"["+(root.isRed?"Red":"Black")+"]-->");
				}
				inOrderTraversal(root.rightChild);
			}
		}
	/*
	 * Representation : 
	 * 			X: we will denote as newly node ready to attach.
	 *  		C1,C2: CHILD(Sometime we interchangebly denote X, C1,C2) 
	 *  		P: Parent 
	 *  		GP: GrandParent
	 * 
	 * While insertion we need to follow strict Steps. This Steps are: 
	 * 
	 * Step1: COLOR FLIP ON THE WAY DOWN: 
	 * 		NOW, After FLIPPING COLOR, it might happen, we violate RULE 3 
	 * 		i.e. We changed P to RED , whereas  GP was also RED. 
	 * 
	 * 		SOLUTION: ROTATION RULE (i.e. STEP2/STEP3)
	 *
	 **
	 * 	Step2 : Rotations After the Node Is Inserted Possibility
	 * 	Step3 : Rotations on the Way Down
	 * 
	 * Both above(STEP2 & STEP3) working formulas are similar
	 */
	public RBTreeBean<T> insert(T element) {
		RBTreeBean<T> node = new RBTreeBean<T>(element);
		 current = root;
		 parent = null;
		 grandParent = null;
		 greatGrandParent = null;

		if (root == null) {
			root = node;
			root.isRed = false;
			return node;
		} else {
			while (true) {
				if (current.iData.compareTo(element) > 0) {
					if (current.leftChild == null) {
						current.leftChild = node;
						greatGrandParent = grandParent;
						grandParent = parent;
						parent = current;
						current = current.leftChild;
						rotate(current,parent,grandParent,greatGrandParent);
						return current;
					} else {
						doColorFlipOnTheWayDown(current,parent,grandParent,greatGrandParent);
						greatGrandParent = grandParent;
						grandParent = parent;
						parent = current;
						current = current.leftChild;
					}
				} else {
					if (current.rightChild == null) {
						current.rightChild = node;
						greatGrandParent = grandParent;
						grandParent = parent;
						parent = current;
						current = current.rightChild;
						//There could be violiatio of Rules
						rotate(current,parent,grandParent,greatGrandParent);
						return current;
					} else {
						doColorFlipOnTheWayDown(current,parent,grandParent,greatGrandParent);
						greatGrandParent = grandParent;
						grandParent = parent;
						parent = current;
						current = current.rightChild;
					}
				}
			}

		}
	}
	
	/*
	 * COLOR FLIP ON THE WAY DOWN: 
	 * 
	 * 		1. When ever during insertion, if any time  we find Black Parent (P) and 2 RED Child C1, C2 we need to flip the colors,
	 * 			means P will be RED and both child C1 and C2 will be BLACK. 
	 * 		2 If in case PARENT is root, only flip the color of both child i.e RED to BLACK, now
	 * 			parent as well both child will be BLACK.
	 * 
	 * 		3. NOW, After FLIPPING COLOR, it might happen, we violate RULE 3 i.e. current
	 * situation P is RED and GP is also RED. SOLURUON: ROTATION RULE
	 **/
	private void doColorFlipOnTheWayDown(RBTreeBean<T> current, RBTreeBean<T> parent, RBTreeBean<T> grandParent, RBTreeBean<T> greatGrandParent) {
		if(current !=null && current.leftChild != null && current.rightChild != null) {
			if (current.isRed == false && current.leftChild.isRed == true && current.rightChild.isRed == true) {
				// Entered As violation of Rule 2
				current.leftChild.isRed = false;
				current.rightChild.isRed = false;
				if (current != root) {
					// Exemption: If current is NOT root, then change color to BLACK
					current.isRed = true;
					// Sometimes the flip causes a red-red conflict (a violation of Rule 3).So
					// rotate and rectify
					rotate(current, parent, grandParent, greatGrandParent);
				}

			}
		}
	}
	/*
	 * PreRequisite:
	 * OUTSIDE GRANDCHILD: Node X(i.e. current) is an outside grand child if it’s on the same side of its parent P 
	 * and P is also on same side of its GrandParent.
	 * 		G							G
	 * 		 \							/
	 * 		  \						   /
	 * 	       P		OR 			  P
	 * 		    \					 /
	 * 			 \					/
	 * 			  X                X
	 * INSIDE GRANDCHILD:
	 * 		X							 X
	 * 		 \							/
	 * 		  \						   /
	 * 	       P		OR 			  P
	 * 		   / 					  \
	 * 		  / 				       \	
	 * 		 G                          G
	 * 
	 * FORMULA(How to Proceed)
	 * 1. P is black.
	 * 2. P is red and X is an outside grandchild of G.
	 * 3. P is red and X is an inside grandchild of G.
	 */
	private void rotate(RBTreeBean<T> current,RBTreeBean<T> parent, RBTreeBean<T> grandParent, RBTreeBean<T> greatGrandParent) {
		if(grandParent != null && parent !=null && current !=null) {
		if(parent.isRed != false && ((current ==parent.leftChild && parent == grandParent.leftChild) || 
				(current == parent.rightChild && parent == grandParent.rightChild))) {
			//SITUATION 2 : P is red and X is an outside grand child of G.
			
			//STEP 1: Switch the color of X’s grandparent
			if( grandParent.isRed == true) {
				grandParent.isRed = false;
			}else {
				grandParent.isRed = true;
			}
			//STEP2: Switch the color of X’s parent P
			parent.isRed = false;
			
			//STEP3: Place GP as right child of P, and Attach P with that node on which earlier GP was attached i.e GREATGRANDPARENT
			rotateSecond(current, parent, grandParent, greatGrandParent);
				
		}else if (parent.isRed != false) {
			//SITUATION 3  :P is red and X is an inside grandchild of G.
			//STEP 1: Switch the color of X’s grandparent
			if( grandParent.isRed == true) {
				grandParent.isRed = false;
			}else {
				grandParent.isRed = true;
			}
			//STEP 2: Switch the color of X
			current.isRed = false;
			
			//STEP 3: 
			if(parent == grandParent.leftChild) {
				grandParent.leftChild = current;
				parent.rightChild = current.leftChild;
				//if (Check is REQUIRED to check placing of current and parent relation, where is sitauted)
				current.leftChild =parent;
			}else {
				grandParent.rightChild=current;
				parent.leftChild =current.rightChild;
				current.rightChild =parent;
				
			}
			
			rotateSecond(parent, current, grandParent, greatGrandParent);
		}else {
			//Parent is BLACK
		}
		}
	}
	private void rotateSecond(RBTreeBean<T> current,RBTreeBean<T> parent, RBTreeBean<T> grandParent, RBTreeBean<T> greatGrandParent) {
		if(greatGrandParent == null && grandParent ==root) {
			if(grandParent.leftChild == parent) {
				grandParent.leftChild = parent.rightChild;
				parent.rightChild =grandParent;
				root=parent;
			}else {
				grandParent.rightChild = parent.leftChild;
				parent.leftChild =grandParent;
				root=parent;
			}
			doColorFlipOnTheWayDown(parent, null, null, null);
		}else {
			if (greatGrandParent.leftChild == grandParent) {
				greatGrandParent.leftChild = parent;
				grandParent.leftChild=null;
				parent.rightChild = grandParent;
			}else {
				greatGrandParent.rightChild = parent;
				grandParent.rightChild=null;
				parent.leftChild = grandParent;
			}			
		}
	}

}
