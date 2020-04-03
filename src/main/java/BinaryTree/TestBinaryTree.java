package BinaryTree;

import org.junit.Assert;
import org.junit.Test;

public class TestBinaryTree {

	@Test
	public void testBlankTreeFind() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.find(27);
	}
	@Test
	public void testOneElementTreeFind() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(27);
		myTree.find(27);
	}
	
	@Test
	public void testLeftElementTreeFind() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(27);
		myTree.insert(26);
		myTree.insert(25);
		myTree.find(25);
	}
	
	@Test
	public void testRightElementTreeFind() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(25);
		myTree.insert(26);
		myTree.insert(27);
		myTree.find(27);
		
		
	}
	
	@Test
	public void testFindElementWhichIsNotPresent() {
		BinaryTree<String> myTree = new BinaryTree<String>();
		BinaryTreeBean<String> root = myTree.insert("G");//EACKFHDBG
		myTree.insert("B");
		myTree.insert("D");
		myTree.insert("A");
		myTree.insert("H");
		myTree.insert("E");
		myTree.insert("C");
		myTree.insert("K");
		myTree.insert("F");
		//myTree.find(30);
		myTree.inOrderTraversal(root);
		System.out.println();
		myTree.postOrderTraversal(root);
		System.out.println();
		myTree.preOrderTraversal(root);
	}
	
	//Delete Cases
	@Test
	public void testDeleteWithNoElementInTree() {
		BinaryTree<String> myTree = new BinaryTree<String>();
		Assert.assertNull(myTree.delete("A"));
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				2
	 * 			  /   \
	 * 			 /     \
	 * 		NULL	  NuLL
	 * 
	 * Element To Delete : 3 (Not Exist)
	 * *********************************************************************************************************************/
	@Test
	public void testDeleteWithonlyRootElementInTreeAndDeleteElementNotExist() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(2);
		Assert.assertNull(myTree.delete(3));
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				2
	 * 			  /   \
	 * 			 /     \
	 * 		NULL	  NuLL
	 * 
	 * Element To Delete : 2 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteWithOnlyRootElementInTreeAndDeleteRootElement() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(2);
		Assert.assertNotNull(myTree.delete(2));
	}
	
	
	/***********************************************************************************************************************
	 * Example:
	 * 				2
	 * 			  /   \
	 * 			 /     \
	 * 		NULL	    3
	 * 
	 * Element To Delete : 3 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteRightElementofRootNodeWhichHaveNoChild() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(2);
		myTree.insert(3);
		Assert.assertNotNull(myTree.delete(3));
	}

	/***********************************************************************************************************************
	 * Example:
	 * 				2
	 * 			  /   \
	 * 			 /     \
	 * 			1	  Null
	 * 
	 * Element To Delete : 1 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteLeftElementofRootNodeWhichHaveNoChild() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(2);
		myTree.insert(1);
		Assert.assertNotNull(myTree.delete(1));
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				2
	 * 			  /   \
	 * 			 /     \
	 * 			1	  Null
	 * 
	 * Element To Delete : 2 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteRootElemenWithOneLeftChild() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(2);
		myTree.insert(1);
		Assert.assertNotNull(myTree.delete(2));
		myTree.inOrderTraversal(myTree.root);
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				2
	 * 			  /   \
	 * 			 /     \
	 * 		  Null	    3
	 * 
	 * Element To Delete : 2 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteRootElemenWithOneRightChild() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(2);
		myTree.insert(3);
		Assert.assertNotNull(myTree.delete(2));
		myTree.inOrderTraversal(myTree.root);
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				2
	 * 			  /   \
	 * 			 /     \
	 * 		  Null	    3
	 *         		  /   \
	 * 				 /     \
	 * 		 	 Null	    5
	 * 
	 * Element To Delete : 2 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteElemenWithOneRightChild() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(2);
		myTree.insert(3);
		myTree.insert(5);
		Assert.assertNotNull(myTree.delete(3));
		myTree.inOrderTraversal(myTree.root);
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				2
	 * 			  /   \
	 * 			 /     \
	 * 		  Null	    5
	 *         		  /   \
	 * 				 /     \
	 * 		 	 	3	  Null
	 * 
	 * Element To Delete : 5 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteElemenWithOneLeftChild() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(2);
		myTree.insert(5);
		myTree.insert(3);
		Assert.assertNotNull(myTree.delete(5));
		myTree.inOrderTraversal(myTree.root);
		System.out.println();
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				5
	 * 			  /   \
	 * 			 /     \
	 * 		    3	  Null
	 *        /   \
	 * 		 /     \
	 * 	  Null	    4
	 * 
	 * Element To Delete : 3 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteLeftFromRootElemenWithOneRightChild() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(5);
		myTree.insert(3);
		myTree.insert(4);
		Assert.assertNotNull(myTree.delete(3));
		myTree.inOrderTraversal(myTree.root);
		System.out.println();
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				5
	 * 			  /   \
	 * 			 /     \
	 * 		    3	  Null
	 *        /   \
	 * 		 /     \
	 * 	    1	   Null
	 * 
	 * Element To Delete : 3 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteLeftFromRootElemenWithOneLeftChild() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(5);
		myTree.insert(3);
		myTree.insert(1);
		Assert.assertNotNull(myTree.delete(3));
		myTree.inOrderTraversal(myTree.root);
		System.out.println();
	}
	
	//Double Node Deletion	
	/***********************************************************************************************************************
	 * Example:
	 * 				8
	 * 			  /   \
	 * 			 /     \
	 * 		    6	   	10
	 *       /   \  	/   \
	 * 		/     \		/     \
	 * 	   Null	  Null Null	  Null
	 * 
	 * Element To Delete : 8 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteRootWith2Children() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(8);
		myTree.insert(6);
		myTree.insert(10);
		Assert.assertNotNull(myTree.delete(8));
		myTree.inOrderTraversal(myTree.root);
		System.out.println();
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				8
	 * 			  /   \
	 * 			 /     \
	 * 		    6	   	20
	 *       /   \  	/   \
	 * 		/     \	   /     \
	 * 	   Null	  N   18	  Null
	  				 /   \  	
	 * 				/     \		
	 * 	  		 Null	  19
	 * Element To Delete : 8 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteRootWithMultipleChildren() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(8);
		myTree.insert(6);
		myTree.insert(20);
		myTree.insert(18);
		myTree.insert(19);
		Assert.assertNotNull(myTree.delete(8));
		myTree.inOrderTraversal(myTree.root);
		System.out.println();
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				8
	 * 			  /   \
	 * 			 /     \
	 * 		    6	   	20
	 *       /   \  	/   \
	 * 		/     \	   /     \
	 * 	   Null	  N   18	  Null
	  				 /   \  	
	 * 				/     \		
	 * 	  		 Null	  Null
	 * Element To Delete : 8 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteRootWithMultipleChildren1() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(8);
		myTree.insert(6);
		myTree.insert(20);
		myTree.insert(18);
		Assert.assertNotNull(myTree.delete(8));
		myTree.inOrderTraversal(myTree.root);
		System.out.println();
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 				8
	 * 			  /   \
	 * 			 /     \
	 * 		    6	   	20
	 *       /   \  	/   \
	 * 		/     \	   /     \
	 * 	   Null	  N   18	   30
	  				 /   \     /   \ 	
	 * 				/     \	  /     \	
	 * 	  		 Null	  N  25		  35
	 * 	 					/   \     /   \ 	
	 * 					   /     \	 /     \	
	 * 	  		 		Null	 28 Null  Null
	 * Element To Delete : 20 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteRootWithMultipleChildren2() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(8);
		myTree.insert(6);
		myTree.insert(20);
		myTree.insert(18);
		myTree.insert(30);
		myTree.insert(25);
		myTree.insert(35);
		myTree.insert(28);
		Assert.assertNotNull(myTree.delete(20));
		myTree.inOrderTraversal(myTree.root);
		System.out.println();
	}
	
	/***********************************************************************************************************************
	 * Example:
	 * 									30
	 * 								  /   \
	 * 								 /     \
	 * 							    15	   	40
	 *       					   /   \  	 /   \
	 * 							  /     \	 /     \
	 * 	   						 7	    25  N  	  N
	  				 		  /   \    /   \ 	
	 * 				         /     \  /     \	
	 * 	  		            Null	N 20     28
	 * 	 							 /   \   /   \ 	
	 * 					   			/     \	 /     \	
	 * 	  		 		         Null	 23 Null  Null
	 * Element To Delete : 15 (Exist)
	 **********************************************************************************************************************/
	@Test
	public void testDeleteRootWithMultipleChildren3() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(30);
		myTree.insert(15);
		myTree.insert(40);
		myTree.insert(7);
		myTree.insert(25);
		myTree.insert(20);
		myTree.insert(28);
		myTree.insert(23);
		Assert.assertNotNull(myTree.delete(15));
		myTree.inOrderTraversal(myTree.root);
		System.out.println();
	}

	@Test
	public void Aaray() {
		BinaryTree<Integer> myTree = new BinaryTree<Integer>();
		myTree.insert(50);
		myTree.insert(25);
		myTree.insert(75);
		myTree.insert(37);
		myTree.insert(62);
		myTree.insert(84);
		myTree.insert(31);
		myTree.insert(43);
		myTree.insert(55);
		myTree.insert(92);
		
		myTree.inOrderTraversal(myTree.root);
		System.out.println();
		myTree.preOrderTraversal(myTree.root);
		System.out.println();
		myTree.postOrderTraversal(myTree.root);
		System.out.println();
	}

}
