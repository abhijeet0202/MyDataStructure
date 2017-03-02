/**
 * 
 */
package BinaryTree;

/**
 * Rules:
 *  When inserting (or deleting) a new node, certain rules, must be followed.
 *  If they're followed, the tree will be balanced.
 *  
 *  1> Every node is either RED or BLACK
 *  2> The ROOT is always black.
 *  3> If any NODE color is RED, it children MUST be BLACK (although the converse isn't
 *     necessarily true).
 *  4> Every path from the "ROOT to a LEAF" MUST contain same number of BLACK NODES as in
 *     "ROOT to a NULL-CHILD".
 *  NULL-CHILD : New node ready to attached to a NON-LEAF(i.e. Node have only one child)
 *  
 *  The number of BLACK NODES on a path from ROOT to LEAF is called the "BLACK-HEIGHT".
 *  
 *  Another way to state RULE 4 is: BLACK-HEIGHT must be the same for all paths from 
 *  the root to a leaf
 *  
 *  PREVENTION:
 *  1. Duplicate keys Not Allowed.
 *  
 *  FIXING RULE VIOLATION:
 *  1. Change the color of nodes.
 *  Perform Rotations
 * @author Aryan
 *
 */
public class RBTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
